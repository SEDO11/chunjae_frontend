<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="head.jsp"%> <%-- head 영역 호출 --%>
    <!-- 플러그인 연결-->
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>

    <!-- 스타일 초기화 : reset.css 또는 normalize.css -->
    <link href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css" rel="stylesheet">
    <!-- 웹 폰트 -->
    <link rel="stylesheet" href="./css/font.css">

    <!-- css 모듈화 -->
    <link rel="stylesheet" href="./css/common.css">
    <link rel="stylesheet" href="./css/hd.css">
    <link rel="stylesheet" href="./css/ft.css">
    <link rel="stylesheet" href="./css/change_img.css">
    <link rel="stylesheet" href="./css/slidebox.css">

    <style>
        .img_box li.item1 .bg_box { background-image: url("./img/cj1.jpg"); }
        .img_box li.item2 .bg_box { background-image: url("./img/cj2.jpg"); }


        .page {clear: both; width: 100vw; height: 100vh; position: relative;}
        .page::after {content: ""; display: block; width: 100vw; clear: both;}
        .page_wrap { clear: both; width: 1200px; height: auto; margin: 0 auto;}
        .page_tit {font-size: 48px; text-align: center; padding-top: 50px; padding-top: 0.5em;}

        #page1 {background-color: #f1f2f1; background-image: url("./img/bg_social_ptn01.png"); background-position: 15vw 75vh;
            background-repeat: no-repeat; padding-top: 50px;}

        .pic_lst {clear: both; width: 1200px; margin: 150px auto;}
        .pic_lst li {width: 280px; height: 400px; margin-left: 26px; float: left; background-repeat: no-repeat;
            background-position: center center; background-size: cover; filter: blur(1px) brightness(80%); box-shadow: 12px 12px 12px #999;}
        .pic_lst li a { display: block; width: 256px; height: 376px; margin: 11px;}
        .pic_lst li a:hover {border: 1px solid #fff; transition: 0.3s;}
        .pic_lst li:first-child {margin-left: 0;} /* 안쪽에만 마진이 있으므로 테두리 부분의 마진 제거*/
        .pic_lst li.item1 { background-image: url("./img/img_social_main01.jpg");}
        .pic_lst li.item2 { background-image: url("./img/img_social_main02.jpg");}
        .pic_lst li.item3 { background-image: url("./img/img_social_main03.jpg");}
        .pic_lst li.item4 { background-image: url("./img/img_social_main04.jpg");}
        .pic_lst li:hover { margin-top: -20px; transition: 0.5s; filter: brightness(105%); } /*호버 후 움직여서 밝기*/
        .pic_com {padding-left: 20px; padding-top: 20px; font-size: 14px;}
        .pic_tit {padding-left: 20px; padding-top: 20px; font-size: 18px;}
        .pic_arrow {display: block; width: 110px; height: 10px; border-bottom: 1px solid white; margin-left: -20px; margin-top: 20px;
            transition: 0.4s; position: relative;}
        .pic_lst li:hover .pic_arrow {margin-left: 20px;}
        .pic_arrow::after {content: ""; width: 10px; height: 10px; position: absolute; right: 0; top: 0; border-bottom: 1px solid white;
            display: block; clear: both; transform-origin: 100% 100%; transform: rotate(45deg); display: none;} /* 화살표 생성 */
        .pic_lst li:hover .pic_arrow::after {display: block;} /*처음엔 안보였다가 호버하면 화살표 생성 */

        .ico.item1 {background-position: -70px -60px;} /*네이버 블로그 아이콘*/
        .ico.item2 {background-position: -140px -120px;} /*인스타 그램 아이콘*/

        .card_lst li .thumb_box {background-image: url("./img/icon_db.png");}

        .slide_box {margin-top: 100px;}

    </style>
</head>
<body>
<header class="hd" id="hd">
    <%@include file="header.jsp"%>
</header>

<div class="contents">
    <figure class="vs">
        <ul class="img_box">
            <li class="item1 active">
                <input type="radio" name="vs_ra" id="vs_ra1" class="vs_ra" checked>
                <div class="bg_box"></div>
                <h2 class="vs_tit">“나눔의 힘! 실천의 힘!”<br>
                    <strong>작은 따뜻함으로 세상을 <br>바꿉니다</strong>
                </h2>
            </li>
            <li class="item2">
                <input type="radio" name="vs_ra" id="vs_ra2" class="vs_ra">
                <div class="bg_box"></div>
                <h2 class="vs_tit">교육에 대한 끊임없는 도전<br>
                    <strong>행복한 내일을 함께 합니다</strong></h2>
            </li>
        </ul>
        <ul class="btn_box">
            <li class="item1 active"><label for="vs_btn1" class="vs_btn"></label></li>
            <li class="item2"><label for="vs_btn2" class="vs_btn"></label></li>
        </ul>
        <button type="button" class="play_btn"></button>
    </figure>
    <script src="./js/rotation.js"></script>

    <section class="page" id="page2">
        <div class="sl-btn-box">
            <button type="button" class="btn next">&gt;</button>
            <button type="button" class="btn prev">&lt;</button>
        </div>
        <div class="page_wrap">
            <h2 class="page_tit">선생님의 쪽집게</h2>
            <!-- div.slide_box>ul.card_lst>li.item$*7>a>div.thumb_box+p.thumb_tit{썸네일제목$}+(div.ico_box>span.ico_item+span{아이콘$}.thumb_date{2023-07-18}) -->
            <div class="slide_box">
                <ul class="card_lst">
                    <li class="item1">
                        <h3 class="cate_tit">파이썬의 개념</h3>
                        <ul class="cate_lst">
                            <li >
                                <a href="https://ko.wikipedia.org/wiki/%ED%8C%8C%EC%9D%B4%EC%8D%AC" title="자세히" target="_blank">
                                    <p class="bd_content">파이썬은 1991년 귀도 반 로섬이 발표한 고급 프로그래밍 언어로,
                                        플랫폼에 독립적이며 인터프리터식, 객체지향적, 동적 타이핑 대화형 언어이다.</p>
                                    <p class="bd_date">2023-06-13</p>
                                </a>
                            </li>
                            <li>
                                <a href="">
                                    <p class="bd_content">
                                        파이썬의 변수 선언 <br>
                                        4250.0 <br>
                                    </p>
                                    <p class="bd_date">2023-07-17</p>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="item2">
                        <a href="https://blog.naver.com/tmvmffpsej/222679218621" target="_blank">
                            <div class="thumb_box"></div>
                            <p class="thumb_tit">가변 매개변수, 기본 매개변수, 키워드</p>
                            <span class="thumb_date">오세훈 강사</span>
                            <div class="ico_box">
                                <span class="ico item1"></span>
                                <span class="thumb_date">2023-07-15</span>
                            </div>
                        </a>
                    </li>
                    <li class="item3">
                        <a href="https://blog.naver.com/tmvmffpsej/222679221828" target="_blank">
                            <div class="thumb_box"></div>
                            <p class="thumb_tit">재귀 함수</p>
                            <span class="thumb_date">오세훈 강사</span>
                            <div class="ico_box">
                                <span class="ico item1"></span>
                                <span class="thumb_date">2023-07-18</span>
                            </div>
                        </a>
                    </li>
                    <li class="item4">
                        <a href="https://blog.naver.com/tmvmffpsej/222680289660" target="_blank">
                            <div class="thumb_box"></div>
                            <p class="thumb_tit">자바 클래스</p>
                            <span class="thumb_date">오세훈 강사</span>
                            <div class="ico_box">
                                <span class="ico item1"></span>
                                <span class="thumb_date">2022-03-23</span>
                            </div>
                        </a>
                    </li>
                    <li class="item5">
                        <a href="https://blog.naver.com/tmvmffpsej/222680281490" target="_blank">
                            <div class="thumb_box"></div>
                            <p class="thumb_tit">자바 자료구조</p>
                            <span class="thumb_date">오세훈 강사</span>
                            <div class="ico_box">
                                <span class="ico item1"></span>
                                <span class="thumb_date">2022-03-23</span>
                            </div>
                        </a>
                    </li>
                    <li class="item6">
                        <a href="https://blog.naver.com/tmvmffpsej/222679207398" target="_blank">
                            <div class="thumb_box"></div>
                            <p class="thumb_tit">DB 기본 쿼리</p>
                            <span class="thumb_date">오세훈 강사</span>
                            <div class="ico_box">
                                <span class="ico item1"></span>
                                <span class="thumb_date">2022-03-21</span>
                            </div>
                        </a>
                    </li>
                    <li class="item7">
                        <a href="https://blog.naver.com/tmvmffpsej/222679209494" target="_blank">
                            <div class="thumb_box"></div>
                            <p class="thumb_tit">DB 기본 쿼리 2</p>
                            <span class="thumb_date">오세훈 강사</span>
                            <div class="ico_box">
                                <span class="ico item1"></span>
                                <span class="thumb_date">2022-03-22</span>
                            </div>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </section>
    <script src="./js/slidebox.js"></script>
</div>

<footer class="ft" id="ft">
    <%@include file="footer.jsp"%>
</footer>
<a href="#" class="totop">위로</a>
</body>
</html>
