package excepciones;

public class FormatoException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public FormatoException(String mensaje) {
		super(mensaje);
	}

}
