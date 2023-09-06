// 중요
const http = require('http');
let myName = 'nodejs 홍길동';
let content = String.raw`<h2>${myName}</h2>`;
const server = http.createServer((req, res) => {
    res.writeHead(200, {'Content-Type' : 'text/html; charset=UTF-8'}); // 자바의 response.setContextType() 과 동일
    res.end(content);
});
server.listen(3000); // 서버 포트 번호