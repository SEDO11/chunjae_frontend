package edu.chunjae.controller.product;

import edu.chunjae.dto.Notice;
import edu.chunjae.dto.Product;
import edu.chunjae.model.ProductDAO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/Product.do")
public class ProductCtrl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int no = Integer.parseInt(request.getParameter("no"));
        ProductDAO dao = new ProductDAO();
        Product pro = dao.getProduct(no);
        System.out.println(pro.toString());
        request.setAttribute("pro", pro);
        RequestDispatcher view = request.getRequestDispatcher("/product/getProduct.jsp");
        view.forward(request, response);
    }
}
