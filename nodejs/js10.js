// String.raw 태그 함수, 템플릿을 문자열로 변환하여 저장
let s = String.raw`xy\n${1+1}z`;
let title = "템플릿 사용법 제목";
let content = "템플릿 사용법 내용";
let s2 = String.raw`<html>
    <head>
        <title>${title}</title>
    </head>
    <body>
        <h2>${content}</h2>
    </body>
</html>`
console.log(s2);

// raw 프로퍼티의 사용 : 특정 프로퍼티만을 정의하여 반환
let item1 = "안녕";
let item2 = "javascript";
let tag = function(strings, item1Val, item2Val){ // 프로퍼티를 활용하여 string을 3개로 쪼갬
    console.log(strings);
    console.log(item1Val);
    console.log(item2Val);
    return strings.raw[0];
}
let str = tag`Hello ${item1} Node. ${item2}`;
console.log(str);