package ejercicioExcepciones.exception;

public class FechaException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public FechaException() {
		
	}
	
	public FechaException(String message) {
		super(message);
	}
	
	public FechaException(String message, Throwable cause) {
		super(message, cause);
	}
	
	
	public FechaException(Throwable cause) {
		super(cause);
	}
}
