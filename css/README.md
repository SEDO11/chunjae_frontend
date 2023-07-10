# CSS
<br>

## CSS 선택자

### 기본 선택자
```html
<style>
* {margin: 50; padding: 50;}
body {width: 1280px;}
a {text-decoration: none; color: black;}
</style>
```
<br>

### 계층 선택자
```html
<style>
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
li:nth-child(2n+1) {margin-left: 50px;} /* 홀수 번째 li 만 선택*/    /*li:nth-child(2n+1)::after {margin-left: 50px; content: "2n+1";}*/
li:nth-child(2n) {text-indent: -20px;} /* 짝수 번째 li 만 선택 */    /*li:nth-child(2n)::after {text-indent: -20px; content: "2n";}*/
li:only-child { font-size: 24px;} /* li 태그가 하나만 있는 걸 선택*/
li:only-of-type {opacity: 0.75; background-color: brown;} /* 배경 투명도 */
li:empty::after {content: "내용 없음";} /*내용이 없는 li 태그들을 선택*/
</style>
```
<br>

### 속성 선택자
```html
<style>
/*img의 경우 크기를 지정하고 싶은 경우 display: inline-block; 해줘야 한다.*/
img { display: inline-block; border-width: 5px; width: 200px; height: 300px; margin: 5px;}
img[src] {border-style: double;} /*img 중에서 src 속성이 존재하는 요소 선택*/
img[src="mbc.png"] {width: 150px; color: blueviolet;} /* img 중에서 src속성에 값이 없는걸 선택 | 속성 일치 선택자 */
img[src^="a"] {width: 100px; color: green;} /* img의 src값이 a로 시작하는 걸 선택*/
img[src$=".gif"] {color: blue;} /*img의 src의 속성 값이 특정 문자로 끝나는 요소 선택*/
img[src*="w"] {color:deeppink;} /*img의 src의 속성 값에서 특정 문자가 포함되는 요소 선택*/
img[src*="e"] {width: 250px;}
</style>
```
<br>

### 링크 선택자
```html
<style>
/*link visited hover active 순으로 해야 제대로 동작 love hate*/
a:link { color: gold;} /*링크가 있는 경우*/
a:visited {color: chocolate;} /* 방문한 경우 */
a:hover { color: deepskyblue; } /* 마우스를 올린 경우*/
a:active { color: greenyellow;} /*마우스를 누르고 있는 경우*/
</style>
```
<br>

### 기타 선택자
```html
<style>
/*기타 선택자*/
a::before {content: "앞 ";} /*a 태그안의 맨 앞을 선택*/
a::after {content: " 뒤";} /*a 태그 안의 맨 뒤를 선택*/

/*텍스트 문장 선택자*/
.comment::first-letter {font-size: 60px;} /*comment 클래스의 첫번째 글자*/
.comment::first-line {text-decoration: underline;}  /*comment 클래스의 첫번째 줄만 밑줄*/

/*타겟 선택자*/
/* transition: 0.6s; 애니메이션 효과 */
/* line-height 텍스트 자간 지정 */
/* */
/* box-sizing: border-box; box를 칸에 맞춤 */
/* overflow: hidden; 크기를 벗어나면 숨김 */
#app1, #app2 {width: 500px; height: 300px; line-height: 300px; text-align: center; font-size: 40px; border: 3px solid black;
height: 0px; overflow: hidden; box-sizing: border-box; transition: 0.6s;} 
#app1:target, #app2:target {height: 300px;} /* 타겟이 선택된 경우 */

/*체크 선택자*/
.tab {width: 800px; line-height: 400px; text-align: center; font-size: 50px; overflow: hidden; transition: 0.6s;}
.ra {display: none;}
.ra:not(:checked) + .tab {height: 0px; } /*버튼이 체크 되있지 않으면*/
.ra:checked + .tab {height: 300px;} /*버튼이 체크 되어 있으면*/

/*선택 영역*/
/*드래그 영역의 색상을 바꿈*/
.area::selection { background-color: deeppink; color: white;}
</style>
```
<br>
<hr>

### margin 값
```html
<style>
/* 상하 50px, 좌우 25px */
tag { margin: 50px 25px;}

/* 상하 30px, 좌우 가운데 | auto는 2개로 나누라는 뜻 */
tag { margin: 30px auto;}
</style>
```
<br>

#### child는 순서를 따지고 type은 클래스를 따진다.

### js를 이용해 browser를 조정하는 걸 BOM, document를 조정하는 걸 DOM 이라고 한다.