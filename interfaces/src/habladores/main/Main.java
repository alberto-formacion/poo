package habladores.main;

import habladores.aparato.Aparato;
import habladores.aparato.Radio;
import habladores.aparato.TV;
import habladores.ave.Ave;
import habladores.ave.Buitre;
import habladores.ave.Canario;
import habladores.ave.Loro;
import habladores.ave.Piolin;
import habladores.interfaces.Hablador;
import habladores.persona.Alumno;
import habladores.persona.Bedel;
import habladores.persona.Persona;
import habladores.persona.Profesor;

public class Main {

	public static void main(String[] args) {
		Persona persona = new Persona("Alberto", 37);
		Ave ave = new Ave("M", 3);
		Aparato aparato = new Aparato(100, 10);
		Buitre buitre = new Buitre("H", 2, 20, 40);
		Canario canario = new Canario("H", 2, false);
		Loro loro = new Loro("M", 1, "S", "azul");
		Piolin piolin = new Piolin("H", 5, true, 3);
		Alumno alumno = new Alumno("Gorka", 20, "mucha", "java");
		Profesor profesor = new Profesor("Iban", 30, "A14", "i@sanlu.com");
		Bedel bedel = new Bedel("Oskar", 50, "M", 10);
		TV tv = new TV(100, 100, true, 5);
		Radio radio = new Radio(20, 20, false, 50);
		
		Object[] habladores = new Object[12];
		
		habladores[0] = persona;
		habladores[1] = ave;
		habladores[2] = aparato;
		habladores[3] = buitre;
		habladores[4] = canario;
		habladores[5] = loro;
		habladores[6] = piolin;
		habladores[7] = alumno;
		habladores[8] = profesor;
		habladores[9] = bedel;
		habladores[10] = tv;
		habladores[11] = radio;
		
		for(int i=0;i<habladores.length;i++) {
			if(habladores[i] instanceof Hablador) {
				Hablador h = (Hablador) habladores[i];
				h.hablar();
			}
		}

	}

}
