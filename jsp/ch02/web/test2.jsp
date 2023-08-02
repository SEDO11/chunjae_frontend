<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="dto.Student" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<%
    Student st1 = new Student();
    st1.setNum(1);
    st1.setName("홍길동");
    st1.setKor(90);
    st1.setEng(85);
    st1.setMat(95);
    request.setAttribute("st1", st1); // st1 데이터를 저장

    List<Student> list = new ArrayList<>();
    Student st2 = new Student();
    st2.setNum(2);
    st2.setName("강감찬");
    st2.setKor(50);
    st2.setEng(60);
    st2.setMat(70);
    list.add(st2);

    Student st3 = new Student();
    st3.setNum(3);
    st3.setName("이순신");
    st3.setKor(85);
    st3.setEng(75);
    st3.setMat(65);
    list.add(st3);
    request.setAttribute("list", list);

    List<String> lst = new ArrayList<>();
    lst.add("오세훈");
    lst.add("구예진");
    lst.add("백준철");
    lst.add("신승원");
    lst.add("오세훈");
    request.setAttribute("lst", lst);

    Set<String> set = new HashSet<>();
    set.add("오세훈");
    set.add("구예진");
    set.add("백준철");
    set.add("신승원");
    // set 이기 때문에 중복 x
    set.add("오세훈");
    set.add("구예진");
    request.setAttribute("set", set);

    Map<Integer, String> map = new HashMap<>();
    map.put(1, "안녕");
    map.put(2, "하세요");
    map.put(3, "저는");
    map.put(4, "누구입니다.");
    request.setAttribute("map", map);
    RequestDispatcher rd = request.getRequestDispatcher("test3.jsp");
    rd.forward(request, response);
%>
</body>
</html>
