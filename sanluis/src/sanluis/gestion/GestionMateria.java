package sanluis.gestion;

import java.util.ArrayList;

import sanluis.vo.Materia;

public class GestionMateria {
	
	ArrayList<Materia> materias;
	
	public GestionMateria() {
		materias = new ArrayList<Materia>();
		
		materias.add(new Materia("101", "Java", 210));
		
	}
	
	public void anadirMateria(Materia materia) {
		
	}
	
	public ArrayList<Materia> obtenerMaterias(){
		return null;
	}
	
	public Materia obtenerMateria(String codigo) {
		for(int i=0;i<materias.size();i++) {
			Materia materia = materias.get(i);
			
			if(materia.getCodigo().equals(codigo)) {
				return materia;
			}
		}
		return null;
	}

}
