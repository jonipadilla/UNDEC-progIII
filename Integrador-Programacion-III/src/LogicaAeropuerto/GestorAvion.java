package LogicaAeropuerto;

import java.util.ArrayList;

import Aeropuerto.Avion;

public class GestorAvion {
	
	
	public ArrayList<Avion> coleccionAviones = new ArrayList<>();
	
	
	public boolean crearAvion(Avion nuevoAvion) {
		
		if (existeAvion(nuevoAvion.getMatricula())==false) {		
			coleccionAviones.add(nuevoAvion);
			return true;
		}
		return false;
	}

	public boolean modificarAvion(Avion AvionNuevo, Avion AvionViejo) {
		if (!coleccionAviones.contains(AvionViejo))
			return false;
			
		coleccionAviones.remove(AvionViejo);
		coleccionAviones.add(AvionNuevo);
		return true;
	}
	
	public boolean bajaAvion(Avion nuevoAvion) {
		for (Avion avion : coleccionAviones) {
			if (existeAvion(avion.getMatricula())==true) {
				coleccionAviones.remove(nuevoAvion);
				return true;				
			}
		}
		return false;
	}
	
	
	public boolean existeAvion(String codigoMatricula) {
		for (Avion avion : coleccionAviones) {
			if (codigoMatricula==avion.getMatricula()) {
				return true;
			}
		}
		return false;
	}

}
