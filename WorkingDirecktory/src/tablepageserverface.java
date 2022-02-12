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
