use testdb;
/*1. 2020년 2사분기의 주문내역을 보이시오 */
select * from 주문
where year = 2020 and quarter = 2;
	
		
/*2. 제품번호, 제품명, 재고, 재고구분을 보이시오
재고구분: 재고가 100개 이상이면 '과다재고', 10개이상이면 '적정', 나머지는 '재고부족' */
select 제품번호, 제품명, 재고, 
case (             ) then (             )
	(             ) then (             )
	else (             )
	end as 재고구분 
from 제품;

/*3. 입사한지 40개월이 지난 사원을 보이시오 */
select * from 사원
where (                      ) > 40;

/*4. 고객테이블에서 고객회사명과 전화번호를 아래 규칙에 따르도록 변경하고 변경된 컬럼
의 이름은 고객회사명2, 전화번호2로 만드시오
고객회사명2의 조건 : 기존 고객회사명의 앞 2자리를 *로 변환
전화번호2의 조건 : (02)978-1984의 형태를 02-978-1984로 변환 */
select 고객회사명, 
	concat('**',                ) as 고객회사명2,
	전화번호,
	replace(              , ')', '-') as 전화번호2
from 고객

/*5. 주문세부 테이블에서 아래 3개의 컬럼을 조건대로 만드시오
주문금액 : 주문수량 * 단가
할인금액 : 주문수량 * 단가 * 할인율
실주문금액 : 주문금액 - 할인금액 */
select 주문수량 * 단가 as 주문금액,
	(                   ) as 할인금액,
	(                   ) as 실주문금액
from 주문세부


/*6. 사원테이블에서 전체사원의 이름, 생일, 만나이(as 만나이), 입사일, 입사일수(as 입사일수), 
입사한지 500일후(as 입사500일후)의 날짜를 만드시오 */
select 이름,
	생일,
	timestampdiff(year, 생일, now()) as 만나이,
	입사일,
	(                             ) as 입사일수,
	(                             ) as 입사500일후
from 사원

/*7. 주문테이블에서 요청일보다 발송일이 7일 이상 늦은 주문내역 */
select *,
	datediff(발송일, 요청일) as 지연일수
from 주문
where (                          ); 

/*8. 고객테이블에서 아래와 같은 컬럼을 만드시오. 단, 도시구분과 마일리지구분
컬럼의 조건은 아래 조건을 따르시오
담당자명, 고객회사명, 도시, 도시구분, 마일리지, 마일리지구분
조건1(도시구분) : 특별시나 광역시는 '대도시', 나머지 도시는 '도시'로 표현
조건2(마일리지구분) : 마일리지가 100,000점 이상이면 'VVIP', 10,000점 
이상이면 'VIP', 나머지는 '일반고객'으로 표현 */
select 담당자명,
	고객회사명,
	도시,
	if((                             ),
		'대도시', '도시') as 도시구분,
	마일리지,
	case when (           ) then (        )
		when (          ) then (       )
		else '일반고객'
	end as 마일리지구분
from 고객;



/*9. 주문테이블에서 아래 컬럼을 만드시오
주문번호, 고객번호, 주문일, 주문년도, 주문분기, 주문월, 주문일, 주문요일, 
한글요일
조건1 : 한글요일은 case문을 이용하여 정수값을 '월요일'같은 한글 요일표시로 
표현 */
select 주문번호, 고객번호, 주문일,
	(            ) as 주문년도,
	(            ) as 주문분기,
	(            ) as 주문월,
	(            ) as 주문일,
	(            ) as 주문요일, 
	case (            ) when 0 then '월요일'
						when 1 then '화요일'
						when 2 then '수요일'
						when 3 then '목요일'
						when 4 then '금요일'
						when 5 then '토요일'
						when 6 then '일요일'
	end as 한글요일
from 주문