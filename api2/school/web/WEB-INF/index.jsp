<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<div>
    <h2>${schoolName}등학교 식단표</h2>
    <c:forEach var="eat" items="${ddishList }" varStatus="status">
        <div>
            <h3>날짜 : ${mlsvList.get(status.index)}</h3>
            ${eat}
        </div>
        <br>
        <hr>
        <br>
    </c:forEach>
</div>
</body>
</html>
