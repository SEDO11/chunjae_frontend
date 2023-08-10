<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%-- 1. 라이브러리 가져옴 --%>
<%@ page import="com.chunjae.util.*" %>
<%@ page import="java.util.*, javax.mail.*, javax.mail.internet.*" %>
<%-- 2. 인코딩 설정--%>
<%@ include file="/encoding.jsp"%>

<%-- 학원에서는 안되니 집에서 해봐라--%>
<%
    //3. 보내온 이메일 데이터 받기
    String name = request.getParameter("name");
    String id = request.getParameter("id");
    String email = request.getParameter("email");    //보내는 사람 이메일
    String tel = request.getParameter("tel");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String to = "do11anm@naver.com";  //받는 사람 이메일

    //4. smtp 설정 -> Properties 활용
    Properties p = new Properties();
    p.put("mail.smtp.host","smtp.naver.com");
    p.put("mail.smtp.port", "465");
    p.put("mail.smtp.starttls.enable", "true");
    p.put("mail.smtp.ssl.enable", "true");
    p.put("mail.smtp.auth", "true");
    p.put("mail.smtp.debug", "true");
    p.put("mail.smtp.socketFactory.port", "465");
    p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    p.put("mail.smtp.socketFactory.fallback", "false");

    //5. 이메일 보내기
    try {
        Authenticator auth = new SMTPAuthenficator();
        Session ses = Session.getInstance(p, auth); // 인증 권한이 필요할 때 메일을 보낼 경우
//        Session.getDefaultInstance(p) //인증 권한이 필요 없을 때 이메일을 보낼 경우 사용, 이미 로그인 된 경우
        ses.setDebug(true);
        MimeMessage msg = new MimeMessage(ses); // 파일 첨부나 객체 까지 전달할 때 사용하는 클래스

        msg.setSubject(title); //  제목 추가

        StringBuffer buffer = new StringBuffer();   //이메일 내용
        buffer.append("보내는 사람 : ");
        buffer.append(name+"\n");
        buffer.append("연락처 : ");
        buffer.append(tel+"\n");
        buffer.append("이메일 : ");
        buffer.append(email+"\n");
        buffer.append("제목 : ");
        buffer.append(title+"\n");
        buffer.append("내용 : ");
        buffer.append(content+"\n");

        // string을 인터넷 주소로 변형
        Address fromAddr = new InternetAddress(email);  //보내는 사람
        msg.setFrom(fromAddr);

        Address toAddr = new InternetAddress(to);      // 받는 사람
        msg.addRecipient(Message.RecipientType.TO, toAddr); // 하나의 이메일 주소만 등록

        // 버퍼의 내용을 보낼때 사용
        msg.setContent(buffer.toString(), "text/html;charset=UTF-8"); // 내용
        Transport.send(msg); // 메일 전송
    } catch(Exception e){
        e.printStackTrace();
        return;
    } finally {
        response.sendRedirect("/index.jsp");
    }

%>
