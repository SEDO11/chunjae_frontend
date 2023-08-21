<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <%@ include file="/common.jsp"%>
</head>
<body>
    <h2>파일 첨부 테스트</h2> <%-- 파일 첨부 3개 --%>
    <form action="${path}/FileUpload2Pro.do" method="post" enctype="multipart/form-data">
        <table class="table">
            <tbody>
            <tr>
                <th></th>
                <td></td>
            </tr>
            <tr>
                <th></th>
                <td></td>
            </tr>
            <tr>
                <th></th>
                <td></td>
            </tr>
            <tr>
                <th></th>
                <td></td>
            </tr>
            <tr>
                <th></th>
                <td></td>
            </tr>
            </tbody>
        </table>
    </form>
</body>
</html>
