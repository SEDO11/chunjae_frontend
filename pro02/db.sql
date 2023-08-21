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