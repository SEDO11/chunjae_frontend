package edu.chunjae.notice;

import edu.chunjae.dao.NoticeDAO;
import edu.chunjae.dto.Notice;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/NoticeList.jsp")// 사용자 접근 파일 주소
public class NoticeListCtrl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("msg", "공지사항 목록을 출력합니다.");

        NoticeDAO dao = new NoticeDAO();
        List<Notice> notiList = dao.getNoticeList();
        request.setAttribute("notiList", notiList);

    }
}
