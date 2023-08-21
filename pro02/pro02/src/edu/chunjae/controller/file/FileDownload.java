package edu.chunjae.controller.file;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/FileDownload.do")
public class FileDownload extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = request.getParameter("file");
        ServletContext application = request.getServletContext();

        String directory = application.getRealPath("/storage");
        File file = new File(directory + File.separator + fileName);

        String mimeType = application.getMimeType(file.toString());
        if (mimeType == null) {
            response.setContentType("application/octet-stream");
        }

        String downloadName = new String(fileName.getBytes("UTF-8"), "8859_1");

        response.setHeader("Content-Disposition", "attachment;filename=\"" +
                downloadName + "\"");

        FileInputStream fis = new FileInputStream(file);
        ServletOutputStream servletOutputStream = response.getOutputStream();

        byte b[] = new byte[1024];
        int data = 0;
        while ((data = (fis.read(b, 0, b.length))) != -1) {
            servletOutputStream.write(b, 0, data);
        }

        servletOutputStream.flush();
        servletOutputStream.close();
        fis.close();
    }
}
