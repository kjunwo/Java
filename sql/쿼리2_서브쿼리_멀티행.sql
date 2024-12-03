-- 쿼리2_서브쿼리_멀티행.sql

use testdb;

-- 멀티행(=복수행) 서브쿼리는 결과가 여러 행으로 나오는 쿼리를 의미함
-- 쿼리의 결과가 여러개이므로 '=' 연산자로 처리가 불가능하므로 여러 비교연산자가 필요함
-- <in, all, any, exists, some> 등이 사용됨

-- #1. IN
-- 부산광역시 고객이 주문한 주문건수
select count(*) as 주문건수
from 주문
where 고객번호 in (select 고객번호 from 고객 where 도시 = '부산광역시');

-- #2.ANY, SOME
-- 부산광역시 전체고객의 마일리지보다 마일리지가 큰 고객의 정보
-- 서브쿼리의 결과값중 어느 하나보다만 크면 선택(즉, 최소값보다 크면 선택)
select 담당자명, 고객회사명, 마일리지
from 고객
where 마일리지 > any (select 마일리지 from 고객 where 도시 = '부산광역시');

select 담당자명, 고객회사명, 마일리지
from 고객
where 마일리지 > some (select 마일리지 from 고객 where 도시 = '부산광역시');

-- #3. ALL
-- 각 지역의 어느 평균 마일리지보다도 마일리지가 큰 고객의 정보
-- 서브쿼리의 결과값중 최대값보다 크면 선택
select 담당자명, 고객회사명, 마일리지
from 고객
where 마일리지 > all (select avg(마일리지) from 고객 group by 지역);

-- #4. EXISTS
-- 한번이라도 주문한적이 있는 고객의 정보
select 고객번호, 고객회사명
from 고객
where exists (select * from 주문 where 고객.고객번호 = 주문.고객번호);

-- in 연산자를 이용하여 동일한 결과를 얻을 수 있음
select 고객번호, 고객회사명
from 고객
where 고객번호 in (select 고객번호 from 주문);
-- distinct가 없어도 동일한 결과가 나오지만 중복비교를 하게되므로 사용하는것이 좋음
