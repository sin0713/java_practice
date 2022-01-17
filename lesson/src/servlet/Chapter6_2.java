package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Chapter6_2
 */
@WebServlet("/ex62")
public class Chapter6_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = (int) (Math.random() * 10);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/forwarded.jsp");

		if (num % 2 == 0) {
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("/WEB-INF/jsp/redirected.jsp");
		}

	}

}
