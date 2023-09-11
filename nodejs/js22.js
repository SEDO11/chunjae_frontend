const http = require('http');
const express = require('express');
const app = express(); // app 객체 생성
const server = http.createServer(app); // 서버를 express 사용
const PORT = 3100;
let temp1 = `
<!DOCTYPE>
<html>
    <head>
        <title>타이틀</title>
    </head>
    <body>
        <a href='/'>메인페이지</a>
        <a href='/sub'>서브페이지</a>
        <a href='/detail'>상세페이지</a>
    </body>
`
let temp2 = `</body></html>`

let home = `<h2>메인 페이지</h2>`
let sub = `<h2>서브 페이지</h2>`
let detail = `<h2>상세 페이지</h2>`

// Spring의 Request Mapping
app.get('/', (req, res)=> {
    res.send(temp1+home+temp2);
});

app.get('/sub', (req, res)=> {
    res.send(temp1+sub+temp2);
});

app.get('/detail', (req, res)=> {
    res.send(temp1+detail+temp2);
});


server.listen(PORT, ()=>{
    console.log(`Server run http://localhost:${PORT}`);
});