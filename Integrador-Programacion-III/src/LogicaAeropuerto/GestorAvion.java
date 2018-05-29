package LogicaAeropuerto;

import java.util.ArrayList;

import Aeropuerto.Avion;

public class GestorAvion {
	
	
	private ArrayList<Avion> miAvion = new ArrayList<>();
	
	public boolean crearCiudad(Avion nuevoAvion) {
		
		if (existeAvion(nuevoAvion.getMatricula())==false) {		
			miAvion.add(nuevoAvion);
			return true;
		}
		return false;
	}

	public boolean modificarAvion(Avion AvionNuevo, Avion AvionViejo) {
		if (!miAvion.contains(AvionViejo))
			return false;
			
		miAvion.remove(AvionViejo);
		miAvion.add(AvionNuevo);
		return true;
	}
	
	public boolean bajaAvion(Avion nuevoAvion) {
		for (Avion avion : miAvion) {
			if (existeAvion(avion.getMatricula())==true) {
				miAvion.remove(nuevoAvion);
				return true;				
			}
		}
		return false;
	}
	
	
	public boolean existeAvion(String codigoMatricula) {
		for (Avion avion : miAvion) {
			if (codigoMatricula==avion.getMatricula()) {
				return true;
			}
		}
		return false;
	}

}
