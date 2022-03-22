package src;

import java.io.∗;import java.sql.∗;

import javax.servlet.ServletException;import javax.servlet.http.∗;
import src.Cryptocurrency;

public class registerServlet extends HttpServlet {
	private PreparedStatement ps;

	public void init() throws ServletException {
		initJDBC();
	}

protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF−8");
        try (PrintWriter out = response.getWriter()) {

	public void printtop10(String x, currency[] cry){
				//x is chouce of currency output
				out.println("<table");
				out.println("
				<th>Currency</th>
				<th>Quantety</th>
				<th>USD value</th>
				";)
				if(x == GBP)
					out.println("<th>Pound value</th>");
				else
					out.println("<th>USD value</th>")	
				while(int n < 10){
					out.println(cry[n].getl());
					n++;
				}
				out.println("</table>");
			}
}}}