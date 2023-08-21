package edu.chunjae.controller.admin;

import edu.chunjae.model.CustomDAO;
import edu.chunjae.model.NoticeDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/customDeletePro.do")
public class customDeletePro extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        CustomDAO dao = new CustomDAO();
        int a = dao.deleteCustom(id);
        response.sendRedirect("/pro02/WEB-INF/admin/customList.jsp");

        /*
        NoticeDAO dao = new NoticeDAO();
        int a = dao.deleteNotice(no);

        PrintWriter out = response.getWriter();*/
        /*
        if(a>0){
            response.sendRedirect("/AdminNoticeList.do");
        } else {
            out.println("<script>history.go(-1);</script>");
        }*/
    }
}
