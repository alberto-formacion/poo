package pajaritos;

public class Main {
	
	public static void main(String[] args) {
		Piolin p = new Piolin("M", 1, 10);
		Loro l = new Loro("H", 3, "N", "Azul");
		
		p.quienSoy();
		l.quienSoy();
		
		p.tamano();
		
		l.deDondeEres();
		
		p.tamano = 20;
		
		p.tamano();
		
		l.region = "S";
		
		Ave.numeroAvesCreadas();
	}

}
