-- 제약조건.sql

/* 데이터베이스에는 무결점의 데이터가 필수(= 무결성의 원칙)
테이블에 아무런 제약사항을 두지 않으면 적합하지 않은 데이터가 저장되고
그렇게되면 무결성의 원칙에 위배됨!
반드시 제약조건을 설정해야하는 이유임*/

create database test2
	char set utf8mb4 collate utf8mb4_general_ci;
	
use test2;

/* 제약조건의 종류
primary key : 기본키, PK
noy null : 반드시 값이 필수
unique : 유일한 값 보장
check : 설정된 조건에 맞는 값만 저장
default : 값을 안넣으면 자동으로 기본값을 저장
foreign key : 외래키, FK
auto_increment : 숫자형 값의 자동증가
*/

/* primary key와 unique의 차이점
Pk : 테이블의 각 행을 고유하게 식별하는 컬럼. 테이블당 오직 한개만 가능.
	 자동으로 unique와 not null 속성을 가짐. 인덱스를 자동 생성
unique : 테이블에서 교유한 값 보장. null 속성 가짐.
		 인덱스를 자동 생성X, 테이블내에서 여러 개의 unique 컬럼을 가질 수 있음.
 */

create table 학과
(학과번호 char(2) primary key,
학과명 varchar(20) not null,
학과장명 varchar(20));

insert into 학과 values('AA', '컴퓨터공학', '김교수');
insert into 학과 values('BB', '디자인학과', null);

create table 학생
(학번 char(5) primary key,
이름 varchar(20) not null,
생일 date not null,
연락처 varchar(20) unique,
성별 char(1) not null check(성별 in ('남', '여')),
등록일 date default(curdate()));

insert into 학생(학번, 이름, 생일, 연락처, 성별)
values('S0001', 'Steve', '2000-01-01','010-2222-3333', '남');
insert into 학생(학번, 이름, 생일, 연락처, 성별)
values('S0002', 'Tom', '2000-01-01','010-4444-5555', '남');

create table 과목
(과목 char(5) primary key,
과목명 varchar(20) not null,
학점 int not null check(학점 between 2 and 4),
구분 varchar(20) not null check(구분 in('전공','교양','일반')));

create table 영화
(영화번호 char(5) primary key,
타이틀 varchar(100) not null,
장르 varchar(20) check(장르 in ('코미디', '드라마', '다큐','SF','액션', '기타')),
배우 varchar(100) not null,
감독 varchar(100) not null,
개봉일 date,
등록일 date default(curdate()));

insert into 영화
values ('MV001', 'Diablo', '액션', 'Sam', 'Sam', '1999-09-09', curdate());

create table 평점
(번호 int auto_increment primary key,
평가자닉네임 varchar(50) not null,
영화번호 char(5) not null,
평점 int not null check (평점 between 1 and 5),
평가 varchar(2000) not null,
등록일 date default (curdate()),
constraint fk_영화번호 foreign key(영화번호) references 영화(영화번호));

insert into 평점(평가자닉네임, 영화번호, 평점, 평가)
values ('Grrrr','MV001',5,'good');

insert into 평점(평가자닉네임, 영화번호, 평점, 평가)
values ('Grrrr','MV002',5,'good'); -- 에러발생. MV002라는 영화번호가 영화테이블에 없음

insert into 평점(평가자닉네임, 영화번호, 평점, 평가)
values ('HaHa','MV001',4,'so so');









