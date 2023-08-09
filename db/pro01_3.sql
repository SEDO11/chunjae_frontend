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

-- qnalist view 만들기
CREATE VIEW qnalist AS(SELECT q.qno AS qno, q.title AS title, q.content AS content, q.author AS author, 
q.resdate AS resdate,q.cnt AS cnt, q.lev AS lev, q.par AS par, m.name AS name
FROM qna q, member m WHERE q.author=m.id order BY q.par DESC, q.lev ASC, q.qno ASC);

-- 자주 뭍는 질문  테이블 생성
CREATE TABLE faq(
	fno INT PRIMARY KEY AUTO_INCREMENT, -- qna 글 번호
	question VARCHAR(200) NOT NULL, -- 질문
	answer VARCHAR(1000), -- 답변
	cnt INT DEFAULT 0 -- 조회수
);

INSERT INTO faq(question, answer) VALUES("자주 묻는 질문", "자주 묻는 질문 답변");

INSERT INTO faq(question, answer) VALUES("자주 묻는 질문2", "용기가 봄날의 꽃 소금이라 피다. 끓는 없으면 길을 눈에 이 보이는 청춘의 심장은 있는가? 있는 같지 인도하겠다는 두손을 날카로우나 것이다. 옷을 밝은 그들에게 대중을 구하지 그들의 힘있다. 방지하는 놀이 보내는 따뜻한 같이 위하여서. 실로 설산에서 우는 행복스럽고 하였으며, 얼마나 사막이다. 곧 그들의 우리는 거친 보는 황금시대다. 피는 위하여, 옷을 인도하겠다는 구하지 그들에게 평화스러운 황금시대다. 관현악이며, 피는 그들의 있는가? 천지는 얼음이 보는 바로 과실이 두기 황금시대다.");

INSERT INTO faq(question, answer) VALUES("자주 묻는 질문3", "용기가 봄날의 꽃 소금이라 피다. 끓는 없으면 길을 눈에 이 보이는 청춘의 심장은 있는가? 있는 같지 인도하겠다는 두손을 날카로우나 것이다. 옷을 밝은 그들에게 대중을 구하지 그들의 힘있다. 방지하는 놀이 보내는 따뜻한 같이 위하여서. 실로 설산에서 우는 행복스럽고 하였으며, 얼마나 사막이다. 곧 그들의 우리는 거친 보는 황금시대다. 피는 위하여, 옷을 인도하겠다는 구하지 그들에게 평화스러운 황금시대다. 관현악이며, 피는 그들의 있는가? 천지는 얼음이 보는 바로 과실이 두기 황금시대다.");

INSERT INTO faq(question, answer) VALUES("자주 묻는 질문4", "용기가 봄날의 꽃 소금이라 피다. 끓는 없으면 길을 눈에 이 보이는 청춘의 심장은 있는가? 있는 같지 인도하겠다는 두손을 날카로우나 것이다. 옷을 밝은 그들에게 대중을 구하지 그들의 힘있다. 방지하는 놀이 보내는 따뜻한 같이 위하여서. 실로 설산에서 우는 행복스럽고 하였으며, 얼마나 사막이다. 곧 그들의 우리는 거친 보는 황금시대다. 피는 위하여, 옷을 인도하겠다는 구하지 그들에게 평화스러운 황금시대다. 관현악이며, 피는 그들의 있는가? 천지는 얼음이 보는 바로 과실이 두기 황금시대다.");

INSERT INTO faq(question, answer) VALUES("자주 묻는 질문5", "용기가 봄날의 꽃 소금이라 피다. 끓는 없으면 길을 눈에 이 보이는 청춘의 심장은 있는가? 있는 같지 인도하겠다는 두손을 날카로우나 것이다. 옷을 밝은 그들에게 대중을 구하지 그들의 힘있다. 방지하는 놀이 보내는 따뜻한 같이 위하여서. 실로 설산에서 우는 행복스럽고 하였으며, 얼마나 사막이다. 곧 그들의 우리는 거친 보는 황금시대다. 피는 위하여, 옷을 인도하겠다는 구하지 그들에게 평화스러운 황금시대다. 관현악이며, 피는 그들의 있는가? 천지는 얼음이 보는 바로 과실이 두기 황금시대다.");

INSERT INTO faq(question, answer) VALUES("자주 묻는 질문6", "용기가 봄날의 꽃 소금이라 피다. 끓는 없으면 길을 눈에 이 보이는 청춘의 심장은 있는가? 있는 같지 인도하겠다는 두손을 날카로우나 것이다. 옷을 밝은 그들에게 대중을 구하지 그들의 힘있다. 방지하는 놀이 보내는 따뜻한 같이 위하여서. 실로 설산에서 우는 행복스럽고 하였으며, 얼마나 사막이다. 곧 그들의 우리는 거친 보는 황금시대다. 피는 위하여, 옷을 인도하겠다는 구하지 그들에게 평화스러운 황금시대다. 관현악이며, 피는 그들의 있는가? 천지는 얼음이 보는 바로 과실이 두기 황금시대다.");

INSERT INTO faq(question, answer) VALUES("자주 묻는 질문7", "용기가 봄날의 꽃 소금이라 피다. 끓는 없으면 길을 눈에 이 보이는 청춘의 심장은 있는가? 있는 같지 인도하겠다는 두손을 날카로우나 것이다. 옷을 밝은 그들에게 대중을 구하지 그들의 힘있다. 방지하는 놀이 보내는 따뜻한 같이 위하여서. 실로 설산에서 우는 행복스럽고 하였으며, 얼마나 사막이다. 곧 그들의 우리는 거친 보는 황금시대다. 피는 위하여, 옷을 인도하겠다는 구하지 그들에게 평화스러운 황금시대다. 관현악이며, 피는 그들의 있는가? 천지는 얼음이 보는 바로 과실이 두기 황금시대다.");

INSERT INTO faq(question, answer) VALUES("자주 묻는 질문8", "용기가 봄날의 꽃 소금이라 피다. 끓는 없으면 길을 눈에 이 보이는 청춘의 심장은 있는가? 있는 같지 인도하겠다는 두손을 날카로우나 것이다. 옷을 밝은 그들에게 대중을 구하지 그들의 힘있다. 방지하는 놀이 보내는 따뜻한 같이 위하여서. 실로 설산에서 우는 행복스럽고 하였으며, 얼마나 사막이다. 곧 그들의 우리는 거친 보는 황금시대다. 피는 위하여, 옷을 인도하겠다는 구하지 그들에게 평화스러운 황금시대다. 관현악이며, 피는 그들의 있는가? 천지는 얼음이 보는 바로 과실이 두기 황금시대다.");

INSERT INTO faq(question, answer) VALUES("자주 묻는 질문9", "용기가 봄날의 꽃 소금이라 피다. 끓는 없으면 길을 눈에 이 보이는 청춘의 심장은 있는가? 있는 같지 인도하겠다는 두손을 날카로우나 것이다. 옷을 밝은 그들에게 대중을 구하지 그들의 힘있다. 방지하는 놀이 보내는 따뜻한 같이 위하여서. 실로 설산에서 우는 행복스럽고 하였으며, 얼마나 사막이다. 곧 그들의 우리는 거친 보는 황금시대다. 피는 위하여, 옷을 인도하겠다는 구하지 그들에게 평화스러운 황금시대다. 관현악이며, 피는 그들의 있는가? 천지는 얼음이 보는 바로 과실이 두기 황금시대다.");

INSERT INTO faq(question, answer) VALUES("자주 묻는 질문10", "용기가 봄날의 꽃 소금이라 피다. 끓는 없으면 길을 눈에 이 보이는 청춘의 심장은 있는가? 있는 같지 인도하겠다는 두손을 날카로우나 것이다. 옷을 밝은 그들에게 대중을 구하지 그들의 힘있다. 방지하는 놀이 보내는 따뜻한 같이 위하여서. 실로 설산에서 우는 행복스럽고 하였으며, 얼마나 사막이다. 곧 그들의 우리는 거친 보는 황금시대다. 피는 위하여, 옷을 인도하겠다는 구하지 그들에게 평화스러운 황금시대다. 관현악이며, 피는 그들의 있는가? 천지는 얼음이 보는 바로 과실이 두기 황금시대다.");

INSERT INTO faq(question, answer) VALUES("자주 묻는 질문11", "용기가 봄날의 꽃 소금이라 피다. 끓는 없으면 길을 눈에 이 보이는 청춘의 심장은 있는가? 있는 같지 인도하겠다는 두손을 날카로우나 것이다. 옷을 밝은 그들에게 대중을 구하지 그들의 힘있다. 방지하는 놀이 보내는 따뜻한 같이 위하여서. 실로 설산에서 우는 행복스럽고 하였으며, 얼마나 사막이다. 곧 그들의 우리는 거친 보는 황금시대다. 피는 위하여, 옷을 인도하겠다는 구하지 그들에게 평화스러운 황금시대다. 관현악이며, 피는 그들의 있는가? 천지는 얼음이 보는 바로 과실이 두기 황금시대다.");

INSERT INTO faq(question, answer) VALUES("자주 묻는 질문12", "용기가 봄날의 꽃 소금이라 피다. 끓는 없으면 길을 눈에 이 보이는 청춘의 심장은 있는가? 있는 같지 인도하겠다는 두손을 날카로우나 것이다. 옷을 밝은 그들에게 대중을 구하지 그들의 힘있다. 방지하는 놀이 보내는 따뜻한 같이 위하여서. 실로 설산에서 우는 행복스럽고 하였으며, 얼마나 사막이다. 곧 그들의 우리는 거친 보는 황금시대다. 피는 위하여, 옷을 인도하겠다는 구하지 그들에게 평화스러운 황금시대다. 관현악이며, 피는 그들의 있는가? 천지는 얼음이 보는 바로 과실이 두기 황금시대다.");