package ejercicioExcepciones.fecha;

import ejercicioExcepciones.exception.FechaException;

public class Fecha{
	
	private int ano = 0;
	private int mes = 1;
	private int dia = 1;
	
	public static final int MESES_ANO = 12;
	
	public static boolean esBisiesto(int ano) {
		if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))) {
			return true;
		}else {
			return false;	
		}
	}
	
	public Fecha() {
		
	}
	
	public Fecha(int ano, int mes, int dia) throws FechaException{
		set(ano, mes, dia);
	}
	
	public Fecha(Fecha f) throws FechaException {
		set(f);
	}
	
	public boolean esBisiesto() {
		if ((this.ano % 4 == 0) && ((this.ano % 100 != 0) || (this.ano % 400 == 0))) {
			return true;
		}else {
			return false;
		}
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	/**
	 * Metodo que sirve para modificar un mes
	 * @param mes mes que quieres poner
	 * @throws FechaException error en el mes
	 */
	public void setMes(int mes) throws FechaException {
		if(mes>0 && mes<=12) {
			this.mes = mes;
		}else {
			throw new FechaException("El mes debe estar entre 1 y 12");
		}
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public void setDia(int dia) throws FechaException {
		switch(this.mes) {
		case 1,3,5,7,8,10,12:
			if(dia>0 && dia<=31) {
				this.dia = dia;
			}else {
				throw new FechaException("El dia debe ser entre 1 y 31");
			}
			break;
		case 4,6,9,11:
			if(dia>0 && dia<=30) {
				this.dia = dia;
			}else {
				throw new FechaException("El dia debe ser entre 1 y 30");
			}
			break;
		default:
			if(esBisiesto()) {
				if(dia>0 && dia<=29) {
					this.dia = dia;
				}else {
					throw new FechaException("El dia debe ser entre 1 y 29");
				}
			}else {
				if(dia>0 && dia<=28) {
					this.dia = dia;
				}else {
					throw new FechaException("El dia debe ser entre 1 y 28");
				}				
			}
		}
		
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public void set(int ano, int mes, int dia) throws FechaException {
		this.ano = ano;
		setMes(mes);
		setDia(dia);
	}
	
	public void set(Fecha f) throws FechaException{
		this.ano = f.getAno();
		setMes(f.getMes());
		setDia(f.getDia());
	}
	
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
	public boolean equals(Object o) {
		return true;
	}

} 