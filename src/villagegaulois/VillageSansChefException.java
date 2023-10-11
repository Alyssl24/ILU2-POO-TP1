package villagegaulois;

import java.security.PublicKey;

public class VillageSansChefException extends Exception {
	
	public VillageSansChefException() {
	}
	
	public VillageSansChefException(String errorMessage) {
		super(errorMessage);
	}
		
	public VillageSansChefException(Throwable cause) {
		super(cause);
	}
	
	public VillageSansChefException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
	}
}