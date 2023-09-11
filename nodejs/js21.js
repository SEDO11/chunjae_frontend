const http = require('http');
const express = require('express');
const app = express(); // app 객체 생성
const server = http.createServer(app); // 서버를 express 사용
const PORT = 3100;

// Spring의 Request Mapping
app.get('/', (req, res)=> {
    res.send('Hello Express');
});

server.listen(PORT, ()=>{
    console.log(`Server run http://localhost:${PORT}`);
});