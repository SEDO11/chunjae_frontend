<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<div class="ft_wrap">
    <nav class="ft_link">
        <ul class="fnb">
            <li class="ft_logo"></li>
            <li><a href="">제휴 문의</a></li>
            <li><a href="">이메일 무단 수집 거부</a></li>
        </ul>
        <ul class="snb">
            <li class="item1"><a href="https://www.facebook.com/profile.php?id=100005061229348"></a></li> <!-- 페북 -->
            <li class="item3"><a href="https://blog.naver.com/tmvmffpsej"></a></li> <!-- 블로그 -->
            <li class="item4"><a href="https://www.youtube.com/channel/UCgJ8iR8g3_7Cx-kqZZAcRrQ">소셜4</a></li> <!-- 유튜브 -->
            <li class="item5"><a href="https://www.instagram.com/se_do11/">소셜5</a></li> <!-- 인스타 -->
        </ul>
    </nav>
    <script>
        function loc(){
            var url = document.getElementById("sel").value;
            //location.href = url;  //현재 창에
            if(url!="") {
                var win = window.open(url); //새창에
            }
        }
    </script>
</div>
<div class="ft_wrap2">
    <p class="copyright">
        <span>(주)ITALL</span>
        <span>서울시 금천구 가산로9길 54</span>
        <span>대표자 오세훈</span>
        <span>사업자등록번호 111-22-333333</span>
        <span>통신판매신고번호 제55-555호</span>
        <span class="end">부가통신사업신고 123456</span>
    </p>
    <p class="cp">COPYRIGHT 1981-2023 ITALL EDUCATION INC. ALL RIGHTS RESERVED.</p>
</div>