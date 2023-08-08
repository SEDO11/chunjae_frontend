SELECT * FROM member;

DROP TABLE if EXISTS qna;

-- 질문 및 답변 테이블 생성
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

SELECT * FROM qna ORDER BY par DESC, lev ASC, qno ASC;

INSERT INTO qna(title, content, author) VALUES('본문 제목1', '본문 내용1', 'kkt') 
UPDATE qna SET par=qno WHERE qno=1;

INSERT INTO qna(title, content, author) VALUES('본문 제목2', '본문 내용2', 'hong') 
UPDATE qna SET par=qno WHERE qno=2;

INSERT INTO qna(title, content, author) VALUES('본문 제목3', '본문 내용3', 'kang') 
UPDATE qna SET par=qno WHERE qno=3;

INSERT INTO qna(title, content, author) VALUES('본문 제목4', '본문 내용4', 'lee') 
UPDATE qna SET par=qno WHERE qno=4;

INSERT INTO qna(title, content, author) VALUES('본문 제목5', '본문 내용5', 'son') 
UPDATE qna SET par=qno WHERE qno=5;

INSERT INTO qna(title, content, author, lev, par) VALUES('답글 제목1', '답글 내용1', 'son', 1, 1) 

INSERT INTO qna(title, content, author, lev, par) VALUES('답글 제목2', '답글 내용2', 'kkt', 1, 2) 

INSERT INTO qna(title, content, author, lev, par) VALUES('답글 제목3', '본문 내용3', 'hong', 1, 3) 

INSERT INTO qna(title, content, author, lev, par) VALUES('답글 제목4', '답글 내용4', 'kang', 1, 4) 

INSERT INTO qna(title, content, author, lev, par) VALUES('답글 제목5', '답글 내용5', 'lee', 2, 4) 