<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>공지사항 목록</title>
    <c:set var="path" value="<%=request.getContextPath() %>" />
    <%@ include file="../common.jsp"%>
    <style>
    #tb1 { width:960px; margin:40px auto; }
    #tb1 th { background-color: #111; color:#fff; }
    .item1 { width:10%; }
    .item2 { width:70%; }
    .item3 { width:10%; }
    .item4 { width:10%; }
    #page-nation1 { width: 960px; margin:20px auto; }
    </style>
</head>
<body>
<div class="container-fluid">
    <%@ include file="../header.jsp"%>
    <div class="contents" style="min-height:100vh">
        <nav aria-label="breadcrumb container-fluid" style="padding-top:28px; border-bottom:2px solid #666;">
            <div class="container">
                <ol class="breadcrumb justify-content-end">
                    <li class="breadcrumb-item"><a href="${path }">Home</a></li>
                    <li class="breadcrumb-item"><a href="#">Notice</a></li>
                    <li class="breadcrumb-item active" aria-current="page">List</li>
                </ol>
            </div>
        </nav>
        <h2 class="title">상품 목록</h2>
        <div class="container">
            <div class="box_wrap">
                <table class="table table-secondary" id="tb1">
                    <thead>
                    <tr>
                        <th class="item1">항목1</th>
                        <th class="item2">항목2</th>
                        <th class="item3">항목3</th>
                        <th class="item4">항목4</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td class="item1">값1</td>
                        <td class="item2">값2</td>
                        <td class="item3">값3</td>
                        <td class="item4">값4</td>
                    </tr>
                    <tr>
                        <td class="item1">값1</td>
                        <td class="item2">값2</td>
                        <td class="item3">값3</td>
                        <td class="item4">값4</td>
                    </tr>
                    <tr>
                        <td class="item1">값1</td>
                        <td class="item2">값2</td>
                        <td class="item3">값3</td>
                        <td class="item4">값4</td>
                    </tr>
                    <tr>
                        <td class="item1">값1</td>
                        <td class="item2">값2</td>
                        <td class="item3">값3</td>
                        <td class="item4">값4</td>
                    </tr>
                    <tr>
                        <td class="item1">값1</td>
                        <td class="item2">값2</td>
                        <td class="item3">값3</td>
                        <td class="item4">값4</td>
                    </tr>
                    <tr>
                        <td class="item1">값1</td>
                        <td class="item2">값2</td>
                        <td class="item3">값3</td>
                        <td class="item4">값4</td>
                    </tr>
                    <tr>
                        <td class="item1">값1</td>
                        <td class="item2">값2</td>
                        <td class="item3">값3</td>
                        <td class="item4">값4</td>
                    </tr>
                    <tr>
                        <td class="item1">값1</td>
                        <td class="item2">값2</td>
                        <td class="item3">값3</td>
                        <td class="item4">값4</td>
                    </tr>
                    <tr>
                        <td class="item1">값1</td>
                        <td class="item2">값2</td>
                        <td class="item3">값3</td>
                        <td class="item4">값4</td>
                    </tr>
                    <tr>
                        <td class="item1">값1</td>
                        <td class="item2">값2</td>
                        <td class="item3">값3</td>
                        <td class="item4">값4</td>
                    </tr>
                    </tbody>
                </table>
                <nav aria-label="Page navigation example" id="page-nation1">
                    <ul class="pagination">
                        <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                        <li class="page-item"><a class="page-link" href="#">1</a></li>
                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                        <li class="page-item"><a class="page-link" href="#">Next</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
    <%@ include file="../footer.jsp" %>
</div>
</body>
</html>
