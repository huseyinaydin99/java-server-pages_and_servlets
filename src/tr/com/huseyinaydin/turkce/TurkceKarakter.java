
package tr.com.huseyinaydin.turkce;

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

@WebServlet(name = "deneme", urlPatterns = { "/turkceKarakter" })
public class TurkceKarakter extends HttpServlet {

	private static final long serialVersionUID = 1L;


	// parametresiz constructor
	public TurkceKarakter ( ) {
		super ( );
	}

	@Override
	protected void doGet ( HttpServletRequest request , HttpServletResponse response )
			throws IOException , ServletException {
		response.setCharacterEncoding ( "UTF-8" );
		response.setContentType ( "text/html" );
		PrintWriter out = response.getWriter ( );

		/*
		 * out.println ( "<html>" ); out.println ( "<body>" ); out.println ( "<b>Hamit Mızrak ğşüi</b>" ); out.println (
		 * "</body>" ); out.println ( "</html>" );
		 */
		out.append ( "<html>" );
		out.append ( "<body>" );
		out.append ( "<b> Hüseyin - Aydın .! </b>" );
		out.append ( "</body>" );
		out.append ( "</html>" );

	}

}
