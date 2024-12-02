-- 쿼리1_조인쿼리_연습문제.sql

use testdb;

-- 1. 제품테이블과 주문세부테이블을 조인하여 제품명별로 주문수량합과 주문금액합을 보이시오
select 제품명, sum(주문수량) as 주문수량합, sum(주문수량*주문세부.단가) as 주문금액합
from 제품 inner join 주문세부
on 제품.제품번호 = 주문세부.제품번호
group by 제품명;

-- 2. 2020년 3분기 주문내용에서 고객회사명, 주문번호, 주문일을 조회
select 고객회사명, 주문번호, 주문일
from 주문 inner join 고객
on 주문.고객번호 = 고객.고객번호
where 주문일 between '2020-07-01' and '2020-09-30'
order by 주문일;

-- 3. 주문수량이 50개 이상인 주문에서 주문번호, 제품번호, 제품명, 주문수량을 조회
select 주문번호, 주문세부.제품번호, 제품명, 주문수량
from 주문세부 inner join 제품
on 주문세부.제품번호 = 제품.제품번호
where 주문수량 >= 50
order by 주문수량;

-- 4. 마일리지등급이 A이상인 고객회사명과 등급명을 조회
select 고객회사명, 등급명
from 고객 inner join 마일리지등급
on 마일리지 between 하한마일리지 and 상한마일리지
where 등급명 in ('A','S');
-- where 하한마일리지 >= 10000;
-- 5. 영업부에 소속된 사원의 이름과 입사일, 부서명을 조회
select 이름, 입사일, 부서명
from 사원 inner join 부서
on 사원.부서번호 = 부서.부서번호
where 부서명 = '영업부';
-- 6. 2020년 4월에 발생한 주문내용에서 주문번호, 고객회사명, 사원이름, 주문일을 조회
select 주문번호, 고객.고객회사명, 사원.이름 as 사원이름, 주문일
from 주문
inner join 고객
on 주문.고객번호 = 고객.고객번호
inner join 사원
on 주문.사원번호 = 사원.사원번호
where 주문일 between '2020-04-01' and '2020-04-30'
order by 주문일;

-- 7. 마일리지 등급별로 고객수 조회
select 등급명, count(*) as 고객수 
from 고객
inner join 마일리지등급
on 마일리지 between 하한마일리지 and 상한마일리지
group by 등급명
order by 등급명;

-- 8. 주문번호 'H0249'를 주문한 고객의 모든 정보 조회
select 고객.*
from 고객
inner join 주문
on 고객.고객번호 = 주문.고객번호
where 주문.주문번호 = 'H0249';

-- 9. 2020년 4월 9일에 주문한 고객의 모든 정보 조회
select 고객.*
from 주문
inner join 고객
on 주문.고객번호 = 고객.고객번호
where 주문일 = '2020-04-09';

-- 10. 도시별로 주문금액합을 보이되 주문금액합이 많은 상위 5개 도시에 대한 결과 조회
select 도시, sum(주문수량 * 단가) as 주문금액합
from 주문
inner join 고객
on 주문.고객번호 = 고객.고객번호
inner join 주문세부
on 주문.주문번호 = 주문세부.주문번호
group by 도시
order by 주문금액합 desc 
limit 5;
