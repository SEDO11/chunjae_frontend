const http = require('http');
const express = require('express');
const app = express(); // app 객체 생성
const server = http.createServer(app); // 서버를 express 사용
const PORT = 3100;

// Spring의 Request Mapping
app.get('/', (req, res)=> {
    res.sendFile(__dirname+"/index.html"); // 현재 디렉토리 에서 index.html 문서를 불러와서 뿌려줌
});

app.get('/sub', (req, res)=> {
    res.sendFile(__dirname+"/sub.html");
});

app.get('/detail', (req, res)=> {
    res.sendFile(__dirname+"/detail.html");
});


server.listen(PORT, ()=>{
    console.log(`Server run http://localhost:${PORT}`);
});