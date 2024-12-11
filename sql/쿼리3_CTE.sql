-- 쿼리3_CTE.sql

use testdb;

-- CTE(Common Table Expression)
-- 임시결과 집합을 정의하여 쿼리에서 재사용할 수 있는 기능
-- WITH 키워드를 사용
-- 조인쿼리나 서브쿼리와 완전히 다른 형태라기보다 복잡한 쿼리를 가독성과 재사용성을 용이하게 만든 표현방식
-- 조인쿼리와 서브쿼리의 단점을 보완하는 도구!!
/* 언제 사용하는가??
   1) 복잡한 서브쿼리를 대체
   2) 동일 서브쿼리를 여러번 사용할 경우, 중복쿼리를 대체
   3) 쿼리의 가독성을 높이고 싶을때 
 */

-- 서브쿼리의 중복
-- 고객별로 주문한 평균 금액을 구한 후, 그 값이 100,000원을 초과하는 고객만 조회
select 고객.고객번호, 고객회사명,
	(select avg(단가*주문수량) from 주문세부
	 join 주문 on 주문세부.주문번호 = 주문.주문번호
	 where 주문.고객번호 = 고객.고객번호) as 평균주문금액
from 고객
where (select avg(단가*주문수량) from 주문세부
	 join 주문 on 주문세부.주문번호 = 주문.주문번호
	 where 주문.고객번호 = 고객.고객번호) > 100000;

-- 위 서브쿼리의 중복을 CTE로 해결
with 평균주문정보 as (
	select 주문.고객번호, avg(단가*주문수량) as 평균주문금액
	from 주문 join 주문세부
	on 주문.주문번호 = 주문세부.주문번호
	group by 주문.고객번호
)
select 고객.고객번호, 고객회사명,평균주문정보.평균주문금액
from 고객 join 평균주문정보
on 고객.고객번호 = 평균주문정보.고객번호
where 평균주문정보.평균주문금액 > 100000;

-- 실무에서는 아래의 경우처럼 select 쿼리를 반복해서 사용하는 경우도 있음
select 고객.고객번호, 고객회사명, (
	select sum(단가*주문수량) from 주문세부
	join 주문 on 주문세부.주문번호 = 주문.주문번호
	where 주문.고객번호 = 고객.고객번호
) as 총주문액
from 고객;

select 고객.고객번호, 담당자명, 담당자직위, (
	select sum(단가*주문수량) from 주문세부
	join 주문 on 주문세부.주문번호 = 주문.주문번호
	where 주문.고객번호 = 고객.고객번호
) as 총주문액
from 고객;

-- 위 서브쿼리의 중복을 CTE로 해결할 수 있으나, 
-- mysql은 with절(CTE)를 여러 select절이 공유할 수 있는 방법이 없는듯 함(?)
-- with절이 바로 아래에 있는 select절에만 적용됨
with 주문총액 as (
	select 주문.고객번호, sum(단가*주문수량) as 총주문액
	from 주문
	join 주문세부 on 주문.주문번호 = 주문세부.주문번호
	group by 주문.고객번호
)
select 고객.고객번호, 고객회사명, 주문총액.총주문액
from 고객
join 주문총액 on 고객.고객번호 = 주문총액.고객번호; -- 정상동작

select 고객.고객번호, 담당자명, 담당자직위, 주문총액.총주문액
from 고객
join 주문총액 on 고객.고객번호 = 주문총액.고객번호; -- with절이 없어서 에러

-- 그러므로 이런 경우에는 CTE대신 View를 생성해서 해결 가능!
-- View는 한번 실행하면 데이터베이스에 그 정의가 영구적으로 저장됨
-- 하지만 실제 데이터는 저장되지 않으므로 해당 뷰를 참조할때마다 새롭게 계산됨
-- 성능적인 이점은 미비하나 가독성, 코드재사용성, 유지보수차원에서 큰 이점이 있음
create view 주문총액뷰 as (
	select 주문.고객번호, sum(단가*주문수량) as 총주문액
	from 주문
	join 주문세부 on 주문.주문번호 = 주문세부.주문번호
	group by 주문.고객번호
); -- 별도로 실행시켜야 함. 한번 실행시키면 데이터베이스에 저장됨.

select 고객.고객번호, 고객회사명, 주문총액뷰.총주문액
from 고객
join 주문총액뷰 on 고객.고객번호 = 주문총액뷰.고객번호; -- 정상동작

select 고객.고객번호, 담당자명, 담당자직위, 주문총액뷰.총주문액
from 고객
join 주문총액뷰 on 고객.고객번호 = 주문총액뷰.고객번호; -- 정상동작