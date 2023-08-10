-- 유저 정보 db
-- 필수 항목에는 NOT NULL을 추가해주자
-- id : 아이디
-- pw : 비밀번호
-- name : 이름
-- email : 이메일
-- tel : 전화번호
-- regdate : 가입날짜, 자동기입
-- point : 포인트, 기본값
-- DROP TABLE member;

CREATE DATABASE edu;

USE edu;

CREATE TABLE member(
	id VARCHAR(16) NOT NULL,
	pw VARCHAR(330) NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	email VARCHAR(100) NOT NULL,
	tel VARCHAR(13), 
	regdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP(),
	POINT INT DEFAULT 0,
	PRIMARY KEY(id)
);

-- 테이블 목록 보기
SHOW TABLES;

-- 회원 테이블 구조 보기
DESC member;

INSERT INTO member(id, pw, NAME, email, tel) 
	VALUES('admin', '1234', '관리자', 'admin@edu.com', '010-1234-5678');

INSERT INTO member(id, pw, NAME, email, tel) 
	VALUES('hong', 'h5678', '홍길동', 'hong@edu.com', '010-1111-2222');

INSERT INTO member(id, pw, NAME, email, tel) 
	VALUES('kang', 'kang12', '강감찬', 'kang@edu.com', '010-3333-4444');

INSERT INTO member(id, pw, NAME, email, tel) 
	VALUES('son', 'sony1234', '손흥민', 'son@edu.com', '010-5555-6666');

INSERT INTO member(id, pw, NAME, email, tel) 
	VALUES('lee', 'lee4885', '이순신', 'lee@edu.com', '010-8765-4321');
	
INSERT INTO member(id, pw, NAME, email, tel) 
	VALUES('shin', 'shin4885', '신승원', 'shin@edu.com', '010-8765-1234');

-- SHA256 으로 비밀번호 암호화
UPDATE member SET pw='edee29f882543b956620b26d0ee0e7e950399b1c4222f5de05e06425b4c995e9' WHERE pw='2222';

UPDATE member SET pw='f20938899dd856a97c943d4ff0a9080a7eb81a51a95966cc15e4df9a88ce15be' WHERE pw='h5678';

UPDATE member SET pw='7aeaf53186ee4ed9d95a67a864065b92bba4b9695ee18ba265162134195149b8' WHERE pw='kang12';

UPDATE member SET pw='03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4' WHERE pw='1234';

UPDATE member SET pw='f572af08dcb6b4bae9cc8d654b1f56f95468f3673114a6d380bea8402c983e23' WHERE pw='lee4885';

UPDATE member SET pw='f280223c722f6d81ef16a6ea00b199e065ca3fc07d135afde3ec5ff4c56182b8' WHERE pw='sony1234';

SELECT * FROM member;



-- 게시판 db
-- bno : 글 번호
-- title : 글 제목
-- content : 글 내용
-- author : 작성자
-- resdate : 작성일
-- cnt : 조회수
DROP TABLE board;

CREATE TABLE board(
	bno INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(200) NOT NULL,
	content VARCHAR(1000), 
	author VARCHAR(16),
	resdate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP(),
	cnt INT DEFAULT 0);

-- 더미글 추가

SELECT * FROM board;

COMMIT;

-- 7번글의 작성자의 이름 출력
SELECT author FROM board WHERE bno = 7;

-- 이중 쿼리(select 문이 2개)
-- (=, <=, >=, !=, ...)
SELECT * FROM member WHERE id=(SELECT author FROM board WHERE bno = 7);

-- 일치 검색(IN), 글 작성한 사람들의 정보
SELECT * FROM member WHERE id IN(SELECT author FROM board);

-- 불일치 검색(NOT IN), 글을 작성하지 않은 사람들의 정보
SELECT * FROM member WHERE id NOT IN(SELECT author FROM board);

-- 글 번호가 3번 부터 6번까지 검색
SELECT * FROM board WHERE bno BETWEEN 3 AND 6; -- 모든 sql에서 사용가능
SELECT * FROM board WHERE bno LIMIT 2, 4; -- mysql, mariadb 에서만 사용 가능

-- 첫글자 h만 불러오기
SELECT * FROM board WHERE author LIKE 'h%'

-- 마지막이 g인 것만 불러오기
SELECT * FROM board WHERE author LIKE '%g'

-- 여러명 불러오기
SELECT * FROM member WHERE name IN ( '홍길동', '강감찬' );

-- 중복성 제거
SELECT DISTINCT author FROM board;

-- 해당 아이디의 데이터 제거
DELETE FROM member WHERE id='shin';

-- 글번호가 5인 게시글의 작성자를 lee로 변경
UPDATE board SET author='lee' WHERE bno=5;

SELECT * FROM board;

SELECT * FROM member a, board b;

SELECT a.id AS pid, a.NAME AS pname, a.email as pemail, b.bno AS pno , b.title AS ptitle FROM member a, board b;

-- 게시판의 글 정보를와 멤버 테이블의 정보 추출
-- 연관 쿼리
SELECT a.id, a.name, a.email, b.bno, b.title FROM member a, board b WHERE a.id = b.author;

-- join
SELECT a.id, a.name, a.email, b.bno, b.title FROM member a JOIN board b ON a.id = b.author;

-- table 복제, 값은 복제가 가능하나 key에 대한 것은 불가능
CREATE TABLE test_table AS SELECT a.id, a.name, a.email, b.bno, b.title FROM member a JOIN board b ON a.id = b.author;

SELECT * FROM test_table;

-- 기본키 추가
ALTER TABLE test_table ADD CONSTRAINT PRIMARY KEY (bno);

-- column 수정
ALTER TABLE test_table MODIFY bno int AUTO_INCREMENT;

-- view 생성
CREATE VIEW test_view AS SELECT a.id, a.name, a.email, b.bno, b.title FROM member a JOIN board b ON a.id = b.author;


-- 예제
-- 테이블 만들기 및 예시 데이터 추가

-- 테이블 명 : 상품(goods)
-- 상품코드 : gcode - int - primary key
-- 상품명 : gname - VARCHAR(150) - not null
-- 종류 : gcate - VARCHAR(40) - not null
-- 단가 : gprice - int - not null
-- 수량 : gqty - int - default : 0
-- 등록일 : regdate - date - default : timestamp

DROP TABLE goods;

CREATE TABLE goods(
	gcode INT AUTO_INCREMENT PRIMARY KEY,
	gname VARCHAR(150) NOT NULL,
	gcate VARCHAR(40) NOT NULL,
	gprice INT NOT NULL,
	gqty INT DEFAULT 0,
	regdate DATE DEFAULT CURRENT_TIMESTAMP());

-- 서적 (0xxx)
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('국어책', '0001', 20000, 100);
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('영어책', '0002', 25000, 200);
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('수학책', '0003', 18000, 300);
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('사회책', '0004', 15000, 150);
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('과학책', '0005', 15000, 150);

-- 교육 (1xxx)
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('국어교육', '1001', 40000, 500);
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('영어교육', '1002', 50000, 600);
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('수학교육', '1003', 36000, 700);
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('사회교육', '1004', 30000, 800);
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('과학교육', '1005', 30000, 800);

-- 동영상 (2xxx)
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('국어영상', '2001', 80000, 100);
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('영어영상', '2002', 100000, 100);
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('수학영상', '2003', 70000, 100);
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('사회영상', '2004', 60000, 100);
INSERT INTO goods(gname, gcate, gprice, gqty) VALUES('과학영상', '2005', 60000, 100);
SELECT * FROM goods;


-- 테이블 명 : 판매(sales)
-- 판매코드 : pcode - 정수 - primary key
-- 상품코드 : gcode - 정수 - not null
-- 구매자 : id - VARCHAR(16) - not null
-- 수량 : qty - int - default : 1 - not null
-- 구매단가 : sprice - int - not null
-- 결제수단 : stype - int - not null
-- 할인금액 : distotal - int
-- 결제 금액 : paytotal - int 
-- 총금액 : stotal - int 
-- 판매일 : saledate - date - default : timestamp

DROP TABLE sales;

CREATE TABLE sales(
	pcode INT AUTO_INCREMENT PRIMARY KEY,
	gcode INT NOT NULL,
	id VARCHAR(16) NOT NULL,
	qty INT DEFAULT 1,
	sprice INT NOT NULL,
	stype INT NOT NULL,
	distotal INT,
	paytotal INT,
	stotal INT,
	saledate DATE DEFAULT CURRENT_TIMESTAMP());

-- 변수 선언
SET @uNAME = '홍길동';
SET @ucode = '국어책';
SET @usale = 2000;
SET @utype = 0;
SET @uqty = 2;

-- 판매 테이블 연산
INSERT INTO sales(gcode, id, qty, sprice, stype, distotal, paytotal, stotal)
	VALUES (
	(SELECT gcode FROM goods WHERE gname LIKE (SELECT @ucode)),
	(SELECT id FROM member WHERE NAME LIKE (SELECT @uNAME)),
	(SELECT @uqty),
	(SELECT gprice FROM goods WHERE gname LIKE (SELECT @ucode)),
	(SELECT @utype),
	(SELECT @usale)*(SELECT @uqty),
	(((SELECT gprice FROM goods WHERE gname LIKE (SELECT @ucode))*(SELECT @uqty)) - ((SELECT @usale)*(SELECT @uqty))),
	(SELECT gprice FROM goods WHERE gname LIKE (SELECT @ucode)) * (SELECT @uqty) 
	);

-- 재고 수정
UPDATE goods SET gqty = gqty - @uqty WHERE gname LIKE @ucode;

SELECT * FROM member;
SELECT * FROM goods;
SELECT * FROM sales;


-- 더미데이터는 본인이 임의로 각자 12건 이상 추가하되
-- 상품 데이터는 교육(1xxx), 서적(0xxx), 동영상 강의(2xxx)등의 카테고리를 본인이 정하여 추가할 것
-- 현재 회원의 내용을 기준으로  구매한 것으로 판매데이터를 추가할 것 
-- 결제수단 현금: 0, 카드: 1, 삼성, 애플페이 : 2