<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="org.apache.commons.fileupload.*" %>
<%@ page import="org.apache.commons.fileupload.disk.*" %>
<%@ page import="org.apache.commons.fileupload.servlet.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.chunjae.util.FileUtil" %>
<%@ page import="com.chunjae.util.FeedDAO" %>
<%@ include file="/encoding.jsp"%>
<html>
<head>
    <title>apach</title>
</head>
<body>
<%
    String uid = null, ucontent = null, ufname = null;
    byte[] ufile = null;

    ServletFileUpload sfu = new ServletFileUpload(new DiskFileItemFactory());
    List items = sfu.parseRequest(request);

    Iterator iter = items.iterator();

    String root = application.getRealPath("/");
    while(iter.hasNext()) {
        FileItem item = (FileItem) iter.next();
        String name = item.getFieldName();
        if(item.isFormField()) {
            String value = item.getString("UTF-8");
            if(name.equals("id")) uid = value;
            else if(name.equals("content")) ucontent = value;
        } else {
            if(name.equals("image")) {
                ufname = item.getName();
                ufile = item.get();
                FileUtil.saveImage(root, ufname, ufile);
            }
        }
    }
    root = root.replace("\\", "/");
    root += "image/" + ufname;
    FeedDAO dao = new FeedDAO();
    if(dao.insert(uid, ucontent, root)) {
        response.sendRedirect("/");
    } else {
        out.print("작성 글의 업로드중 오류 발생");
    }
%>
</body>
</html>
