# HTML 학습하기
<br>

## 문서의 구성
<hr>
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
<hr>
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
<hr>
<br>


### 미디어 관련 태그
```html
<h2>이미지</h2>
<img width="1205" height="678" src="./img/building.jpg" alt="건물" title="도시에 있는 여자">
<hr>

<h2>오디오</h2>
<!-- autoplay muted 음소거 상태로 자동 실행 -->
<!-- controls 오디오 제어 -->
<audio controls autoplay muted>
    <!-- 브라우저 마다 지원하는 파일이 다를 수 있으므로 여러개의 파일을 지정 -->
    <!-- type은 mime 타입을 검색해서 확인후 입력 -->
    <!-- 크로스 브라우징 처리 -->
    <source src="./sound/ditto.mp3" type="audio/mp3">
    <source src="./sound/ditto.ogg" type="audio/ogg">
    <source src="./sound/ditto.wav" type="audio/x-wav">
</audio>
<hr>

<h2>비디오</h2>
<!-- poster는 동영상의 커버 화면을 지정한다. -->
<!-- loop 는 무한 재생을 뜻함 -->
<video width="1205" height="678" poster="./img/building.jpg" loop controls autoplay muted>
    <source src="./movie/earth.mp4" type="video/mp4">
    <source src="./movie/ditto.ogv" type="video/ogg">
    <source src="./movie/ditto.ogv" type="video/webm">
</video>
<hr>
```
<h2>이미지</h2>
<img width="1205" height="678" src="./img/building.jpg" alt="건물" title="도시에 있는 여자">
<hr>

<h2>오디오</h2>
<!-- autoplay muted 음소거 상태로 자동 실행 -->
<!-- controls 오디오 제어 -->
<audio controls autoplay muted>
    <!-- 브라우저 마다 지원하는 파일이 다를 수 있으므로 여러개의 파일을 지정 -->
    <!-- type은 mime 타입을 검색해서 확인후 입력 -->
    <!-- 크로스 브라우징 처리 -->
    <source src="./sound/ditto.mp3" type="audio/mp3">
    <source src="./sound/ditto.ogg" type="audio/ogg">
    <source src="./sound/ditto.wav" type="audio/x-wav">
</audio>
<hr>

<h2>비디오</h2>
<!-- poster는 동영상의 커버 화면을 지정한다. -->
<!-- loop 는 무한 재생을 뜻함 -->
<video width="1205" height="678" poster="./img/building.jpg" loop controls autoplay muted>
    <source src="./movie/earth.mp4" type="video/mp4">
    <source src="./movie/ditto.ogv" type="video/ogg">
    <source src="./movie/ditto.ogv" type="video/webm">
</video>
<hr>
<br>


### 미디어 관련 태그
```html
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>테이블 관련 태그</title>
    <style>
        /* 가로 800픽셀 크기로 테이블 위치는 가운데 */
        .tb1{ width: 800px; margin:10px auto;}
        .tb1 th{background-color: deeppink; color: #fff; line-height: 42px;}
        .tb1 td{border-bottom: 2px solid #333; text-align: center; line-height: 38px;}
    </style>
</head>
<body>
    <h1>테이블 태그</h1>
    <!-- table에 border 직접 금지-->
    <table class="tb1">
        <!-- 테이블의 제목, caption은 안 넣어도 상관 없음 -->
        <caption>
            <h2>천재교육 풀스택 2기 성적표</h2>
        </caption>
        <thead>
            <!-- 줄(행) -->
            <tr>
                <!-- 열 제목 -->
                <th>번호</th><th>이름</th><th>점수</th>
            </tr>
        </thead>

        <!-- 테이블의 내용, tbody, tr, th, td는 필수 -->
        <tbody>
            <!-- 줄(행)-->
            <tr>
                <!-- 열 내용 -->
                <td>1</td><td>오세훈</td><td>100</td>
            </tr>
            <tr>
                <td>2</td><td>오성준</td><td>90</td>
            </tr>
            <tr>
                <td>3</td><td>권예성</td><td>80</td>
            </tr>
            <tr>
                <td>4</td><td>윤동준</td><td>70</td>
            </tr>
            <tr>
                <td>5</td><td>석진욱</td><td>60</td>
            </tr>
            <tr>
                <!-- colspan 은 칸을 합친다. -->
                <td colspan="3">부분 통과</td>
            </tr>
        </tbody>
    </table>
</body>
```
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>테이블 관련 태그</title>
    <style>
        /* 가로 800픽셀 크기로 테이블 위치는 가운데 */
        .tb1{ width: 800px; margin:10px auto;}
        .tb1 th{background-color: deeppink; color: #fff; line-height: 42px;}
        .tb1 td{border-bottom: 2px solid #333; text-align: center; line-height: 38px;}
    </style>
</head>
<body>
    <h1>테이블 태그</h1>
    <table class="tb1">
        <caption>
            <h2>천재교육 풀스택 2기 성적표</h2>
        </caption>
        <thead>
            <tr>
                <th>번호</th><th>이름</th><th>점수</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>1</td><td>오세훈</td><td>100</td>
            </tr>
            <tr>
                <td>2</td><td>오성준</td><td>90</td>
            </tr>
            <tr>
                <td>3</td><td>권예성</td><td>80</td>
            </tr>
            <tr>
                <td>4</td><td>윤동준</td><td>70</td>
            </tr>
            <tr>
                <td>5</td><td>석진욱</td><td>60</td>
            </tr>
            <tr>
                <td colspan="3">부분 통과</td>
            </tr>
        </tbody>
    </table>
</body>
<hr>
<br>



### 폼 관련 태그
```html
<h1>폼 요소2</h1>
<!-- fieldset: 항목을 나눔 -->
<!-- legend: 항목의 이름 -->
<!-- name을 통해서 정보가 전달된다. -->
<!-- option 태그는 value의 정보가 전달-->
<!-- checkbox, radiobtn checked로 미리 체크 가능-->
<!-- select는 option에 selected를 하여 미리 선택 가능-->
<!-- input[type=file], 파일을 업로드 하는 input, accept=".png" 를 통해 특정 파일만 넣을 수 있음 -->

<form action="join.jsp" method="post">

    <!-- #region 기본 정보 -->
    <fieldset>
        <legend>기본 정보</legend>
        <table>
            <tbody>
                <tr>
                    <th><label for="name">이름</label></th>
                    <td><input type="text" name="name" id="name" placeholder="이름"></td>
                </tr>
                <tr>
                    <th><label for="id">아이디</label></th>
                    <td><input type="text" name="id" id="id" placeholder="아이디"></td>
                </tr>
                <tr>
                    <th><label for="pw">비밀번호</label></th>
                    <td><input type="password" name="pw" id="pw" placeholder="비밀번호"></td>
                </tr>
                <tr>
                    <th><label for="pw2">비밀번호 확인</label></th>
                    <td><input type="password" name="pw2" id="pw2" placeholder="비밀번호"></td>
                </tr>
                <tr>
                    <th><label for="email">이메일</label></th>
                    <td><input type="email" name="email" id="email" placeholder="이메일"></td>
                </tr>
                <tr>
                    <th><label for="tel">전화번호</label></th>
                    <td><input type="text" name="tel" id="tel"></td>
                </tr>
                <tr>
                    <th><label for="birth">생년월일</label></th>
                    <td><input type="date" name="birth" itemref="birth"></td>
                </tr>
            </table>
        </tbody>
    </fieldset>
    <!-- #endregion -->

    <!-- #region 추가 정보 -->
    <fieldset>
        <legend>추가 정보</legend>
        <tbody>
            <table>
                <tr>
                    <th>해당 지역</th>
                    <td>
                        <select name="" id="">
                            <option value="1">서울</option>
                            <option value="2">경기</option>
                            <option value="3">경상</option>
                            <option value="4">전라</option>
                            <option value="5">강원</option>
                            <option value="6" selected>제주</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>취미</th>
                    <td>
                        <label for="ch_box1" class="ch_box">영화</label>
                        <input type="checkbox" id="ch_box1">
                        
                        <label for="ch_box2" class="ch_box">독서</label>
                        <input type="checkbox" id="ch_box2">
                        
                        <label for="ch_box3" class="ch_box">게임</label>
                        <input type="checkbox" id="ch_box3">
                        
                        <label for="ch_box4" class="ch_box">여행</label>
                        <input type="checkbox" id="ch_box4">
                        
                        <label for="ch_box5" class="ch_box">서핑</label>
                        <input type="checkbox" id="ch_box5">
                        
                        <label for="ch_box6" class="ch_box">수영</label>
                        <input type="checkbox" id="ch_box6">
                    </td>
                </tr>
                <tr>
                    <th>성별</th>
                    <td>
                        <input type="radio" id="male1" name="male" value="male1"checked>
                        <label for="male1">여자</label>

                        <input type="radio" id="male2" name="male" value="male2">
                        <label for="male2">남자</label>
                    </td>
                </tr>
                <tr>
                    <th><label for="pic">사진</label></th>
                    <td>
                        <!-- 모든 음원, 비디오 선택 가능 -->
                        <!-- <input type="file" name="pic" id="pic" accept="video/*"> -->
                        <!-- <input type="file" name="pic" id="pic" accept="audio/*"> -->
                        <!-- 모든 이미지 타입 선택 가능 -->
                        <!-- <input type="file" name="pic" id="pic" accept="image/*"> -->
                        <!-- 해당 확장자의 이미지 타입만 가능 -->
                        <input type="file" name="pic2" id="pic2" accept=".png, .jpg, .gif">
                    </td>
                </tr>
                <tr>
                    <th><label for="memo">하고 싶은 말</label></th>
                    <td>
                        <!-- 값을 넣으면 똑같이 반영 되므로 주의 -->
                        <textarea name="memo" id="memo" cols="30" rows="10"></textarea>
                    </td>
                </tr>
                <tr>
                    <th><label for="color">좋아하는 색상</label></th>
                    <td>
                        <input type="color" name="color" id="color">
                    </td>
                </tr>
            </tbody>
        </table>
    </fieldset>
    <!-- #endregion -->

    <table class="tb1">
        <tbody>
            <tr>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td colspan="3">
                    <!-- button 태그는 기본 타입이 submit 이다.-->
                    <input type="submit" value="회원가입">&nbsp;
                    <input type="reset" value="취소">
                </td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </tbody>
    </table>
</form>
```
<h1>폼 요소2</h1>
<!-- fieldset: 항목을 나눔 -->
<!-- legend: 항목의 이름 -->
<!-- name을 통해서 정보가 전달된다. -->
<!-- option 태그는 value의 정보가 전달-->
<!-- checkbox, radiobtn checked로 미리 체크 가능-->
<!-- select는 option에 selected를 하여 미리 선택 가능-->
<!-- input[type=file], 파일을 업로드 하는 input, accept=".png" 를 통해 특정 파일만 넣을 수 있음 -->

<form action="join.jsp" method="post">
    <!-- #region 기본 정보 -->
    <fieldset>
        <legend>기본 정보</legend>
        <table>
            <tbody>
                <tr>
                    <th><label for="name">이름</label></th>
                    <td><input type="text" name="name" id="name" placeholder="이름"></td>
                </tr>
                <tr>
                    <th><label for="id">아이디</label></th>
                    <td><input type="text" name="id" id="id" placeholder="아이디"></td>
                </tr>
                <tr>
                    <th><label for="pw">비밀번호</label></th>
                    <td><input type="password" name="pw" id="pw" placeholder="비밀번호"></td>
                </tr>
                <tr>
                    <th><label for="pw2">비밀번호 확인</label></th>
                    <td><input type="password" name="pw2" id="pw2" placeholder="비밀번호"></td>
                </tr>
                <tr>
                    <th><label for="email">이메일</label></th>
                    <td><input type="email" name="email" id="email" placeholder="이메일"></td>
                </tr>
                <tr>
                    <th><label for="tel">전화번호</label></th>
                    <td><input type="text" name="tel" id="tel"></td>
                </tr>
                <tr>
                    <th><label for="birth">생년월일</label></th>
                    <td><input type="date" name="birth" itemref="birth"></td>
                </tr>
            </table>
        </tbody>
    </fieldset>
    <!-- #endregion -->
    <!-- #region 추가 정보 -->
    <fieldset>
        <legend>추가 정보</legend>
        <tbody>
            <table>
                <tr>
                    <th>해당 지역</th>
                    <td>
                        <select name="" id="">
                            <option value="1">서울</option>
                            <option value="2">경기</option>
                            <option value="3">경상</option>
                            <option value="4">전라</option>
                            <option value="5">강원</option>
                            <option value="6" selected>제주</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>취미</th>
                    <td>
                        <label for="ch_box1" class="ch_box">영화</label>
                        <input type="checkbox" id="ch_box1">
                        <label for="ch_box2" class="ch_box">독서</label>
                        <input type="checkbox" id="ch_box2">
                        <label for="ch_box3" class="ch_box">게임</label>
                        <input type="checkbox" id="ch_box3">
                        <label for="ch_box4" class="ch_box">여행</label>
                        <input type="checkbox" id="ch_box4">
                        <label for="ch_box5" class="ch_box">서핑</label>
                        <input type="checkbox" id="ch_box5">
                        <label for="ch_box6" class="ch_box">수영</label>
                        <input type="checkbox" id="ch_box6">
                    </td>
                </tr>
                <tr>
                    <th>성별</th>
                    <td>
                        <input type="radio" id="male1" name="male" value="male1"checked>
                        <label for="male1">여자</label>
                        <input type="radio" id="male2" name="male" value="male2">
                        <label for="male2">남자</label>
                    </td>
                </tr>
                <tr>
                    <th><label for="pic">사진</label></th>
                    <td>
                        <!-- 모든 음원, 비디오 선택 가능 -->
                        <!-- <input type="file" name="pic" id="pic" accept="video/*"> -->
                        <!-- <input type="file" name="pic" id="pic" accept="audio/*"> -->
                        <!-- 모든 이미지 타입 선택 가능 -->
                        <!-- <input type="file" name="pic" id="pic" accept="image/*"> -->
                        <!-- 해당 확장자의 이미지 타입만 가능 -->
                        <input type="file" name="pic2" id="pic2" accept=".png, .jpg, .gif">
                    </td>
                </tr>
                <tr>
                    <th><label for="memo">하고 싶은 말</label></th>
                    <td>
                        <!-- 값을 넣으면 똑같이 반영 되므로 주의 -->
                        <textarea name="memo" id="memo" cols="30" rows="10"></textarea>
                    </td>
                </tr>
                <tr>
                    <th><label for="color">좋아하는 색상</label></th>
                    <td>
                        <input type="color" name="color" id="color">
                    </td>
                </tr>
            </tbody>
        </table>
    </fieldset>
    <!-- #endregion -->
    <table class="tb1">
        <tbody>
            <tr>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td colspan="3">
                    <!-- button 태그는 기본 타입이 submit 이다.-->
                    <input type="submit" value="회원가입">&nbsp;
                    <input type="reset" value="취소">
                </td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </tbody>
    </table>
</form>
<hr>
<br>