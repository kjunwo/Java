use testdb;

/* 1. 광역시 고객에 대해서 담당자직위별로 최대마일리지를 출력 
 단, 최대마일리지가 10,000점이상인 레코드만 포함 */
select 담당자직위, max(마일리지) as 최대마일리지 
from 고객
where 도시 like '%광역시%'
group by 담당자직위
having 최대마일리지 >= 10000;

/* 2. 제품테이블에서 주문년도별로 주문건수 출력 */
select year(주문일) as 주문년도, count(*) as 주문건수 
from 주문
group by year(주문일); -- 주문년도로도 가능

/* 3. 주문테이블에서 요청일보다 발송이 늦어진 주문내역이 월별로 몇건씩인지 요약하여 출력
 단,	주문월 순서대로 정렬하시오 */
 select month(주문일) as 주문월, count(*) as 주문건수
 from 주문 
 where 요청일 < 발송일
 group by month(주문일)
 order by month(주문일);
 
 
/* 4. 고객테이블에서 마일리지가 50,000점 이상인 고객은 'VIP고객', 나머지 고객은 '일반고객'으로 구분하고
 고객구분별로 고객수와 평균마일리지를 출력 */
select if(마일리지>=50000, 'VIP고객','일반고객') as 고객구분,
			count(*) as 고객수, avg(마일리지) as 편균마일리지 
from 고객
-- group by if(마일리지>=50000, 'VIP고객','일반고객');
group by 고객구분
order by 고객구분;

/* 5. 제품번호별로 주문수량합과 주문금액합을 출력 */
select 제품번호, sum(주문수량) as 주문수량합, sum(단가*주문수량) as 주문금액합
from 주문세부
group by 제품번호
order by 제품번호;

/* 6. 주문번호별로 주문된 제품번호의 목록과 주문금액합을 출력 */
select 주문번호, 제품번호, sum(단가*주문수량) as 주문금액합
from 주문세부
group by 주문번호, 제품번호
order by 주문번호, 제품번호;
-- group_concat 사용예
select 주문번호, group_concat(제품번호 order by 제품번호) as 제품번호,
		sum(단가*주문수량) as 주문금액합
from 주문세부
group by 주문번호
order by 주문번호;

/* 7. 2021년 주문내역에 대하여 고객번호별로 주문건수를 보이되, 주문건수가 많은 상위 3건의 고객 출력 */
select 고객번호, count(*) as 주문건수 
from 주문
where 주문일 between '2021-01-01' and '2021-12-31'
group by 고객번호
order by 주문건수 desc 
limit 3;

/* 8. 직위별로 사원수와 사원이름목록을 출력 */
select 직위, 이름, count(*) as 사원수
from 사원
group by 직위, 이름
order by 직위, 이름;
-- group_concat 사용예
select 직위, group_concat(이름 order by 이름) as 사원이름목록 , count(*) as 사원수
from 사원
group by 직위
order by 직위;
