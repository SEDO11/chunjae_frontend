# HTML 학습하기
<br>

## 문서의 구성
<br>

### html문서는 DTD를 선언하고, html 태그를 열고, 그 안에 head와 body로 구분하여 작성한다.
```html
<!-- html을 md에 작성하려면 ```html ```에서 작성해줘야 한다. -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
</body>
</html>
```
<br>

### a 태그(하이퍼링크) 활용
```html
<nav>
    <ul>
        <li><a href="./ex1.html">내부문서</a></li>
        <li><a href="https://www.naver.com/" target="_blank">외부사이트</a></li>
        <li><a href="#ft">푸터로이동(name 앵커)</a></li>
        <!-- 메일 보내기 -->
        <li><a href="mailto:do11anm@naver.com">이메일 보내기</a></li>
        <!-- 휴대폰에서 바로 전화걸기 -->
        <li><a href="tel:010-1234-5678">전화걸기</a></li>
        <!-- 문자 전송 -->
        <li><a href="sms:Hello world">문자보내기</a></li>
        <!-- 네이버 검색 -->
        <li><a href="http://search.naver.com/search.naver?query=ohsehoon">오세훈 검색</a></li>
    </ul>
</nav>
```
<br>

### 미디어 관련 태그
```html
<h1>미디어 관련 태그</h1>
<hr>

<h2>이미지</h2>
<img width="1205" height="678" src="./img/building.jpg" alt="건물" title="도시에 있는 여자">
<hr>

<h2>오디오</h2>
<!-- autoplay muted 음소거 상태로 자동 실행 -->
<!-- controls 오디오 제어 -->
<audio src="./sound/sample1.mp3" controls muted=""></audio>
<hr>

<h2>iframe</h2>
<iframe width="1205" height="678" src="https://www.youtube.com/embed/ioipXUbjMls" title="그냥 X만 누르면 이기는 사기악세" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
<hr>

<h2>동영상</h2>
<video width="1205" height="678" src="./movie/ditto.mp4" controls autoplay muted></video>
<hr>
```
<br>