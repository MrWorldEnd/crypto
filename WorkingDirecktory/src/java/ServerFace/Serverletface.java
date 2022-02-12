import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException ;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet 
{

	protected void doGet( HttpServletRequest request ,
	HttpServletResponse response)
	throws ServletException , IOException 
	{

		String name = request. getParameter ("name");
		response. setContentType ("text/html;charset=UTF−8");
		try ( PrintWriter out = response. getWriter ()) 
		{
			out.println("<!DOCTYPE html >");
			out.println("<html ><head >");
			out.println("<title >FirstServlet </title >");
			out.println("</head ><body >");
			out.println("<h1>FirstServlet </h1>");
			out.println("<p>Hello " + name + "</p>");
			out.println("</body ></html >");
		}
	}
}
