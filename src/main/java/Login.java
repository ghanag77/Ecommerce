import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/login" })
public class Login extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		try {
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out=response.getWriter();
			HttpSession session = request.getSession(false);
			if (session != null) {
				response.sendRedirect("/home");	
			} else {
				response.setHeader("Cache-Control", "no-store");
				request.getRequestDispatcher("login.html").forward(request, response);
			}

		} catch (Exception e) {
			// TODO: handle exception
			request.getRequestDispatcher("/home").forward(request, response);
		}
	}
}