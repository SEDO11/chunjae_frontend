<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회사소개</title>
    <%@include file="../head.jsp"%>

    <script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>

    <!-- 스타일 초기화 : reset.css 또는 normalize.css -->
    <link href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css" rel="stylesheet">
    <!-- 웹 폰트 -->
    <link rel="stylesheet" href="../css/font.css">

    <!-- css 모듈화 -->
    <link rel="stylesheet" href="../css/common.css">
    <link rel="stylesheet" href="../css/hd.css">
    <link rel="stylesheet" href="../css/ft.css">
    <link rel="stylesheet" href="../css/change_img.css">
    <link rel="stylesheet" href="../css/slidebox.css">

    <style>
        /* 본문 영역 스타일 */
        .contents {
            clear: both;
            min-height: 100vh;
        }

        .contents::after {
            content: "";
            clear: both;
            display: block;
            width: 100%;
        }

        .page {
            clear: both;
            width: 100vw;
            min-height: 100vh;
            position: relative;
            overflow: hidden;
        }

        .page::after {
            content: "";
            display: block;
            width: 100%;
            clear: both;
        }

        .page_wrap {
            clear: both;
            width: 1200px;
            height: auto;
            margin: 0 auto;
        }

        .page_wrap2 {
            clear: both;
            width: 800px;
            height: auto;
            margin: 0 auto;
        }

        .page_tit {
            font-size: 48px;
            text-align: center;
            padding-top: 1em;
            color: #333;
            padding-bottom: 2.4rem;
        }

        .back_bread {
            height: 100px;
            background-image: url("../img/login.jpg");
            background-repeat: no-repeat;
        }

        .breadcrumb {
            clear: both;
            width: 1200px;
            height: 100%;
            margin: 0 auto;
            text-align: right;
            color: #fff;
            line-height: 60px;
        }

        .breadcrumb a {
            color: #fff;
        }

        .tab_box {
            clear: both;
            width: 600px;
            height: 42px;
            margin: 0 auto;
            position: fixed;
            bottom: 0;
            left: 50%;
            margin-left: -300px;
            z-index: 99;
        }

        .tab_box li {
            width: 300px;
            height: 42px;
            line-height: 42px;
            float: left;
        }

        .tab_box li label {
            display: block;
            width: 100%;
            text-align: center;
            background-color: rgba(136, 255, 0, 0.7);
        }

        .tab_box li label:hover {
            background-color: rgba(1, 95, 1, 0.9);
            color: white;
            font-size: 20px;
        }

        .com_content {
            width: 600px;
        }

        .con_tit {
            font-size: 48px;
            line-height: 1.3;
        }

        .cont {
            font-size: 24px;
            margin-top: 50px;
        }

        .com_img {
            width: 1000px;
            position: absolute;
            top: 300px;
            left: 1000px;
            float: right;
        }

        .ra1 {display: none;}
        .ra1:not(:checked) + .page {display: none;} /*버튼이 체크 되있지 않으면*/
        .ra1:checked + .page {display: block;}
        .ra1:checked #map {display: block;}
        /*.ra1:checked + #tab2 {height: 800px;} 버튼이 체크 되어 있으면*/

        /*.maparea { }*/

        .join_type {
            display: flex;
            list-style: none;
            padding: 0;
        }

        ul.join_type {
            padding: 0;
            margin: 20px 0;
        }

        .join_type li:last-child {
            margin-left: 80px;
        }
        h3 {
            font-size: 30px;
        }
        h4 {
            font-size: 20px;
        }
    </style>
</head>
<body>
    <div class="wrap">
        <header class="hd">
            <%@include file="../header.jsp"%>
        </header>
        <div class="contents">
            <div class="back_bread">
                <div class="breadcrumb">
                    <p><a href="">HOME</a> &gt; <a href="">회사소개</a></p>
                </div>
            </div>
            <div class="tab_box">
                <ul>
                    <li><label for="com">회사소개</label></li>
                    <li><label for="map1">오시는길</label></li>
                </ul>
            </div>

            <input type="radio" name="ra1" class="ra1" id="com" checked/>
            <section class="page" id="com">
                <div class="page_wrap">
                    <h2 class="page_tit">회사소개</h2>
                    <div class="com_content">
                        <h3 class="con_tit">대한민국 1위 IT 교육 사이트</h3>
                        <h3 class="con_tit">IT의 미래를 선도합니다.</h3>
                        <p class="cont">ITALL은 전 연령을 대상으로 IT 교육을 시켜주는 회사입니다. <br><br>
                            ITAll은 모든 연령층을 대상으로 한 IT 교육을 제공하는 혁신적인 온라인 교육 플랫폼입니다. 현대 사회에서 IT 기술은 필수불가결한 역할을 하고 있는데요,
                            ITAll은 이러한 환경을 고려하여 누구나 쉽게 접근하고 배울 수 있는 환경을 제공합니다. <br><br>

                            우리는 초보자부터 전문가까지 모든 수준의 학습자를 위한 다양한 코스와 자원을 제공합니다.
                            입문자를 위한 기본 강좌부터 고급 토픽까지 다양한 분야의 강의를 보유하고 있어, 개인의 수준과 목표에 맞게 학습 경로를 선택할 수 있습니다. <br><br>

                            ITAll은 최신 트렌드에 맞춰 개발된 콘텐츠를 제공하여 학습자들이 현업에서 실제로 활용 가능한 기술과 지식을 습득할 수 있습니다.
                            또한, 상호작용이 가능한 실습과 프로젝트 과제를 통해 이론을 실제 상황에서 적용하는 경험을 제공하여 더 나은 학습 효과를 도모합니다. <br><br>
                        </p>
                    </div>
                    <img src="../img/company1.jpg" alt="" class="com_img">
                </div>
            </section>

            <input type="radio" name="ra1" class="ra1" id="map1"/>
            <section class="page" id="map1">
                <div class="page_wrap2">
                    <h2 class="page_tit">오시는길</h2>
                    <div>
                        <ul class="join_type">
                            <li class="maparea">
                                <div id="map" style="width:500px;height:400px;"></div>
                                <!-- 보안성을 위해 자바스크립트에서 실행후 불러옴-->
                                <script type="text/javascript" src="/api/kakaoMap.js"></script>
                            </li>
                            <li>
                                <h3>교통편</h3>
                                <br>
                                <h4>버스</h4>
                                <p>503, 571, 5536, 5616, 5712, 5714</p>
                                <br>
                                <hr>
                                <br>
                                <h4>지하철</h4>
                                <p>가산디지털단지역 (7호선)</p>
                            </li>
                        </ul>
                    </div>
                </div>
            </section>
        </div>
        <footer class="ft">
            <%@include file="../footer.jsp"%>
        </footer>
    </div>
    <!-- 화면 보이기-->
    <script src="../js/load.js"></script>
</body>
</html>
