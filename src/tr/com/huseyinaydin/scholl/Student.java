
package tr.com.huseyinaydin.scholl;

import java.io.Serializable;

/**
 * @author Huseyin_Aydin
 * @since 1994
 * @category Spring Boot
 */

// bean
public class Student implements Serializable {

	private static final long	serialVersionUID	= 5654429409799227944L;
	// nesne değişkeni
	private long				id;
	private String				name;
	private String				surname;


	// parametresiz constructor
	public Student ( ) {
		this.id		= 0;
		this.name		= "Hüseyin";
		this.surname	= "Aydın";
	}

	// parametreli constructor
	public Student ( long id , String name , String surname ) {
		super ( );
		this.id		= id;
		this.name		= name;
		this.surname	= surname;
	}

	// getter
	public long getId ( ) {
		return id;
	}

	public void setId ( long id ) {
		this.id = id;
	}

	public String getName ( ) {
		return name;
	}

	public void setName ( String name ) {
		this.name = name;
	}

	public String getSurname ( ) {
		return surname;
	}

	public void setSurname ( String surname ) {
		this.surname = surname;
	}

	// toString tc
	@Override
	public String toString ( ) {
		return "id=" + id + ", name=" + name + ", surname=" + surname;
	}

}
