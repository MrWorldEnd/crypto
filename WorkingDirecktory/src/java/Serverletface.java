import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named (value = "cryptoBean")
@RequestScoped

public class cryptoBean
{
	public cryptoBean()
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
	public String getcryptoBean()
	{
		String x = "b  ";
		return x;}
}
