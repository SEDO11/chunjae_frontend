package edu.chunjae.controller.file;

import edu.chunjae.dto.Fileud;
import edu.chunjae.model.FileudDAO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/FileList.do")
public class FileList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FileudDAO dao = new FileudDAO();
        List<Fileud> fileList = new ArrayList<>();
        fileList = dao.getFileList();
        request.setAttribute("fileList",fileList);
        RequestDispatcher view = request.getRequestDispatcher("/file/fileList.jsp");
        view.forward(request, response);
    }
}
