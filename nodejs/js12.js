// node 내장 모듈
const fs = require("fs");

// utf-8 을 안 주면 데이터가 깨진다.
fs.readFile("./oh.txt", "utf-8", (err, data) => console.log(data));
