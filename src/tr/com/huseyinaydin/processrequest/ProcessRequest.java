
package tr.com.huseyinaydin.processrequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Huseyin_Aydin
 * @since 1994
 * @category Spring Boot
 */

@WebServlet(name = "form", urlPatterns = { "/urlAlanim" })
public class ProcessRequest extends HttpServlet {

	private static final long serialVersionUID = 1L;


	@Override
	protected void doGet ( HttpServletRequest request , HttpServletResponse response )
			throws IOException , ServletException {
		processRequest ( request , response );
	}

	@Override
	protected void doPost ( HttpServletRequest request , HttpServletResponse response )
			throws IOException , ServletException {
		processRequest ( request , response );

	}

	protected void processRequest ( HttpServletRequest request , HttpServletResponse response )
			throws IOException , ServletException {

		response.setCharacterEncoding ( "utf-8" );
		response.setContentType ( "text/html" );
		PrintWriter out = response.getWriter ( );
		out.append ( "<html>" );
		out.append ( "<body>" );

		out.append ( "<span style='color:red; border:1px solid rgba(5,5,6,.6); box-shadow:1px 1px 1px 1px #000;"
				+ "padding:1rem;" + "margin-top:1rem; font-size:1rem;" + "'>  mark light  </span>" );

		out.append ( "</body>" );
		out.append ( "</html>" );
	}

}
