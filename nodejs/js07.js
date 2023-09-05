// 분해, 결합
let person = "Kim";
let age = 41;
let tag = function(strings, personExp, ageExp) {
    console.log(strings);
    console.log(personExp);
    console.log(ageExp);
}

let output = tag`그 사람 ${person}은 ${age} 세 입니다.`;