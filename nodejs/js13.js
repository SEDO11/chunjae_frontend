const fs = require("fs");

// 동기 방식 : 한 꺼번에 파일 전체 내용을 불러올 경우
var syncData = fs.readFileSync('./oh.txt', 'utf-8');
console.log(`동기 방식 : ${syncData}\n`);

// 비동기 방식 : 불러온 데이터 중에서 일부만 컨트롤 하는 경우
fs.readFile('./oh.txt', 'utf-8', (err, result) => console.log(`비동기 방식 : ${result}`));