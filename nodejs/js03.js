var calc = require("./calc"); // 만들어진 모듈을 불러옴

// 모듈을 사용
console.log(`27 + 4 = ${calc.add(27, 4)}`);
console.log(`27 - 4 = ${calc.sub(27, 4)}`);
console.log(`27 * 4 = ${calc.mul(27, 4)}`);
console.log(`27 / 4 = ${calc.div(27, 4)}`);
console.log(`27 % 4 = ${calc.mod(27, 4)}`);