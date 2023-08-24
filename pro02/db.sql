CREATE DATABASE shop;

USE shop;

DROP TABLE custom;

-- 손님 테이블
CREATE TABLE custom (
    id varchar(20) PRIMARY KEY,
    pw varchar(300) NOT NULL,
    name varchar(100) NOT NULL,
    point integer DEFAULT 0,
    grade varchar(4) DEFAULT 'F',
    tel VARCHAR(20) NOT NULL,
    email varchar(100) NOT NULL,
    birth date NOT NULL,
    regdate timestamp DEFAULT CURRENT_TIMESTAMP,
    address varchar(200) NOT NULL
);

INSERT INTO custom(id, pw, NAME, tel, email, birth, address) 
VALUES('admin', '1234', '관리자', '01011112222', 'admin@shop.com', '1995-07-31', '서울시 구로구 01111');
	
INSERT INTO custom(id, pw, NAME, tel, email, birth, address) 
VALUES('hong', '1234', '홍길동', '01011222233', 'hong@shop.com', '2000-06-23', '서울시 금천구 01123');

INSERT INTO custom(id, pw, NAME, tel, email, birth, address) 
VALUES('kim', '1234', '김철수', '01011332222', 'kim@shop.com', '2001-03-25', '서울시 양천구 02111');

-- 공지사항 테이블
CREATE TABLE notice (
    no INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    title varchar(200) NOT NULL,
    content varchar(1000) NOT null,
    resdate timestamp DEFAULT CURRENT_TIMESTAMP(),
    visited int DEFAULT 0
);



-- 파일 업로드 관련 테이블

-- 하나의 파일 업로드 테이블
CREATE TABLE FILE(
	uname VARCHAR(200),
	SUBJECT VARCHAR(300),
	content VARCHAR(1000),
	fname VARCHAR(500)
);

-- 다중 파일 업로드 테이블
CREATE TABLE FILE2(
	uname VARCHAR(200),
	SUBJECT VARCHAR(300),
	content VARCHAR(1000),
	fname1 VARCHAR(500),
	fname2 VARCHAR(500),
	fname3 VARCHAR(500)
);



-- 구매 관련 테이블

-- 상품
CREATE TABLE product(
	no INT AUTO_INCREMENT PRIMARY key,
	cate VARCHAR(50) NOT null,
	cateno VARCHAR(20) NOT null,
	pname VARCHAR(100) NOT null,
	pcomment VARCHAR(1000),
	plist VARCHAR(200),
	pqty INT,
	price INT,
	imgsrc1 VARCHAR(300),
	imgsrc2 VARCHAR(300),
	imgsrc3 VARCHAR(300),
	resdate timestamp DEFAULT CURRENT_TIMESTAMP()
);

INSERT INTO product VALUES(DEFAULT, '국어', '국어 1', '고등국어1', '설명', '목차',
	100, 20000, 'main_bottom_1.png', NULL, NULL, DEFAULT);
	
INSERT INTO product VALUES(DEFAULT, '수학', '미적분 1', '고등수학1', '수학 설명', ' 수학 목차',
	50, 25000, 'test2.jpg', 'test2.mp4', NULL, DEFAULT);
	
-- 후기 테이블
DROP TABLE review;

CREATE TABLE review(
	NO INT AUTO_INCREMENT PRIMARY KEY,
	cid VARCHAR(20) NOT NULL,
	content VARCHAR(300) NOT NULL,
	resdate timestamp DEFAULT CURRENT_TIMESTAMP(),
	par INT,
	FOREIGN KEY(cid) REFERENCES custom(id) ON DELETE
		CASCADE
);

-- qna
CREATE TABLE qna(
	qno INT PRIMARY KEY AUTO_INCREMENT, -- qna 글 번호
	title VARCHAR(200) NOT NULL, -- 제목
	content VARCHAR(1000), -- 내용
	cid VARCHAR(20), -- 작성자
	resdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP(), -- 작성일
	cnt INT DEFAULT 0, -- 조회수
	lev INT DEFAULT 0, -- 게시글 0, 답글 1 이상
	par INT, -- 부모 게시글 번호
	FOREIGN KEY(cid) REFERENCES custom(id) ON DELETE 		
		CASCADE -- 작성자를 member id를 이용해 외래키로 사용
);

-- 결제(판매)
CREATE TABLE payment(
	sno INT AUTO_INCREMENT PRIMARY key,
	pno INT NOT null,
	cid VARCHAR(20) NOT null,
	amount INT NOT NULL,
	pmethod INT NOT NULL,
	pcom INT NOT NULL,
	cnum INT NOT NULL,
	payprice INT NOT NULL,
	dno VARCHAR(100)
);

-- 배송
CREATE TABLE delivery(
	dno INT AUTO_INCREMENT PRIMARY key,
	sno INT,
	cid VARCHAR(20) NOT NULL,
	daddr VARCHAR(100) NOT null,
	custel VARCHAR(20) NOT null,
	pcom VARCHAR(100), -- 배송회사
   ptel VARCHAR(20), -- 배송기사연락처
   pstate INT DEFAULT 0, -- (0:배송전, 1:배송중, 2:도착, 3:구매결정)배송상태
   bcode VARCHAR(100), -- 화물코드
	FOREIGN KEY(cid) REFERENCES custom(id) ON DELETE 
		CASCADE
);

-- 입고정보
CREATE TABLE receive(
	rno INT AUTO_INCREMENT PRIMARY key,
	pno INT NOT null,
	amount INT NOT NULL,
	rprice INT NOT NULL,
	resdate timestamp DEFAULT CURRENT_TIMESTAMP(),
	FOREIGN KEY(pno) REFERENCES product(NO) ON DELETE 
		CASCADE
);

-- 출고정보
CREATE TABLE serve(
	rno INT AUTO_INCREMENT PRIMARY key,
	pno INT NOT null,
	amount INT NOT NULL,
	rprice INT NOT NULL,
	resdate timestamp DEFAULT CURRENT_TIMESTAMP(),
	FOREIGN KEY(pno) REFERENCES product(NO) ON DELETE 
		CASCADE
);

-- 추가정보
CREATE TABLE addinfo(
	ano INT AUTO_INCREMENT PRIMARY key,
	pno INT NOT null,
	title VARCHAR(100),
	movie VARCHAR(200),
	resdate timestamp DEFAULT CURRENT_TIMESTAMP(),
	FOREIGN KEY(pno) REFERENCES product(NO) ON DELETE 
		CASCADE
);

-- 장바구니
CREATE TABLE cart(
	NO INT AUTO_INCREMENT PRIMARY KEY,
	cid VARCHAR(20) NOT NULL,
	pno INT NOT NULL,
	amount INT,
	FOREIGN KEY(pno) REFERENCES product(NO) ON DELETE 
		CASCADE,
	FOREIGN KEY(cid) REFERENCES custom(id) ON DELETE 
		CASCADE
);

-- 카테고리
CREATE TABLE category(
	cno INT AUTO_INCREMENT PRIMARY KEY,
	cname VARCHAR(100) NOT null
);

-- 재고뷰
-- CREATE VIEW inventory;

-- 상품등록
INSERT INTO product VALUES(DEFAULT, ?, '', ?, ?, ?, ?, ?, ?, ?, ?, ?, DEFAULT);
-- cateno 업데이트
UPDATE product SET cateno = CONCAT(cate, NO) WHERE NO=?;

-- 입고처리
INSERT INTO receive VALUES(DEFAULT, ?, ?, ?, DEFAULT);

-- 출고처리 패턴
-- 구매 처리
INSERT INTO payment VALUES(DEFAULT, ?, ?, ?, ?, ?, ?, ?, ''); -- 결제
-- 출고 처리
INSERT INTO serve VALUES(DEFAULT, ?, ?, ?, DEFAULT); -- 내역 갱신
-- 배송처리
INSERT INTO delivery VALUES(DEFAULT, ?, ?, ?, ?, '', '', DEFAULT, DEFAULT, '', ); 
-- 장바구니 삭제
DELETE FROM cart WHERE NO=?;

-- 반품처리 패턴
DELETE FROM payment WHERE sno=?; -- 구매처리 삭제
-- 상품 다시 추가
INSERT INTO receive VALUES(DEFAULT, ?, ?, ?, DEFAULT);
-- 
DELETE FROM serve WHERE sno=?; -- 출고처리 삭제
INSERT INTO cart VALUES(DEFAULT, ?, ?, ?);
-- 배송내역삭제
DELETE FROM delivery WHERE sno=?;


-- 상품정보 변경
-- UPDATE product SET pname=?, cate=?, pcomment=?, plist=?, price=?, imgsrc=? WHERE ''

-- 상품목록
SELECT * FROM product ORDER BY NO;

-- 신상품목록
SELECT * FROM product ORDER BY NO DESC LIMIT 5;

-- 베스트셀러 목록
SELECT * from product where pno IN (SELECT pno FROM payment GROUP BY pno ORDER BY SUM(amount) DESC LIMIT 5); -- 구매 개수를 통해 베스트셀러 선출

-- 카테고리별 베스트 셀러 상품 목록
SELECT * from product where pno IN (SELECT pno FROM payment GROUP BY pno ORDER BY SUM(amount) DESC LIMIT 5); -- 구매 개수를 통해 베스트셀러 선출



-- 배송처리
-- 출발
UPDATE delivery SET pcom=?, ptel=?, pstate=1, 
sdate=CURRENT_TIMESTAMP, rdate=?, bcode=? WHERE dno=?;

-- 도착
UPDATE delivery SET pcom=?, ptel=?, pstate=2, 
sdate=CURRENT_TIMESTAMP, rdate=?, bcode=? WHERE dno=?;