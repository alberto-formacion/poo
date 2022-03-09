package visibilidad.a;

public class C {
	private String foo; //CLASE
	String baz; //packaged //CLASE | PAQUETE
	protected String bar; //CLASE | PAQUETE | SUBCLASE
	public String biz; //CLASE | PAQUETE | SUBCLASE | TODOS LOS DEMAS
	
	public void metodo() {
		System.out.println(foo);
	}

}
