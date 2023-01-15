
package tr.com.huseyinaydin.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DenemeServlet
 */

/**
 * @author Huseyin_Aydin
 * @since 1994
 * @category Spring Boot
 */
@WebServlet("/DenemeServlet")
public class DenemeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;


	protected void doGet ( HttpServletRequest request , HttpServletResponse response )
			throws ServletException , IOException {
		response.setContentType ( "text/html; charset=UTF-8 " );

		doPost ( request , response );
	}

	protected void doPost ( HttpServletRequest request , HttpServletResponse response )
			throws ServletException , IOException {

		// doGet ( request , response );
		PrintWriter printWriter2 = response.getWriter ( );

		printWriter2.println ( "<html>" );

		printWriter2.println ( "<body>" );

		printWriter2.println ( "<code><ins> Hüseyin Aydın <sup> 11</sup> </ins> </code>" );

		printWriter2.println ( "</body>" );

		printWriter2.println ( "<html>" );

	}

}
