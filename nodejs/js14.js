const fs = require("fs");
// writeFile
// 비동기식
let content = "나도 알아 ES6";
fs.writeFile('./oh2.txt', content, (err) => {
    fs.readFile('./oh2.txt', 'utf-8', (err, data) => {console.log(data)})
})

// 동기식
fs.writeFileSync('./oh3.txt', content);
var data = fs.readFileSync('./oh3.txt', 'utf-8');
console.log(data);

// 내용 추가
fs.readFile('./oh2.txt', 'utf-8', (err, data) => {
    let con = data+" 내용 추가";
    fs.writeFile('./oh2.txt', con, (err) => {console.log(con)});
})