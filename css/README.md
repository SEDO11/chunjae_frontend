# CSS
<br>

## CSS 활용
```html
<style>
    * {margin: 50; padding: 50;}
    body {width: 1280px;}
    a {text-decoration: none; color: black;}
    a:hover { background-color: deepskyblue; }
    .comment {font-style: 800;}
    #base {color: deepskyblue;} /*base 아이디의 글자색 변경*/
    .ex1 li { list-style: none; } /* 조상 후손으로 나타낸 지정 | .ex1 클래스 내의 li 태그의 스타일을 업앰*/
    .ex1 > nav > .lst1 > li { padding-left: 24px;} /* 부모자식으로 나타낸 .ex1 클래스 내의 li 지정 | 왼쪽 패딩의 값 변형*/
    .ex1 .item1 ~ li > a { color: red;} /* item1의 형제들의 색상 변경*/
    .ex1 .item1 + li > a{ border: 1px solid red;} /* item1 이후 하나의 li에 빨간색 박스 생성*/
    .ex1 li:first-child > a {color: blue;} /* .ex1 클래스 내에 li의 첫번째 자식을 파란색 글씨로, first는 가변적이지 않다.*/
    .ex1 li:first-of-type  > a { background-color: gray;} /* .ex1 클래스 내에 첫번째 요소들 배경을 회색으로*/
    li:last-child {border-bottom: 2px double black;} /* 마지막 자식에게 밑줄 last 는 가변적이다. */
    li:last-of-type {border-top: 3px dotted deeppink;} /* 마지막 요소들에게 핑크줄을 그림*/
    li:nth-child(2) {border-left: 3px solid violet;} /* li에서 두 번째 자식 선택 */
    li:nth-of-type(2) {border-right: 3px solid gold;} /* li에서 2번째 요소들을 선택*/
    li:nth-child(2n+1) {margin-left: 50px;} /* 3의 배수 li 만 선택*/    /*li:nth-child(2n+1)::after {margin-left: 50px; content: "2n+1";}*/
    li:nth-child(2n) {text-indent: -20px;} /* 2의 배수 li 만 선택 */    /*li:nth-child(2n)::after {text-indent: -20px; content: "2n";}*/
    li:only-child { font-size: 24px;} /* li 태그가 하나만 있는 걸 선택*/
    li:only-of-type {opacity: 0.75; background-color: brown;} /* 배경 투명도 */
    li:empty::after {content: "내용 없음";} /*내용이 없는 li 태그들을 선택*/
</style>
```
<br>