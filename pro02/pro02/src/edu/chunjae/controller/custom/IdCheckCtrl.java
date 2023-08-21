package edu.chunjae.controller.custom;

import edu.chunjae.model.CustomDAO;
import org.json.JSONObject;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/IdCheck.do")
public class IdCheckCtrl extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        CustomDAO dao = new CustomDAO();
        boolean pass = false;
        pass = dao.idCheck(id);

        JSONObject json = new JSONObject();
        json.put("result", pass);
        PrintWriter out = resp.getWriter();
        out.println(json.toString());

        /*
        String id = req.getParameter("id");

        CustomDAO dao = new CustomDAO();
        boolean idExists = dao.idCheck(id);

        System.out.println(id);
        System.out.println(idExists);

        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("result", idExists);

        resp.setContentType("application/x-json; charset=utf-8");
        resp.getWriter().write(jsonResponse.toString()); // 전송이 되는 부분*/
    }
}
