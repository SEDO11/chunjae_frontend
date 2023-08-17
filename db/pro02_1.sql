create table exam1(
	no INTEGER,
	name varchar(50)
);

select * from exam1;

-- point 컬럼 추가
alter table exam1 add column point integer;

-- id 컬럼 추가
alter table exam1 add column id varchar(100);

-- id의 컬럼명을 sid로 바꿈
alter table exam1 rename column id to sid;

-- name의 column 타입을 100글자로 변경
alter table exam1 alter column name type varchar(100);

-- 공지사항 게시판 테이블
create table notice(
	no int serial primary key, -- 여기에서는 시리얼로 자동 번호 기입
	title varchar(200) not null, -- 게시판 제목
	content varchar(1000), -- 내용
	author varchar(16), -- 작성자
	resdate timestamp default current_timestamp(), -- 게시일
	cnt int default 0, -- 조회수
	foreign key(author) references member(id) on delete cascade
);

-- 고객 정보 테이블
create table custom(
	id varchar(16) primary key, -- 아이디
	pw varchar(330) not null, -- 비밀번호
	name varchar(100) not null, -- 이름
	email varchar(100) not null, -- 이메일
	tel varchar(13) not null, -- 전화번호
	birth date not null, -- 생일
	regdate timestamp default current_timestamp(), -- 가입일
	point int default 0, -- 포인트
	grade varchar(4) default 'F', -- 등급
)

-- 재고 테이블
CREATE TABLE stock(
	gcode serial PRIMARY KEY, -- 상품코드
	gname VARCHAR(150) NOT NULL, -- 상품명
	gcate VARCHAR(40) NOT NULL, -- 종류
	gprice INT NOT NULL, -- 단가
	gqty INT DEFAULT 0, -- 수량
	regdate DATE DEFAULT CURRENT_TIMESTAMP() -- 등록일
);

-- 판매 테이블
CREATE TABLE sales(
	pcode serial PRIMARY KEY, -- 판매 코드
	gcode INT NOT NULL, -- 상품코드
	author VARCHAR(16), -- 구매자
	qty INT DEFAULT 1, -- 수량
	sprice INT NOT NULL, -- 구매단가
	stype INT NOT NULL, -- 결제수단
	distotal INT, -- 할인금액
	paytotal INT, -- 결제 금액
	stotal INT, -- 총 결제 금액 (결제금액 - 할인금액)
	saledate DATE DEFAULT CURRENT_TIMESTAMP(),
	FOREIGN KEY(author) REFERENCES member(id) ON DELETE 		
		CASCADE, -- 작성자를 member id를 이용해 외래키로 사용
	FOREIGN KEY(gcode) REFERENCES stock(gcode) -- stock gcode를 이용한 외래키
);

-- QnA 테이블
CREATE TABLE qna(
	qno INT PRIMARY KEY AUTO_INCREMENT, -- qna 글 번호
	title VARCHAR(200) NOT NULL, -- 제목
	content VARCHAR(1000), -- 내용
	author VARCHAR(16), -- 작성자
	resdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP(), -- 작성일
	cnt INT DEFAULT 0, -- 조회수
	lev INT DEFAULT 0, -- 게시글 0, 답글 1 이상
	par INT, -- 부모 게시글 번호
	FOREIGN KEY(author) REFERENCES member(id) ON DELETE 		
		CASCADE -- 작성자를 member id를 이용해 외래키로 사용
);

-- 장바구니 테이블
create table cart(
    cno serial primary key, -- 장바구니 번호
    author varchar(16), -- 장바구니 담은 사람
    gcode int, -- 상품 코드
    qty int DEFAULT 1, -- 상품 개수
    FOREIGN KEY(author) REFERENCES member(id) ON DELETE 		
		CASCADE, -- 작성자를 member id를 이용해 외래키로 사용
	FOREIGN KEY(gcode) REFERENCES stock(gcode) -- stock gcode를 이용한 외래키
);

-- 회원 테이블 더미데이터 추가
insert into member() values('kkt', '1234', '김길동', 'kkt@shop.com', '010-1234-5678', '1995-05-14', default, default, default);
insert into member() values('oh', '1111', '오세훈', 'oh@shop.com', '010-1212-1212', '1998-07-10', default, default, default);
insert into member() values('son', '5678', '손옹민', 'son@shop.com', '010-1234-5678', '1995-05-14', default, default, default);
insert into member() values('kkt', '1234', '김길동', 'kkt@shop.com', '010-1234-5678', '1995-05-14', default, default, default);
insert into member() values('kkt', '1234', '김길동', 'kkt@shop.com', '010-1234-5678', '1995-05-14', default, default, default);
insert into member() values('kkt', '1234', '김길동', 'kkt@shop.com', '010-1234-5678', '1995-05-14', default, default, default);
insert into member() values('kkt', '1234', '김길동', 'kkt@shop.com', '010-1234-5678', '1995-05-14', default, default, default);
insert into member() values('kkt', '1234', '김길동', 'kkt@shop.com', '010-1234-5678', '1995-05-14', default, default, default);
