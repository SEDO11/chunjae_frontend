// Arrow Function(화살표 함수) -> 람다식 ,ES6 부터 지원
// 코드가 한 줄인 경우 중괄호 생략 가능

// 매개변수, 리턴값 x
var fnc1 = () => console.log("결과1 : 콘솔에 출력합니다.");

// 매개변수o, 리턴값x
var fnc2 = (a, b) => console.log("결과2 : 계산 결과 : "+(a+b));

// 매개변수x, 리턴값o
// 리턴 값을 이렇게 선언해도 됨
var fnc3 = () => 27*27;

// 매개변수o, 리턴값o
var fnc4 = (a, b) => { return a*10+b*9;}

var arr = [75, 90, 80, 65]
var fnc5 = arr.map(value => value*value);

fnc1();
fnc2(27, 4);
console.log(`결과3 : ${fnc3()}`);
console.log(`결과4 : ${fnc4(5, 4)}`);
console.log(`결과5 : ${fnc5}`);