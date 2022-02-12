import java.io .∗;
import java.sql .∗;
import javax.servlet. ServletException ;
import javax.servlet.http .∗;

public class registerServlet extends HttpServlet
{
	private PreparedStatement ps;

	public void init () throws ServletException
	{
		initJDBC ();
	}
	protected void doGet( HttpServletRequest request ,
	HttpServletResponse response)
	throws ServletException , IOException
	{
		response. setContentType ("text/html;charset=UTF−8");
		try ( PrintWriter out = response. getWriter ()) 
		{
			String first = request. getParameter ("firstname");
			String last = request. getParameter ("surname");
			String email = request. getParameter ("email");
			String pass = request. getParameter ("password");
			try{
			addUser(first , last , email , pass );

			out.println("<!DOCTYPE html >");
			out.println("<html >");
			out.println("<head >");
			out.println("<title >Confirmation </title >");
			out.println("</head >");
			out.println("<body >");
			out.println("<h1>Confirmation </h1>");
			out.println("<p>" + first + " " + last +
			" successfully registered </p>");
			out.println("</body >");
			out.println("</html >");

			}catch ( SQLException ex){
				out.println("<!DOCTYPE html >");
				out.println("<html >");
				out.println("<head >");
				out.println("<title >Error </title >");
				out.println("</head >");
				out.println("<body >");
				out.println("<h1>Error </h1>");
				out.println("<p>error registering user " +
				first + " " + last + "</p>");
				out.println("</body >");
				out.println("</html >");
			}
		}
	}

	public void initJDBC ()
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager . getConnection (
		"jdbc:mysql://localhost/servletdb",
		"root", "password");
		ps = conn. prepareStatement ("insert into user " +
		"(fname , lname , email , password) " +
		"values (?,?,?,?)");
		} catch ( Exception ex){
		System.out.println(ex. getMessage ());
		}
	}
	public void addUser(String fname , String lname ,
	String email , String pass) throws SQLException
	{
	ps. setString (1, fname );
	ps. setString (2, lname );
	ps. setString (3, email );
	ps. setString (4, pass );
	ps. executeUpdate ();
	}
}
