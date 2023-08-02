USE shop;

create table customer(
	customerid VARCHAR(15) PRIMARY KEY, -- 고객 id
	customername VARCHAR(50) NOT NULL, -- 고객이름
	customertype VARCHAR(50) NOT NULL, -- 고객구분
	country VARCHAR(50) NOT NULL, -- 국적
	city VARCHAR(50), -- 도시
	state VARCHAR(50), -- 주
	postcode INT, -- 우편번호
	regiontype VARCHAR(50) -- 지역구분
);

INSERT INTO cusotomer VALUES('AK-10880', 'Alien kim', 'Consumer', 'South Korea', 'Seoul', 'Seoul', 18517, 'West');

-- kim 씨 사람 구하기
SELECT * FROM cusotomer WHERE customername LIKE '%kim%' AND city='Seoul';

-- kim이 들어가는 인원 수 구하기
SELECT COUNT(*) FROM cusotomer WHERE customername LIKE '%kim%';

-- 테이블의 컬럼 구조 보기
DESC cusotomer;

-- customerid='AK-10880' 에서  country='America', city='Los Angels', state='Los Angels' 로 변경
UPDATE customer SET country='America', city='Los Angels', state='Los Angels' WHERE customerid='AK-10880';

-- 웹에서 사용 할때
UPDATE customer SET country=?, city=?, state=? WHERE customerid='AK-10880';

SELECT * FROM buy;

-- customerid 별로 그룹화 하여 customerid, 제품거래건수, 총수량, 평균 할인율을 출력
SELECT customerid, COUNT(productid) AS '제품거래건수', SUM(quantity) AS '총 수량', AVG(discount) AS '평균 할인율' 
	FROM buy GROUP BY customerid; 

-- buy 테이블에서 할인율이 가장 작은 거래정보 출력
SELECT * FROM buy 
	ORDER BY discount ASC, quantity DESC, orderdate ASC;

-- 배송일(shipdate)의 년도 별로 총 수량의 합계와 총 수량의 평균, 총 수량의 최대값을 집계하시오
SELECT YEAR(shipdate) AS '배송 년도', SUM(quantity) AS '합계', AVG(quantity) AS ' 평균', MAX(quantity) AS '최대' 
	FROM buy
	GROUP BY YEAR(shipdate)
	ORDER BY YEAR(shipdate);
	
-- 주문일의 년도와 월별로 주문수량의 합계와 평균 할인율을 집계하시오
-- date_format() 날짜를 원하는 대로 잘라서 사용 가능
SELECT date_format(shipdate, "%Y%m") AS '주문 연 월', SUM(quantity) AS '주문수량 합계', 
	AVG(discount) AS '평균 할인율' FROM buy
	GROUP BY date_format(shipdate, "%Y%m")
	HAVING SUM(quantity) != 0;

-- 제품 번호가 FUR로 시작하는 가구 종류를 구매한 고객정보 중에서 고객명 (customername), 국가 (country), 도시(city)를 
-- 출력하되, 고객 id(customerid)의 내림차순으로 하고 고객 id가 같은 경우 주문 수량의 오름차순으로
SELECT b.customername, b.country, b.city FROM buy a JOIN customer b ON a.customerid = b.customerid
	WHERE a.productid LIKE 'FUR%'
	ORDER BY a.customerid DESC, a.quantity ASC;

-- product 테이블로 부터 가격이 40 이상 인 제품을 검색하여 product2 테이블 생성
DROP TABLE product2;

CREATE TABLE product2(
	SELECT * FROM product WHERE price >= 40);
	
SELECT * FROM product2
-- product 테이블로 부터 가격이 40 미만 인 제품을 검색하여 product3 테이블 생성
DROP TABLE product3;

CREATE TABLE product3(
	SELECT * FROM product WHERE price < 40);

-- 가격이 0이하 인것들 제거
DELETE FROM product3 WHERE price <= 0;

SELECT * FROM product3

-- \" 따옴표로 시작하는 제품 이름 찾기
SELECT * FROM product2
	WHERE productname LIKE '\"%';

-- 2번째 글자부터 총 글자수에서 한글자를 뺀 자리수 까지 가져옴
UPDATE product2 SET productname = SUBSTRING(productname,2, LENGTH(productname)-1)
	WHERE productname LIKE '\"%';

-- 합집합
-- UNION - 중복 제거
-- UNION ALL - 중복 포함
CREATE VIEW uni_tab1 AS (SELECT productid, price FROM product2 UNION SELECT productid, price FROM product3);

SELECT * FROM uni_tab1;

-- 교집합
-- INTERSECT
CREATE VIEW int_tab1 AS (SELECT productid, price FROM product2 intersect SELECT productid, price FROM product3);

SELECT * FROM int_tab1;

-- 차집합
-- EXCEPT
CREATE VIEW exc_tab1 AS (SELECT productid, price FROM product EXCEPT SELECT productid, price FROM product2);

SELECT * FROM exc_tab1;

-- product2, product3 의 테이블 데이터를 합집합 하여 totpro table 생성
CREATE TABLE totpro AS (SELECT * FROM product2 UNION SELECT * FROM product3);

SELECT * FROM totpro;

-- product, product3 의 테이블 데이터를 차집합 하여 revpro table 생성
CREATE TABLE revpro AS (SELECT * FROM product EXCEPT SELECT * FROM product3);

SELECT * FROM revpro;

-- product2, product 의 테이블 데이터를 교집합 하여 hotpro table 생성
CREATE TABLE hotpro AS (SELECT * FROM product INTERSECT SELECT * FROM product2);

SELECT * FROM hotpro;

-- 트랜잭션
USE shop;

DROP TABLE inven;

-- 재고 테이블
CREATE TABLE inven(
	ino INT PRIMARY KEY AUTO_INCREMENT,
	pid VARCHAR(20), 
	qty INT);

-- 판매 테이블
CREATE TABLE sale(
	sno INT PRIMARY KEY AUTO_INCREMENT,
	pid VARCHAR(20),
	qty INT);

SHOW TABLES;

-- 입고
INSERT INTO inven(pid, qty) VALUES("a001", 12);
INSERT INTO inven(pid, qty) VALUES("b001", 25);
INSERT INTO inven(pid, qty) VALUES("c001", 18);

INSERT INTO inven(pid, qty) VALUES("a001", 11);
INSERT INTO inven(pid, qty) VALUES("b001", 19);
INSERT INTO inven(pid, qty) VALUES("c001", 14);

SELECT * FROM inven;

-- 재고 확인 뷰
DROP VIEW pro1_view;
CREATE VIEW pro1_view AS (SELECT pid, SUM(qty) AS'재고 합계' FROM inven GROUP BY pid);

SELECT * FROM pro1_view;

INSERT INTO inven(pid, qty) VALUES("a001", 24);

SELECT * FROM pro1_view;


START TRANSACTION; -- 트랜잭션 시작

SAVEPOINT a; -- save

-- 판매
INSERT INTO sale(pid, qty) VALUES("a001", 5);

UPDATE inven SET qty=qty-5 
	WHERE pid="a001" 
	AND ino=(SELECT MIN(ino) FROM inven 
					WHERE pid="a001" 
					GROUP BY pid);

SELECT * FROM inven;

COMMIT;

ROLLBACK;

ROLLBACK a;

CREATE TABLE student(
	sno INT PRIMARY KEY AUTO_INCREMENT,
	sname VARCHAR(100),
	kor INT,
	eng INT,
	mat INT);

-- 5명의 학생 성적 데이터를 추가
INSERT INTO student(sname, kor, eng, mat) VALUES("김기태", 80, 70, 60);
INSERT INTO student(sname, kor, eng, mat) VALUES("강감찬", 75, 85, 95);
INSERT INTO student(sname, kor, eng, mat) VALUES("이순신", 55, 45, 35);
INSERT INTO student(sname, kor, eng, mat) VALUES("홍길동", 65, 60, 67);
INSERT INTO student(sname, kor, eng, mat) VALUES("일지매", 78, 76, 73);

SELECT * FROM student;

SELECT sname, (kor+eng+mat) AS '총점', ((kor+eng+mat)/3) '평균' FROM student;

-- ROUND 실수를 정수로
SELECT sname, (kor+eng+mat) AS '총점', ROUND((kor+eng+mat)/3) '평균', 
	if(((kor+eng+mat)/3)>=80,'합격','불합격') AS "pan" FROM student;

-- case 문
SELECT sname, (kor+eng+mat) AS '총점', ROUND((kor+eng+mat)/3) '평균', 
	if(((kor+eng+mat)/3)>=80,'합격','불합격') AS "pan",
	case
		when ROUND((kor+eng+mat)/3) >= 90 then "A"
		when ROUND((kor+eng+mat)/3) >= 80 then "B"
		when ROUND((kor+eng+mat)/3) >= 70 then "C"
		when ROUND((kor+eng+mat)/3) >= 60 then "D"
		ELSE "F"
	end AS "hak" FROM student;