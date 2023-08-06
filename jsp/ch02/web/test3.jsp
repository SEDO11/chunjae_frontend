<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="dto.Student" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>객체를 받는 곳</title>
</head>
<body>
    <%
        out.println("<h2>Student</h2>");
        out.println("<ul>");
        Student st1 = (Student) request.getAttribute("st1");
        out.println("<li>"+st1.getNum()+"</li>");
        out.println("<li>"+st1.getName()+"</li>");
        out.println("<li>"+st1.getKor()+"</li>");
        out.println("<li>"+st1.getEng()+"</li>");
        out.println("<li>"+st1.getMat()+"</li>");
        out.println("</ul>");
        out.println("<hr>");

        out.println("<h2>List&lt;Student&gt;</h2>");
        List<Student> list = (List<Student>) request.getAttribute("list");
        for(Student s : list) {
            out.println("<ul>");
            out.println("<li>"+s.getNum()+"</li>");
            out.println("<li>"+s.getName()+"</li>");
            out.println("<li>"+s.getKor()+"</li>");
            out.println("<li>"+s.getEng()+"</li>");
            out.println("<li>"+s.getMat()+"</li>");
            out.println("</ul>");
        }
        out.println("<hr>");

        out.println("<h2>List&lt;String&gt</h2>");
        List<String> lst = (List<String>) request.getAttribute("lst");
        out.println("<ul>");
        for(String s : lst) {
            out.println("<li>"+s+"</li>");
        }
        out.println("</ul>");
        out.println("<hr>");

        out.println("<h2>Set&lt;String&gt</h2>");
        Set<String> set = (Set<String>) request.getAttribute("set");
        out.println("<ul>");
//        for(String s : set) {
//            out.println("<li>"+s+"</li>");
//        }
        Iterator iter = set.iterator(); // 정석
        while(iter.hasNext()) {
            out.println("<li>"+iter.next()+"</li>");
        }
        out.println("</ul>");
        out.println("<hr>");

        out.println("<h2>Map&lt;Integer, String&gt</h2>");
        Map<Integer, String> map = (Map<Integer, String>) request.getAttribute("map");
        out.println("<ul>");

        // key, value 둘 다 추출
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            out.println("<li> key : "+ entry.getKey() +"&nbsp;&nbsp;&nbsp;&nbsp;value : " + entry.getValue() +"</li>");
        }

        // map에서 key만 추출

        // map에서 value만 추출
        out.println("</ul>");
        out.println("<hr>");
    %>
</body>
</html>
