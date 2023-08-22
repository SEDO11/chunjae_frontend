package edu.chunjae.controller.file;

import edu.chunjae.model.FileudDAO;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FileDelete.do")
public class FileDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = request.getParameter("file");
        ServletContext application = request.getServletContext();
        FileudDAO dao = new FileudDAO();

        String directory = application.getRealPath("/storage");
        File file = new File(directory + File.separator + fileName);
        PrintWriter out = response.getWriter();

        System.out.println(fileName);

        if (file.exists()) {
            file.delete();
            int cnt = dao.fileDelete(fileName);
            if(cnt > 0) {
                System.out.println("삭제 성공");
            } else {
                System.out.println("삭제 실패");
            }

        } else {
            System.out.println("삭제 실패");
        }
        response.sendRedirect("/pro02/FileList.do");
    }
}
