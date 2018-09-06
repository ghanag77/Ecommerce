import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/signout" })
public class signout extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		try {
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			HttpSession session=request.getSession();
			session.removeAttribute("name");
			session.invalidate();
			Cookie c=new Cookie("JSESSIONID","");
			c.setMaxAge(0);
			response.addCookie(c);
			response.sendRedirect("https://ebuy-210510.appspot.com/login.html");
			
		} catch (Exception e) {
			// TODO: handle exception
			request.getRequestDispatcher("login.html").forward(request, response);
		}
	}
}