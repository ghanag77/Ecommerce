import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/product" })
public class HelloAppEngine extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		

		try {
			HttpSession session=request.getSession(false);
			try {
			if (session != null) {
				String name=(String)session.getAttribute("name");
				out.print("<html><head><meta http-equiv=\"content-type\"\n" + 
						"	content=\"application/xhtml+xml; charset=UTF-8\" /><h1>E-Buy<h2>Welcome "+name+"</h2>");
				out.print("<style>\n" + 
						"h1 {\n" + 
						"	background-position: top;\n" + 
						"	background-size: 4cm;\n" + 
						"	background-color: #4fa3f2;\n" + 
						"	margin-top: 0cm;\n" + 
						"	text-align: left;\n" + 
						"	letter-spacing: 3pt;\n" + 
						"	font-size: 30pt;\n" + 
						"	font-family: fantasy;\n" + 
						"	margin-left: 0cm;\n" + 
						"	margin-right: 0cm;\n" + 
						"	height: 1.5cm;\n" + 
						"}\n" + 
						"");
				out.print(
						"body, html {\n" + 
						"	height: 100%;\n" + 
						"	margin: 0;\n" + 
						"	height: 100%;\n" + 
						"	overflow: hidden;\n" + 
						"	/* Center and scale the image nicely */\n" + 
						"	background-position: center;\n" + 
						"	background-repeat: no-repeat;\n" + 
						"	background-size: cover;\n" + 
						"}</style><form action=\"/login\" method=\"post\" style=\"margin-top: -3cm;\">\n" + 
						"	<input type=\"submit\" value=\"Home\"\n" + 
						"		style=\"margin-left: 28cm; height: 0.9cm; border-radius: 1cm; color: black; background-color: transparent; font-weight: bolder; font-size: 16pt; font-family: monospace;\">\n" + 
						"</form>\n" + 
						"<form action=\"/signout\" method=\"post\" style=\"margin-top: -1.3cm;\">\n" + 
						"	<input type=\"submit\" value=\"Signout\"\n" + 
						"		style=\"margin-left: 32cm; height: 0.9cm; border-radius: 1cm; color: black; background-color: transparent; font-weight: bolder; font-size: 16pt; font-family: monospace;font-variant: small-caps;\">\n" + 
						"</form>\n" + 
						"</head><body onload=\"reloadpage()\" background=\"back.jpg\"><form action=\"/add\" method=\"post\" style=\"margin-top: 2cm;\"><input type=\"submit\" value=\"Add products\"><br><br>");
				out.print("<input type=\"submit\" value=\"Search products\">");
				out.print("</form>");
				out.print("</body></html>");
				response.setHeader("Cache-Control", "no-store");
				
			} else {
				request.getRequestDispatcher("login.html").forward(request, response);
			}
			} catch (Exception e) {
				// TODO: handle exception
				request.getRequestDispatcher("login.html").forward(request, response);
			}

		} catch (Exception e) {
			// TODO: handle exception
			request.getRequestDispatcher("login.html").forward(request, response);
		}
	}
}