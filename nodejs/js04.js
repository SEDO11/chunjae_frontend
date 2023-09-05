// ES5 함수의 정의와 호출
var fnc1 = function(){console.log("결과1 : 콘솔에 출력합니다.");}
var fnc2 = function(a, b){console.log("결과2 : 계산 결과 : "+(a+b));}
var fnc3 = function(){ return 27*27;}
var fnc4 = function(a, b){return a*10+b*9;}

// 익명의 함수
var arr = [75, 90, 80, 65]
arr.map(function(value) {console.log(value*value);});

var fnc5 = arr.map(function(value){return value*value});
fnc1();
fnc2(27, 4);
console.log(`결과3 : ${fnc3()}`);
console.log(`결과4 : ${fnc4(5, 4)}`);
console.log(`결과5 : ${fnc5}`);

