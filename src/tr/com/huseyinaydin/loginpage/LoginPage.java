
package tr.com.huseyinaydin.loginpage;

import java.io.IOException;

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

@WebServlet(name = "loginPage", urlPatterns = { "/loginPage" })
public class LoginPage extends HttpServlet {

	private static final long	serialVersionUID		= 1L;
	private String				emailValidationError	= "e-posta boş geçilemez.";
	private String				passwordValidationError	= "şifre boş geçilemez";


	// parametresiz constructor
	public LoginPage ( ) {
		super ( );
	}

	// Get istekleri
	@Override
	protected void doGet ( HttpServletRequest request , HttpServletResponse response )
			throws IOException , ServletException {
		response.setContentType ( "text/html" );
		response.setCharacterEncoding ( "utf-8" );
		requestProcess ( request , response );

	}

	// post istekleri
	@Override
	protected void doPost ( HttpServletRequest request , HttpServletResponse response )
			throws IOException , ServletException {

		response.setContentType ( "text/html" );
		response.setCharacterEncoding ( "utf-8" );
		requestProcess ( request , response );

	}

	// yourEmail yourPassword
	protected void requestProcess ( HttpServletRequest request , HttpServletResponse response )
			throws IOException , ServletException {

		response.setContentType ( "text/html" );
		response.setCharacterEncoding ( "utf-8" );

		// global variable
		String email = "" , password = "";
		RequestDispatcher requestDispatcher = null;

		// Atributes
		request.setAttribute ( "email" , false );
		request.setAttribute ( "password" , false );

		email	= request.getParameter ( "yourEmail" );
		password	= request.getParameter ( "yourPassword" );

		// validation control
		if ( email.trim ( ).length ( ) != 0 ) {
			System.out.println ( "email adresiniz: " + email );
			request.setAttribute ( "emailValue" , email );
			System.out.println ( "" );
		} else {
			request.setAttribute ( "email" , true );
			request.setAttribute ( "emailKey" , ( String ) getEmailValidationError ( ) );
			request.setAttribute ( "emailValue" , email );
			System.out.println ( "" );
		}

		// validation control
		if ( password.trim ( ).length ( ) != 0 ) {
			System.out.println ( "password adresiniz: " + password );
			request.setAttribute ( "passwordValue" , password );
			System.out.println ( "" );
		} else {
			request.setAttribute ( "password" , true );
			request.setAttribute ( "passwordKey" , ( String ) getPasswordValidationError ( ) );
			request.setAttribute ( "passwordValue" , password );
			System.out.println ( "" );
		}

		// email ve password kontrol
		if ( ( Boolean ) request.getAttribute ( "email" ) || ( Boolean ) request.getAttribute ( "password" ) ) {
			requestDispatcher = request.getRequestDispatcher ( "LoginPage.jsp" );
			requestDispatcher.forward ( request , response );
		} else {
			response.sendRedirect ( "HomePage.jsp" );
		}

	}

	// getter and setter
	public String getEmailValidationError ( ) {
		return emailValidationError;
	}

	public void setEmailValidationError ( String emailValidationError ) {
		this.emailValidationError = emailValidationError;
	}

	public String getPasswordValidationError ( ) {
		return passwordValidationError;
	}

	public void setPasswordValidationError ( String passwordValidationError ) {
		this.passwordValidationError = passwordValidationError;
	}

}
