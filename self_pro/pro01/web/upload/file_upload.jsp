<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String savePath = application.getRealPath("./file/");
    int sizeLimit = 10 * 1024 * 1024; // 최대 10mb 저장
    System.out.println(savePath);

    MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "UTF-8", new DefaultFileRenamePolicy());

    String fileRealName = multi.getFilesystemName("file");
    String fileName = multi.getOriginalFileName("file");
%>
</body>
</html>
