import java.io.*;
import javax.servlet.* ;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet 
{

	protected void doGet( HttpServletRequest request ,
	HttpServletResponse response)
	throws ServletException , IOException 
	{

		String name = request.getParameter ("name");
		response.setCharacterEncoding("UTF-8");
		try ( PrintWriter out = new PrintWriter(response.getOutputStream())) 
		{
			out.println("<p>Hello " + name + "</p>");
		}
	}
}
