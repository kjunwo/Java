-- DML.sql

use testdb;

-- insert into 테이블명 values(값1, 값2, ....);
-- 전체 행을 기록하는 경우
insert into 부서 values('A5', '마케팅부'); -- 컬럼순서대로 작성

insert into 제품 values(91, '연어피클소스', null, 5000, 40);

-- 컬럼명을 지정해서 기록하는 경우
insert into 제품(제품번호, 제품명) values(92, '삼양짱구');

-- 여러 행의 데이터를 한번에 입력
insert into 사원(사원번호, 이름, 직위, 성별, 입사일)
	values('E20', '김사과', '수습사원', '남', curdate()),
	      ('E21', '박딸기', '수습사원', '여', curdate()),
		  ('E22', '정오렌지', '수습사원', '여', curdate());
		  
-- # update 테이블명 set 컬럼1=값1, 컬럼2=값2, ... where 조건
update 사원 
set 이름 = '김레몬'
where 사원번호 = 'E20'; -- where 조건없으면 해당 컬럼의 값이 모두 변경됨

update 제품
set 포장단위 = '200ml bottles'
where 제품번호 = 91;

-- 여러 컬럼의 값을 한번에 수정
update 제품
set 단가 = 단가*1.1, 재고 = 재고-10
where 제품번호 = 91;

-- # delete from 테이블명 where 조건
-- 기본키(PK)를 이용한 삭제
delete from 제품 where 제품번호 = 91;

-- 조건을 이용한 삭제
-- 가장 최근 입사자 3명 데이터 삭제
delete from 사원
order by 입사일 desc 
limit 3;











