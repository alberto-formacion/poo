package ejercicioExcepciones.main;

import ejercicioExcepciones.exception.FechaException;
import ejercicioExcepciones.fecha.Fecha;

public class PruebaFecha {
	public static final int MAX_FECHAS = 100;

	public static int random(int min, int max) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}

	public static void main(String[] args) {
		for (int i = 0; i < MAX_FECHAS; i++) {
			try {
				Fecha f = new Fecha(random(1, 2022), random(1, Fecha.MESES_ANO), random(1, 31));
				System.out.println("Fecha correcta: " + f.toString());
			} catch (FechaException e) {
				System.out.println("EXCEPTION: " + e.getMessage());
			}
		}
		
		try {
			Fecha f = new Fecha(2021, 2, 29);
			System.out.println("Fecha correcta: " + f.toString());
		}catch (FechaException e) {
			System.out.println(e.getMessage());
		}
	}
}
