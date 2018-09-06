import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/session" })
public class SessionCreation extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		Cookie c=new Cookie("JSESSIONID", session.getId());
		c.setMaxAge(Integer.MAX_VALUE);
		response.addCookie(c);
		response.setHeader("Cache-Control", "no-store");
		response.sendRedirect("/home");
	}
}