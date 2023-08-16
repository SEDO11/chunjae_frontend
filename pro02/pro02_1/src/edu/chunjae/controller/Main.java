package edu.chunjae.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Main extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = "천재 김기태";

        ServletContext application = req.getServletContext();
        String realpath = req.getSession().getServletContext().getRealPath("/");

        application.setAttribute("realPath", realpath); // path 정보를 어플리케이션 세션에 저장

        // url를 통해 직접 들어오는 걸 방지해서 서블릿을 통해서만 접근
        req.setAttribute("user", user);
        RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/index.jsp");
        view.forward(req, resp);
    }
}
