use testdb;

-- 담당자직위가 영업과장인 고객
select * from 고객
where 담당자직위 = '영업 과장';

-- 마일리지가 5000이상이고 도시가 서울특별시인 고객
select * from 고객
where 마일리지 >= 5000 and 도시 = '서울특별시';

-- 담당자직위가 영업 과장이거나 마케팅 과장인 고객의 고객번호, 담당자명, 담당자직위를 조회
select 고객번호, 담당자명, 담당자직위 from 고객
where 담당자직위 = '영업 과장' or 담당자직위 = '마케팅 과장';

select 고객번호, 담당자명, 담당자직위 from 고객
where 담당자직위 in ('영업 과장', '마케팅 과장');

-- 마일리지가 100,000점이상 200,000점 이하인 고객의 담당자명, 마일리지 조회
select 담당자명, 마일리지 from 고객
where 마일리지 >= 100000 and 마일리지 <= 200000;

select 담당자명, 마일리지 from 고객
where 마일리지 between 100000 and 200000;
-- between and는 이상(>=),이하(<=)만 해당됨

-- 주문테이블에서 주문일이 2020년 3월인 정보만 조회
select * from 주문
where 주문일 between '2020-03-01' and '2020-03-31';

-- 고객테이블에서 고객번호가 A~D 사이인 고객 정보
select * from 고객
where 고객번호 between 'A' and 'E';

-- >=, <=, > <, =, !=는 자바와 동일
-- '<>'는 '!='와 같은 의미
-- 담당자가 대표이사가 아닌 고객의 모든 정보
select * from 고객
where 담당자직위 <>'대표 이사';
select * from 고객
where 담당자직위 !='대표 이사';

-- NULL 개념(알수없는 값 unknown value)
-- 데이터베이스에서 NULL은 특별한 값을 취급함. 반드시 NULL을 입력해야함
-- ''빈 문자열은 NULL이 아님
select * from 고객
where 지역 is null;
-- NULL인 값을 찾을 때는 = null 을 사용하지 않고 is null 임

select * from 고객
where 지역 is not null; 
-- is null의 반대는 is not null

select * from 고객
where 지역 = '';
-- null과 ''빈문자열은 다른 값

-- 담당자명이 '최'로 시작하는 (=성이 최씨인) 고객 정보
select * from 고객
where 담당자명 like '최%';

-- like 연산자는 특정 문자열이 지정된 패턴과 일치하는지 확인할때 사용함. 보통 와일드카드 문자와 함께 사용
-- '%' 0개 이상의 문자를 가진 문자열을 포함
-- '_' 정확히 한개의 문자를 포함

select * from 고객
where 담당자명 like '최_'; -- 최씨이면서 이름이 한글자인 사람
select * from 고객
where 담당자명 like '최__';
select * from 고객
where 담당자명 like '강_';
select * from 고객
where 담당자명 like '_덕_';
select * from 고객
where 담당자명 like '%영';
select * from 고객
where 도시 like '%대전%'; -- %는 0개 이상의 문자열이므로 대전%와 같은 의미
select * from 고객
where 도시 like '대전%';
select * from 고객
where 도시 like '%광역시';
select * from 고객
where 도시 not like '%광역시';
select * from 고객
where 주소 like '%대치동%';
select * from 고객
where 전화번호 like '%1431';

-- 데이터의 자리수가 고정이 컬럼의 경우에는 '_'사용이 용이하고 활용도가 높음
select * from 고객
where 고객번호 like '___N_'; 
select * from 고객
where 고객번호 like '%N_'; 
-- 고객번호 세번째가 C인 고객
select * from 고객
where 고객번호 like '__C%';

-- 마일리지가 가장 많은 고객 정보
select * from 고객
order by 마일리지 desc
limit 1;

-- 마일리지가 가장 적은 고객 정보
select * from 고객
order by 마일리지
limit 1;



