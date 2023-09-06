// 데이터를 거르고 사용할 때에는 map 말고 filter를 써라
var test1 = [10, 15, 20, 30, 40, 50];
console.log(test1.map(function(c) {return c<=20})); // 기존 함수 이용
console.log();

console.log(test1.map(c => c<=20)); // arrow 함수 이용
console.log();

// return 안쓰면 실행 오류 발생
console.log(test1.map(c=>{if(c<=20) return c}));
console.log();
console.log(test1.filter(c => {if(c<=20) return c}));