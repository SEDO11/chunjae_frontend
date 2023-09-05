// const fs = require('fs')

// fs.readFile('./hello.txt', function(err, data) {
//     console.log(data)
// })

var es5 = {
    name:"김기태",
    point:100
}

let es6 = new Object();
es6.name = "홍길동";
es6.point = 95;

console.log(`es5 필드에 의한 접근 es5.name : ${es5.name}, es5.point : ${es5.point}`); 
console.log(`es6 필드에 의한 접근 es6.name : ${es6.name}, es6.point : ${es6.point}`);
console.log(`es6 키에 의한 접근 es6.name : ${es6["name"]}, es6.point : ${es6["point"]}`);
console.log();
console.log("for 문을 이용한 출력")
for(let key in es6) {
    console.log(`${key} : ${es6[key]}`)
}