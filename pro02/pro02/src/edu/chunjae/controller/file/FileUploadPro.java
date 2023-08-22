package edu.chunjae.controller.file;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import edu.chunjae.dto.Fileud;
import edu.chunjae.model.FileudDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@WebServlet("/FileUploadPro.do")
public class FileUploadPro extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = "";
        ServletContext application = request.getServletContext();
        FileudDAO dao = new FileudDAO();

        try {
            String saveDirectory = application.getRealPath("/storage"); //실제 저장 경로
            int maxSize = 1024*1024*10;     //10MB
            String encoding = "UTF-8";

            MultipartRequest mr = new MultipartRequest(request, saveDirectory, maxSize, encoding, new DefaultFileRenamePolicy());
            Fileud file = new Fileud();
            file.setUname(mr.getParameter("uname"));
            file.setSubject(mr.getParameter("subject"));
            file.setContent(mr.getParameter("content"));

            Enumeration files = mr.getFileNames();
            String item = (String) files.nextElement();

            String oriFile = mr.getOriginalFileName(item); //실제 첨부된 파일경로와 이름
            String fileName = mr.getFilesystemName(item);  //파일이름만 추출

            File upfile = mr.getFile(item); //실제 업로드
            if(upfile.exists()){
                msg = "파일 업로드 성공";
            } else {
                msg = "파일 업로드 실패";
            }

            file.setFilename(upfile.getName());
            dao.fileUpload(file);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        response.sendRedirect("/pro02/FileList.do");
    }
}

