package ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FruitServlet
 */
@WebServlet("/FruitServlet")
public class FruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Fruit strawberry = new Fruit("イチゴ", 700);
		ServletContext application = this.getServletContext();

		application.setAttribute("strawberry", strawberry);


		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ex/fruit.jsp");
		dispatcher.forward(request, response);
	}
}
