
package tr.com.huseyinaydin.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

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

@WebServlet(name = "login11", urlPatterns = { "/buBenimilkServlet" })
public class Login extends HttpServlet implements Serializable {

	private static final long serialVersionUID = -5484913118022724319L;


	@Override
	protected void doGet ( HttpServletRequest req , HttpServletResponse res ) throws IOException , ServletException {
		PrintWriter out = res.getWriter ( );
		res.setContentType ( "text/html; charset=UTF-8" );
		out.println ( "<html>" );
		out.println ( "<head>" );
		out.println ( "</head>" );

		out.println ( "<body>" );
		out.println ( "<i> <mark> Hüseyin Aydın  </mark> </i>" );
		out.println ( "</body>" );

		out.println ( "</html>" );
	}

}

/*
 * <servlet> <servlet-name>ilkServlet</servlet-name> <servlet-class>com.java.filter.Login</servlet-class> </servlet>
 * <servlet-mapping> <servlet-name>ilkServlet</servlet-name> <url-pattern>/jspdersler</url-pattern> </servlet-mapping>
 */