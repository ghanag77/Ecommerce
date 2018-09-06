import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/home" })
public class Home extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		try {
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			try {
				HttpSession session = request.getSession(false);
				if (session != null) {
					out.print("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\">\r\n" + "<head>\r\n"
							+ "<meta http-equiv=\"content-type\"\r\n"
							+ "	content=\"application/xhtml+xml; charset=UTF-8\" />\r\n" + "<title>E-Buy</title>\r\n"
							+ "<h1>E-Buy</h1>\r\n"
							+ "<form action=\"\" method=\"post\" style=\"margin-top: -1.8cm;\">\r\n"
							+ "	<input type=\"text\" placeholder=\"Search for products\"\r\n"
							+ "		style=\"margin-left: 10.34cm; width: 12cm; height: 0.8cm; color: black; font-family: monospace; font-size: 15pt\">\r\n"
							+ "</form>\r\n" + "<form action=\"\" method=\"post\" style=\"margin-top: -1.3cm\">\r\n"
							+ "	<input type=\"submit\" value=\"Search\"\r\n"
							+ "		style=\"margin-left: 22.8cm; height: 0.9cm; border-radius: 1cm; color: black; background-color: transparent; font-weight: bolder; font-size: 16pt; font-family: monospace;\">\r\n"
							+ "</form>\r\n"
							+ "<form action=\"/product\" method=\"post\" style=\"margin-top: -1.5cm;\">\r\n"
							+ "	<input type=\"submit\" value=\"Products\"\r\n"
							+ "		style=\"margin-left: 27cm; height: 0.9cm; border-radius: 1cm; color: black; background-color: transparent; font-weight: bolder; font-size: 16pt; font-family: monospace;\">\r\n"
							+ "</form>\r\n"
							+ "<form action=\"/signout\" method=\"post\" style=\"margin-top: -1.4cm;\">\r\n"
							+ "	<input type=\"submit\" value=\"Signout\"\r\n"
							+ "		style=\"margin-left: 33cm; height: 0.9cm; border-radius: 1cm; color: black; background-color: transparent; font-weight: bolder; font-size: 16pt; font-family: monospace;font-variant: small-caps;\">\r\n"
							+ "</form>\r\n" + "\r\n" + "<style>\r\n" + "h1 {\r\n" + "	background-position: top;\r\n"
							+ "	background-size: 4cm;\r\n" + "	background-color: #4fa3f2;\r\n"
							+ "	margin-top: -0.2cm;\r\n" + "	text-align: left;\r\n" + "	letter-spacing: 3pt;\r\n"
							+ "	font-size: 30pt;\r\n" + "	font-family: fantasy;\r\n" + "	margin-left: -0.2cm;\r\n"
							+ "	margin-right: -0.2cm;\r\n" + "	height: 1.5cm;\r\n" + "}\r\n" + "\r\n" + ".table {\r\n"
							+ "	border: thin;\r\n" + "	padding: 10px;\r\n" + "	height: 584.7px;\r\n"
							+ "	width: 1327px;\r\n" + "	overflow: hidden;\r\n" + "	margin-top: 0.13cm;\r\n"
							+ "	margin-left: -0.2cm;\r\n" + "	margin-right: -0.22cm;\r\n"
							+ "	margin-bottom: -0.2cm;\r\n" + "}\r\n" + "\r\n" + ".left {\r\n" + "	float: left;\r\n"
							+ "	width: 400px;\r\n" + "	height: 700px;\r\n" + "	margin-left: -0.27cm;\r\n" + "}\r\n"
							+ "\r\n" + ".right {\r\n" + "	float: right;\r\n" + "	width: 927px;\r\n"
							+ "	height: 700px\r\n" + "}\r\n" + "\r\n" + "p {\r\n" + "	font-size: 15pt;\r\n"
							+ "	margin-top: 3cm;\r\n" + "	margin-left: 1cm;\r\n" + "	font-weight: bold;\r\n"
							+ "}\r\n" + "</style>\r\n" + "</head>\r\n" + "\r\n"
							+ "<body style=\"overflow: hidden;\">\r\n" + "	<div class=\"table\">\r\n"
							+ "		<div class=\"left\">\r\n" + "			<img src=\"6670x700.jpg\"\r\n"
							+ "				style=\"margin-top: -0.16cm; background: fixed; width: 400px; height: 700px\">\r\n"
							+ "		</div>\r\n" + "		<div class=\"right\">\r\n" + "			<table>\r\n"
							+ "				<tr>\r\n" + "					<td><p>Apple iPhone X (Silver, 256GB)\r\n"
							+ "						<p></td>\r\n" + "					<td><p>\r\n"
							+ "							Samsung Galaxy S7 Edge<br>SM-G935F (Black Onyx, 32GB)\r\n"
							+ "						<p></td>\r\n" + "					<td><p>\r\n"
							+ "							OnePlus 6 (Mirror Black<br>, 8GB RAM + 128GB Memory)\r\n"
							+ "						<p></td>\r\n" + "				</tr>\r\n"
							+ "				<tr>\r\n"
							+ "					<td><a href=\"iphone.html\"><img src=\"iphone.jpg\"\r\n"
							+ "							style=\"height: 240px; width: 130px; margin-top: 0.5cm; margin-left: 2.3cm;\"></a></td>\r\n"
							+ "					<td><a href=\"samsung.html\"><img src=\"samsung1.jpg\"\r\n"
							+ "							style=\"height: 240px; width: 220px; margin-top: 0.4cm; margin-left: 1.2cm;\"></a></td>\r\n"
							+ "					<td><a href=\"oneplus.html\"><img src=\"oneplus6.jpg\"\r\n"
							+ "							style=\"height: 220px; width: 110px; margin-top: 0.4cm; margin-left: 3cm;\"></a></td>\r\n"
							+ "				</tr>\r\n" + "				<tr>\r\n"
							+ "					<td><p style=\"margin-top: 0cm; margin-left: 1.9cm;\">₹99,999\r\n"
							+ "						\r\n" + "						<h3\r\n"
							+ "							style=\"text-decoration: line-through; margin-left: 3.8cm; margin-top: -1.06cm; font-weight: lighter; font-size: 12pt\">₹1,02,000</h3>\r\n"
							+ "						<br>\r\n"
							+ "						<button type=\"button\" onclick=\"document.location='/login'\"\r\n"
							+ "							style=\"margin-left: 2.65cm; background-color: #4fa3f2; height: 1cm; font-weight: bolder; margin-top: -0.7cm\">BUY\r\n"
							+ "							NOW</button>\r\n" + "						<p></td>\r\n"
							+ "					<td><p style=\"margin-top: 0cm; margin-left: 2.7cm\">₹35,900\r\n"
							+ "						\r\n" + "						<h3\r\n"
							+ "							style=\"text-decoration: line-through; margin-left: 4.6cm; margin-top: -1.06cm; font-weight: lighter; font-size: 12pt\">₹54,000</h3>\r\n"
							+ "						<br>\r\n"
							+ "						<button type=\"button\" onclick=\"window.location.replace('/login')\"\r\n"
							+ "							style=\"margin-left: 3.5cm; background-color: #4fa3f2; height: 1cm; font-weight: bolder; margin-top: -0.7cm\">BUY\r\n"
							+ "							NOW</button>\r\n" + "						</p></td>\r\n"
							+ "					<td><p style=\"margin-top: 0cm; margin-left: 3.4cm\">₹39,999\r\n"
							+ "						\r\n" + "						<h3\r\n"
							+ "							style=\"text-decoration: line-through; margin-left: 5.28cm; margin-top: -1.06cm; font-weight: lighter; font-size: 12pt\">₹41,000</h3>\r\n"
							+ "						<br>\r\n"
							+ "						<button type=\"button\" onclick=\"document.location='login.html'\"\r\n"
							+ "							style=\"margin-left: 3.8cm; margin-top: -0.7cm; background-color: #4fa3f2; height: 1cm; font-weight: bolder\">BUY\r\n"
							+ "							NOW</button>\r\n" + "						<p></td>\r\n"
							+ "				</tr>\r\n" + "			</table>\r\n" + "\r\n" + "		</div>\r\n"
							+ "	</div>\r\n" + "</body>\r\n" + "</html>");
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
			System.out.println(e);
			request.getRequestDispatcher("login.html").forward(request, response);
		}

	}
}
