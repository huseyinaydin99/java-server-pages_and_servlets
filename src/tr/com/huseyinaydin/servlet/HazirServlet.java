
package tr.com.huseyinaydin.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HazirServlet
 */
@WebServlet(name = "HazirServlet", urlPatterns = { "/deneme555" })
public class HazirServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;


	protected void doGet ( HttpServletRequest request , HttpServletResponse response )
			throws ServletException , IOException {

		// response.getWriter ( ).append ( "Served at: " ).append ( request.getContextPath ( ) );
		response.setContentType ( "text/html; charset=UTF-8 " );
		PrintWriter printWriter = response.getWriter ( );
		printWriter.println ( "<html>" );

		printWriter.println ( "<body>" );

		printWriter.println ( "<b> Hüseyin Aydın </b>" );

		printWriter.println ( "</body>" );

		printWriter.println ( "<html>" );

	}

}
