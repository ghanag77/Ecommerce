import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/add" })
public class addproduct extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		try {
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out=response.getWriter();
			HttpSession session = request.getSession(false);
			if(session != null) {
				out.print("<!DOCTYPE html>\r\n" + 
						"<html>\r\n" + 
						"<head>\r\n" + 
						"<meta http-equiv=\"content-type\"\r\n" + 
						"	content=\"application/xhtml+xml; charset=UTF-8\" />\r\n" + 
						"<title>Add product</title>\r\n" + 
						"\r\n" + 
						"<h1>E-Buy</h1>\r\n" + 
						"<script type=\"text/javascript\">\r\n" + 
						"function addproduct(){\r\n" + 
						"	var product=document.getElementById(\"product\").value.trim().toLowerCase();\r\n" + 
						"	var model=document.getElementById(\"model\").value.trim();\r\n" + 
						"	var os=document.getElementById(\"os\").value.trim();\r\n" + 
						"	var ram=document.getElementById(\"ram\").value.trim();\r\n" + 
						"	var camera=document.getElementById(\"camera\").value.trim();\r\n" + 
						"	var feature=document.getElementById(\"features\").value.trim();\r\n" + 
						"	var price=document.getElementById(\"price\").value.trim();\r\n" + 
						"	if(product===\"\" || model===\"\" || os===\"\" || ram===\"\" || camera===\"\" || feature===\"\" || price===\"\"){\r\n" + 
						"		window.alert(\"Fields cannot be Empty!\");\r\n" + 
						"		location.reload();\r\n" + 
						"	} else{\r\n" + 
						"		var temp=localStorage.getItem(product);\r\n" + 
						"		if(temp == null){\r\n" + 
						"		localStorage.setItem(product,model);\r\n" + 
						"		var osname=model+\" os\";\r\n" + 
						"		var ramdetail=model+\" ram\";\r\n" + 
						"		var cameradetail=model+\" camera\";\r\n" + 
						"		var featuress=model+\" features\";\r\n" + 
						"		var cost=model+\" price\";\r\n" + 
						"		localStorage.setItem(osname,os);\r\n" + 
						"		localStorage.setItem(ramdetail,ram);\r\n" + 
						"		localStorage.setItem(cameradetail,camera);\r\n" + 
						"		localStorage.setItem(featuress,feature);\r\n" + 
						"		localStorage.setItem(cost,price);\r\n" + 
						"		window.alert(\"Product Added\");\r\n" + 
						"		location.reload();\r\n" + 
						"		} else{\r\n" + 
						"			var products=temp.split(\" \");\r\n" + 
						"			var flag=false;\r\n" + 
						"			for(var i=0;i<products.length;i++){\r\n" + 
						"				if(products[i] === model){\r\n" + 
						"					flag=true;\r\n" + 
						"					break;\r\n" + 
						"				}\r\n" + 
						"			}\r\n" + 
						"			if(flag === true){\r\n" + 
						"				window.alert(\"Model already exists!\");\r\n" + 
						"				location.reload();\r\n" + 
						"			} else{\r\n" + 
						"				temp=temp+\" \"+model;\r\n" + 
						"				localStorage.setItem(product,temp);\r\n" + 
						"				var osname=model+\" os\";\r\n" + 
						"				var ramdetail=model+\" ram\";\r\n" + 
						"				var cameradetail=model+\" camera\";\r\n" + 
						"				var featuress=model+\" features\";\r\n" + 
						"				var cost=model+\" price\";\r\n" + 
						"				localStorage.setItem(osname,os);\r\n" + 
						"				localStorage.setItem(ramdetail,ram);\r\n" + 
						"				localStorage.setItem(cameradetail,camera);\r\n" + 
						"				localStorage.setItem(featuress,feature);\r\n" + 
						"				localStorage.setItem(cost,price);\r\n" + 
						"				window.alert(\"Product Added!\");\r\n" + 
						"				location.reload();\r\n" + 
						"			}\r\n" + 
						"		}\r\n" + 
						"	}\r\n" + 
						"}\r\n" + 
						"</script>\r\n" + 
						"<form action=\"/home\" method=\"post\" style=\"margin-top: -1.9cm;\">\r\n" + 
						"	<input type=\"submit\" value=\"Home\"\r\n" + 
						"		style=\"margin-left: 31cm; height: 0.9cm; border-radius: 1cm; color: black; background-color: transparent; font-weight: bolder; font-size: 16pt; font-family: monospace;\">\r\n" + 
						"</form>\r\n" + 
						"<form action=\"/signout\" method=\"post\" style=\"margin-top: -0.9cm;\">\r\n" + 
						"	<input type=\"submit\" value=\"Signout\"\r\n" + 
						"		style=\"margin-left: 33cm; height: 0.9cm; border-radius: 1cm; color: black; background-color: transparent; font-weight: bolder; font-size: 16pt; font-family: monospace; font-variant: small-caps;\">\r\n" + 
						"</form>\r\n" + 
						"<h2\r\n" + 
						"	style=\"margin-top: 0.5cm; margin-left: 14cm; font-weight: bold; font-variant: small-caps; font-size: 30pt; font-family: monospace;\">Add\r\n" + 
						"	Products!</h2>\r\n" + 
						"<style>\r\n" + 
						"h1 {\r\n" + 
						"	background-position: top;\r\n" + 
						"	background-size: 4cm;\r\n" + 
						"	background-color: #4fa3f2;\r\n" + 
						"	margin-top: -0.2cm;\r\n" + 
						"	text-align: left;\r\n" + 
						"	letter-spacing: 3pt;\r\n" + 
						"	font-size: 30pt;\r\n" + 
						"	font-family: fantasy;\r\n" + 
						"	margin-left: 0cm;\r\n" + 
						"	margin-right: -0.2cm;\r\n" + 
						"	margin-top: 0cm;\r\n" + 
						"	height: 1.5cm;\r\n" + 
						"}\r\n" + 
						"\r\n" + 
						"body, html {\r\n" + 
						"	height: 100%;\r\n" + 
						"	margin: 0;\r\n" + 
						"	height: 100%;\r\n" + 
						"	overflow: hidden;\r\n" + 
						"	/* Center and scale the image nicely */\r\n" + 
						"	background-position: center;\r\n" + 
						"	background-repeat: no-repeat;\r\n" + 
						"	background-size: cover;\r\n" + 
						"}\r\n" + 
						"</style>\r\n" + 
						"</head>\r\n" + 
						"<body background=\"back.jpg\">\r\n" + 
						"	<form action=\"\" method=\"post\" autocomplete=\"off\"\r\n" + 
						"		style=\"margin-left: 12cm\">\r\n" + 
						"		<input\r\n" + 
						"			style=\"height: 0.8cm; border-style: inset; width: 10cm; font-size: 15pt; font-family: monospace; position: fixed; background: inactiveborder; background-color: menu; border-radius: 0.3cm;\"\r\n" + 
						"			type=\"text\" placeholder=\"Product Name\" id=\"product\"\r\n" + 
						"			autocomplete=\"off\"><br>\r\n" + 
						"		<br>\r\n" + 
						"		<br> <input\r\n" + 
						"			style=\"height: 0.8cm; border-style: inset; width: 10cm; font-size: 15pt; font-family: monospace; position: fixed; background: inactiveborder; background-color: menu; border-radius: 0.3cm;\"\r\n" + 
						"			type=\"text\" placeholder=\"Model Number\" id=\"model\" autocomplete=\"off\"><br>\r\n" + 
						"		<br>\r\n" + 
						"		<br> <input\r\n" + 
						"			style=\"height: 0.8cm; border-style: inset; width: 10cm; font-size: 15pt; font-family: monospace; position: fixed; background: inactiveborder; background-color: menu; border-radius: 0.3cm;\"\r\n" + 
						"			type=\"text\" placeholder=\"OS\" id=\"os\" autocomplete=\"off\"><br>\r\n" + 
						"		<br>\r\n" + 
						"		<br> <input\r\n" + 
						"			style=\"height: 0.8cm; border-style: inset; width: 10cm; font-size: 15pt; font-family: monospace; position: fixed; background: inactiveborder; background-color: menu; border-radius: 0.3cm;\"\r\n" + 
						"			type=\"text\" placeholder=\"RAM\" id=\"ram\" autocomplete=\"off\"><br>\r\n" + 
						"		<br>\r\n" + 
						"		<br> <input\r\n" + 
						"			style=\"height: 0.8cm; border-style: inset; width: 10cm; font-size: 15pt; font-family: monospace; position: fixed; background: inactiveborder; background-color: menu; border-radius: 0.3cm;\"\r\n" + 
						"			type=\"text\" placeholder=\"Camera\" id=\"camera\" autocomplete=\"off\"><br>\r\n" + 
						"		<br>\r\n" + 
						"		<br> <input\r\n" + 
						"			style=\"height: 0.8cm; border-style: inset; width: 10cm; font-size: 15pt; font-family: monospace; position: fixed; background: inactiveborder; background-color: menu; border-radius: 0.3cm;\"\r\n" + 
						"			type=\"text\" placeholder=\"Special Features\" id=\"features\"\r\n" + 
						"			autocomplete=\"off\"><br>\r\n" + 
						"		<br>\r\n" + 
						"		<br> <input\r\n" + 
						"			style=\"height: 0.8cm; border-style: inset; width: 10cm; font-size: 15pt; font-family: monospace; position: fixed; background: inactiveborder; background-color: menu; border-radius: 0.3cm;\"\r\n" + 
						"			type=\"text\" placeholder=\"Price\" id=\"price\" autocomplete=\"off\"><br>\r\n" + 
						"		<br>\r\n" + 
						"		<br> <input\r\n" + 
						"			style=\"margin-left: 3.3cm; background: inactiveborder; background-color: menu; font-size: 15pt; height: 0.8cm; width: 3cm; font-family: monospace; font-weight: bold; background-color: #4fa3f2;\"\r\n" + 
						"			type=\"submit\" onclick=\"javascript: addproduct();\" name=\"add\" value=\"Add\">\r\n" + 
						"	</form>\r\n" + 
						"\r\n" + 
						"</body>\r\n" + 
						"</html>");
				response.setHeader("Cache-Control", "no-store");
			} else {
				request.getRequestDispatcher("login.html").forward(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
			request.getRequestDispatcher("login.html").forward(request, response);
		}
	}
}