<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>상품리스트</title>
    <c:set var="path" value="<%=request.getContextPath() %>" />
    <%@ include file="../common.jsp"%>
</head>
<body>
<div class="container-fluid">
    <%@ include file="../header.jsp"%>
    <div class="contents" style="min-height:100vh">
        <nav aria-label="breadcrumb container-fluid" style="padding-top:28px; border-bottom:2px solid #666;">
            <div class="container">
                <ol class="breadcrumb justify-content-end">
                    <li class="breadcrumb-item"><a href="${path }">Home</a></li>
                    <li class="breadcrumb-item"><a href="#">Product</a></li>
                    <li class="breadcrumb-item active" aria-current="page">List</li>
                </ol>
            </div>
        </nav>
        <h2 class="title">상품 목록</h2>
        <table class="table">
            <thead>
            <tr>
                <th>이미지</th>
                <th>번호</th>
                <th>제목</th>
                <th>출간일</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="pro" items="${proList }">
                <tr>
                    <td><img src="${path }/storage/${pro.imgSrc1 }" width="100"/></td>
                    <td>${pro.no }</td>
                    <td>
                        <a href="${path}/Product.do?no=${pro.no}">${pro.pname}</a>
                    </td>
                    <td>${pro.resdate }</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <%@ include file="../footer.jsp" %>
</div>
</body>
</html>