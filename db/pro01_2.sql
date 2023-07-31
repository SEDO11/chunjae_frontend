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