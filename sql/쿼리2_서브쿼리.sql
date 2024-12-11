-- 쿼리2_서브쿼리.sql

use testdb;

-- 가장 많은 마일리지를 고유한 고객 조회
-- #1.일반적인 쿼리
select 고객번호, 고객회사명, 마일리지
from 고객
order by 마일리지 desc
limit 1;

-- #2.서브쿼리
select 고객번호, 고객회사명, 마일리지
from 고객
where 마일리지 = (select max(마일리지)from 고객);
-- where 마일리지 = 128790

/***** 서브쿼리가 사용되는 위치에 따라 3종류로 나눌 수 있음 *****/

-- #1. where절
-- 주문번호 'H0249'를 주문한 고객의 모든 정보 조회
-- join쿼리
select 고객.*
from 고객 inner join 주문
on 고객.고객번호 = 주문.고객번호
where 주문.주문번호 = 'H0249';
-- 서브쿼리
select 고객.*
from 고객
where 고객번호 = (select 고객번호 from 주문 where 주문번호 = 'H0249');
-- where 고객.고객번호 = (주문테이블에서 주문번호가 'H0249'인 고객번호)

-- #2. from절
-- 담당자명, 고객회사명, 마일리지, 도시, 해당도시의 평균마일리지 조회
select 담당자명, 고객회사명, 마일리지, 고객.도시, 해당도시평균마일리지
from 고객
inner join (select 도시, avg(마일리지) as 해당도시평균마일리지
from 고객 
group by 도시) as 도시요약 -- 인라인뷰의 별칭(서브쿼리로 만들어지는 임시 테이블)
on 고객.도시 = 도시요약.도시;

-- 도시별 평균마일리지를 조회하는 서브쿼리 
-- from절에 사용하는 서브쿼리의 결과로 임시테이블이 생성됨
-- 이러한 임시테이블을 인라인뷰라고 함!!
-- 인라인뷰는 반드시 별칭을 붙여줘야 한다.**
select 도시, avg(마일리지) as 해당도시평균마일리지
from 고객
group by 도시;

-- #3. select절
-- 고객번호, 담당자명, 고객의 최종주문일 조회
-- 하나의 컬럼 값만 반환하는 서브쿼리를 스칼라 서브쿼리(Scalar SubQuery)
-- select절에 사용되는 서브쿼리는 모두 스칼라 서브쿼리임!
select 고객번호, 담당자명, 
	(select max(주문일)from 주문 where 주문.고객번호 = 고객.고객번호) as 최종주문일
from 고객;

-- 위 쿼리를 from절의 서브쿼리로 변경하면?? (인라인뷰 방식)
select 고객.고객번호, 담당자명, 최종주문.최종주문일
from 고객
left outer join (select 고객번호, max(주문일) as 최종주문일
from 주문
group by 고객번호) as 최종주문 -- 인라인뷰에는 반드시 별칭이 필요함 
on 고객.고객번호 = 최종주문.고객번호;

-- 위 쿼리를 일반적인 조인쿼리로 변경하면??
select 고객.고객번호, 담당자명, max(주문일) as 최종주문일 
from 고객
left outer join 주문
on 고객.고객번호 = 주문.고객번호
group by 고객.고객번호, 담당자명;

-- Having절에도 서브쿼리를 사용할 수 있음. 단, 사용원리가 where절과 유사하므로 따로 다루지 않음
-- 고객 전체의 평균마일리지보다 평균마일리지가 큰 도시
select 도시, avg(마일리지) as 평균마일리지
from 고객
group by 도시
having avg(마일리지) > (select avg(마일리지) from 고객);




