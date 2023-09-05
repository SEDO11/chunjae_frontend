// 비구조 할당
// 배열과 같은 자료구조를 단일 기억장소로 변경
const person = ["kim", "lee", "park", "choi", "oh"]
let p1 = person[0];
let p2 = person[1];
let p3 = person[2];

const member = {
    id:"kim",
    age:"42",
    addr:"가산동",
    tel:"02-1254-8282"
}

let id = member.id;
let age = member.age;
let addr = member.addr;
let tel = member.tel;
console.log(`id : ${id}, age : ${age}, addr : ${addr}, tel : ${tel}`)

// 배열 구조를 분해하여 비구조 할당
let [k1, k2, k3, k4, k5] = person;
[k2, k1, k4, k3, k5] = [k1, k2, k3, k4, k5]; 
// let [k1, k2, k3, k4, k5] = person;
// console.log(`변경전 = k1 : ${k1}, k2 : ${k2}, k3 : ${k3}, k4 : ${k4}, k5 : ${k5}`)
// [k2, k1, k4, k3, k5] = [k1, k2, k3, k4, k5]; // 비구조 할당의 값 교체
console.log(`변경후 = k1 : ${k1}, k2 : ${k2}, k3 : ${k3}, k4 : ${k4}, k5 : ${k5}`)

// 비 정의
const [a, b, c] = ["JAVA", "C#"];
console.log(`a : ${a}, b : ${b}, c : ${c}`);

// 초기값 할당
const [d, e, f = 'NODE'] = ["JAVA", "C#"];
console.log(`d : ${d}, e : ${e}, f : ${f}`);

// 일부 값 무시
const [g, h, i] = ["NODE", "REACT", "VUE", "ANGULAR"];
console.log(`g : ${g}, h : ${h}, i : ${i}`);

// 객체의 분해
let {o1, o2, o3, o4} = {age:member.age, id:member.id, addr:member.addr, tel:member.tel };