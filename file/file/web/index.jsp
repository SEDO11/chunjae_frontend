<%@ page import="java.io.InputStream" %>
<%@ page import="static jdk.jpackage.internal.IOUtils.getFileName" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- 파일 업로드 폼 -->
    <form action="" method="post" enctype="multipart/form-data">
        Select File: <input type="file" name="file"><br>
        <input type="submit" name="upload" value="Upload">
    </form>

    <!-- 파일 업로드 처리 -->
    <%
        if (request.getParameter("upload") != null) {
            String uploadPath = "YOUR_UPLOAD_DIRECTORY_PATH_HERE";
            String fileName = "";
            InputStream fileContent = null;

            Part filePart = request.getPart("file");
            if (filePart != null) {
                fileName = getFileName(String.cfilePart);
                fileContent = filePart.getInputStream();
                // 파일 업로드 작업 수행
                // ...
            }
            // 업로드 완료 메시지 표시
            out.println("File uploaded successfully: " + fileName);
        }
    %>
</body>
</html>
