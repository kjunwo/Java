-- 함수1_문자열함수.sql

use testdb;

-- char_length 문자의 개수
-- length 바이트 수
select char_length('hello'); -- 5
select length ('hello'); -- 5
select char_length('안녕'),length ('안녕');-- 2, 6

-- concat 문자열 연결
-- concat_ws 문자열을 구분자와 함께 연결 (ws = with separator)
select concat('꿈은', '이루어진다');
select concat_ws('-', '2024','11','27');
 
-- left 문자열의 왼쪽부터 몇개
-- right 문자열의 오른쪽부터 몇개
-- substr 문자열의 몇번째부터 몇개
select left ('SQL 공부', 3),
        right ('SQL 공부',2),
        substr('SQL 공부',3, 4),
        substr('SQL 공부',5); 

-- substring_index
-- 구분자를 만날때까지 문자열을 잘라냄. 인덱스는 몇번째 구분자를 만날때까지 자를지 결정
-- 만약 인덱스가 음수값이면 오른쪽에서 자름
select substring_index('서울시 동작구 흑석동', ' ', 1); -- 서울시      
select substring_index('서울시 동작구 흑석동', ' ', 2); -- 서울시 동작구
select substring_index('서울시 동작구 흑석동', ' ', -1); -- 흑석동
select substring_index('서울시 동작구 흑석동', ' ', -2); -- 동작구 흑석동
-- 동작구만 자르고 싶으면????
-- '서울시 동작구'만 자른 다음에 -1 인덱스를 사용하며 오른쪽에서 자름
select substring_index(substring_index('서울시 동작구 흑석동',' ',2),' ',-1); 

-- ltrim 왼쪽공백 제거
-- rtrim 오른쪽공백 제거
-- trim 양쪽공백 제거
select ltrim('    sql'),rtrim('sql    '),trim('  sql  '); 

-- lpad 채우기, 지정한 길이내에서 문자열을 제외한 나머지를 주어진 문자로 왼쪽부터 채움
-- rpad 
select lpad('sql', 10, '#'),rpad('sql', 5, '*'); 

-- field 문자열의 위치를 찾음
-- field (찾는문자열, 문자열1, 문자열2, 문자열3, .....)
-- find_in_set 문자열 리스트에서 지정한 문자열을 찾음
-- find_in_set (찾는 문자열, 문자열리스트)
select field('java', 'sql','java', 'javascript'); -- 2 
select find_in_set('java', 'sql,java,javascript'); -- 2
 
-- locate 기준문자열에서 부분문자열의 위치를 찾음
-- locate (부분문자열, 기준문자열)
select locate('world', 'hello world'); -- 7
select locate('hi', 'hello world'); -- 0

-- elt 지정한 위치에 있는 문자열을 반환
select elt(2, 'sql', 'java', 'javascript'); -- java

-- repeat 문자열의 반복
select repeat('*', 5);

-- replace 문자열의 일부를 다른 문자열로 대체
-- replace (대상문자열, 바꿀문자열, 바뀔문자열)
select replace('010 1234 5678', ' ', '-'); 
select replace('2024/11/27','/','.');

-- reverse 문자열 거꾸로 바꿈
select reverse('hello'); 

