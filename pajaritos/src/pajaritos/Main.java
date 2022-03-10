package pajaritos;

import java.net.http.HttpRequest;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		/*
		System.out.println("Crear un LORO");
		System.out.println("Introduce el sexo");
		String sexo = teclado.next();
		System.out.println("Introduce el edad");
		int edad = teclado.nextInt();
		System.out.println("Introduce el nombre del dueño");
		String nomDueno = teclado.next();
		System.out.println("Introduce el nombre del ave");
		String nomAve = teclado.next();
		System.out.println("Introduce el region");
		String region = teclado.next();
		System.out.println("Introduce el color");
		String color = teclado.next();
		
		DatosPersonales datosLoro = new DatosPersonales(nomAve, nomDueno);
		Loro lorito = new Loro(sexo, edad, datosLoro, region, color);
		
		System.out.println(lorito.getColor());
		System.out.println(lorito.getEdad());
		
		System.out.println(lorito.getNombres());
		
		System.out.println(lorito.getRegion());
		
		System.out.println(lorito.getNombres().getNombreDueno());
		System.out.println(lorito.getNombres().getNombreAve());
		*/
		
		Piolin p = new Piolin("M", 1, 10);
		Loro l = new Loro("H", 3, "N", "Azul");
		
		DatosPersonales noms = new DatosPersonales("Goku", "Alberto");
		
		Loro l2 = new Loro("M", 5, noms, "S", "Verde");
		
		System.out.println(l2.getColor());
		System.out.println(l2.getEdad());
		
		System.out.println(l2.getNombres());
		
		System.out.println(l2.getNombres().getNombreDueno());
		System.out.println(l2.getNombres().getNombreAve());
		
		p.quienSoy();
		l.quienSoy();
		
		p.tamano();
		
		l.deDondeEres();
		
		p.setTamano(20);
		
		/*DatosPersonales noms = new DatosPersonales("Goku", "Alberto");
		
		System.out.println(l.getNombres().getNombreAve());
		System.out.println(l.getNombres().getNombreDueno());*/
		
		//p.tamano = 20;
		
		p.tamano();
		
		//l.region = "S";
		
		l.setRegion("S");
		
		Ave.numeroAvesCreadas();
		
		//Piolin[] piolines = {new Piolin("M", 2, 5), new Piolin("H", 1, 15), new Piolin("M", 6, 25)};
		
		Piolin[] piolines = new Piolin[3];
		
		Piolin p1 = new Piolin("M", 2, 5);
		Piolin p2 = new Piolin("H", 1, 15);
		Piolin p3 = new Piolin("M", 6, 25);
		
		piolines[0] = p1;
		piolines[1] = p2;
		piolines[2] = p3;
		
		DatosPersonales datosPiolin = new DatosPersonales("Piolin1", "Silvestre");
		
		piolines[0].setNombres(datosPiolin);
		
		l.cantar();
		
		for(int i=0; i<piolines.length; i++) {
			piolines[i].cantar();
		}
		
		System.out.println(piolines[0].getNombres().getNombreAve());
		System.out.println(piolines[0].getNombres().getNombreDueno());
		
		Ave[] pajaritos = new Ave[2];
		
		pajaritos[0] = new Piolin("M", 2, 5);
		pajaritos[1] = new Loro("M", 3, "S", "Azul");
		
		for(int i=0;i<pajaritos.length;i++) {
			if(pajaritos[i] instanceof Loro) {
				//System.out.println(((Loro)pajaritos[i]).getRegion());
				Loro lorit = (Loro) pajaritos[i];
				System.out.println(lorit.getRegion());
			}else {
				//System.out.println(((Piolin)pajaritos[i]).getNumPeliculas());
				Piolin pio = (Piolin) pajaritos[i];
				System.out.println(pio.getNumPeliculas());
			}
		}
	
		
		teclado.close();
	}

}
