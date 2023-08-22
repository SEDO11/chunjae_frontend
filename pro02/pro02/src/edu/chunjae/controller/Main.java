package edu.chunjae.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

// 세션정보가 main에 있다.
public class Main extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = "";

        ServletContext application = request.getServletContext();
        String realPath = request.getSession().getServletContext().getRealPath("/");

        application.setAttribute("realPath", realPath);  //${realPath }

        request.setAttribute("user", user);
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
        view.forward(request, response);
    }
}
