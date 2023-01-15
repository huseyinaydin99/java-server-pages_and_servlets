
package tr.com.huseyinaydin.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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

@WebServlet(name = "Login", urlPatterns = { "/Login" })
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;


	public Login ( ) {
		super ( );
	}

	@Override
	protected void doGet ( HttpServletRequest request , HttpServletResponse response )
			throws IOException , ServletException {
		response.setCharacterEncoding ( "UTF-8" );
		response.setContentType ( "text/html" );
		processRequest ( request , response );

	}

	@Override
	protected void doPost ( HttpServletRequest request , HttpServletResponse response )
			throws IOException , ServletException {
		response.setCharacterEncoding ( "UTF-8" );
		response.setContentType ( "text/html" );
		processRequest ( request , response );
	}

	protected void processRequest ( HttpServletRequest request , HttpServletResponse response )
			throws IOException , ServletException {
		response.setCharacterEncoding ( "UTF-8" );
		response.setContentType ( "text/html" );
		String nameSurname , email , password;
		nameSurname	= request.getParameter ( "nameSurname" );
		email		= request.getParameter ( "emailAddress" );
		password		= request.getParameter ( "password" );
		// dbset

		// validation
		// if(nameSurname!=null )

		PrintWriter out = response.getWriter ( );
		out.append ( "<html>" );
		out.append ( "<body>" );

		out.append ( "Adınız ve soyadınız <b>" + nameSurname + "</b>" );
		out.append ( "Email adresiniz<b>" + email + "</b>" );
		out.append ( "Şifreniz <b>" + password + "</b>" );

		out.append ( "</body>" );
		out.append ( "</html>" );

		RequestDispatcher yonlendir = request.getRequestDispatcher ( "HomePage.jsp" );
		yonlendir.forward ( request , response );

	}

}
