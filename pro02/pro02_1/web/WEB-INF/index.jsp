<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <title>메인페이지</title>
    <%@ include file="/common.jsp"%>
    <c:set var="path1" value="<%=request.getContextPath()%>" />
</head>
<body>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Dropdown
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="#">인사말</a></li>
                            <li><a class="dropdown-item" href="#">회사연혁</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="#">오시는 길</a></li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                    </li>
                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
    <div class="container"> <%-- fruid-container --%>
        <h2>사용자 : ${user }</h2>
        <h2>메인 절대 주소 : ${realPath }</h2>
        <h2>메인 상대 주소 : ${path1} </h2>
        <hr>
        <table>
            <tr>
                <th>이미지1</th>
                <th>이미지2</th>
            </tr>
            <tr>
                <td><img src="./img/neom.jpg" alt="이미지1" width="300"></td>
                <td><img src="./img/mauro.jpg" alt="이미지2" width="300"></td>
                <%-- <td><img src="./WEB-INF/img_inf/mauro.jpg" alt=""></td> <!-- web.xml에 따로 지정해야 이미지가 출력됨 -->--%>
            </tr>
        </table>
    </div>
    <footer>
        <%@ include file="/footer.jsp"%>
    </footer>
</body>
</html>
