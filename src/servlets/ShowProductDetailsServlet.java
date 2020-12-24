package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Product;


@WebServlet("/ShowProductDetailsServlet")
public class ShowProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("pname");
		String details = request.getParameter("pdetails");
		
		HttpSession session = request.getSession();
		Product product = new Product(name, details);
		session.setAttribute("product",  product);
		response.sendRedirect("productdetails.jsp");
		
	}

}
