package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex5_2
 */
@WebServlet("/testenq")
public class Ex5_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8");
	    String name = request.getParameter("name");
	    String qtype = request.getParameter("qtype");
	    String body = request.getParameter("body");


	    response.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = response.getWriter();

	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<body>");
	    out.println("<p>お問い合わせを送信しました</p>");
	    out.println("<p>お問い合わせ内容確認</p>");
	    out.println("<div>名前</div>");
	    out.println("<div>" + name + "</div>");
	    out.println("<p>お問い合わせ種類</p>");
	    out.println("<div>" + qtype + "</div>");
	    out.println("<p>お問い合わせ内容</p>");
	    out.println("<div>" + body + "</div>");
	    out.println("</body>");
	    out.println("</html>");
	}

}
