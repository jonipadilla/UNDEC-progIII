package LogicaAeropuerto;

import java.util.ArrayList;

import Aeropuerto.Aeropuerto;

public class GestorAeropuerto {
	
	
	ArrayList<Aeropuerto> misAeropuertos = new ArrayList<>();
	
	public boolean crearAeropuerto(Aeropuerto nuevoAeropuerto) {
		
		if (existeAeropuerto(nuevoAeropuerto.getCodigo())==false) {
			misAeropuertos.add(nuevoAeropuerto);
			return true;
		}
		return false;		
	}
	
	
	public boolean modificarAeropuerto(Aeropuerto nuevoAeropuerto, Aeropuerto viejoAeropuerto) {	
			
		if (!misAeropuertos.contains(viejoAeropuerto))
				return false;
				
		misAeropuertos.remove(viejoAeropuerto);
		misAeropuertos.add(nuevoAeropuerto);
		return true;

	}
	
	
	public boolean bajaAeropuerto(Aeropuerto nuevoAeropuerto) {
		for (Aeropuerto aeropuerto : misAeropuertos) {
			
			if (existeAeropuerto(aeropuerto.getCodigo())==true) {
				misAeropuertos.remove(nuevoAeropuerto);
				return true;				
			}
		}
		return false;
	}
	
	
	
	public boolean existeAeropuerto(String codigo) {
		for (Aeropuerto aeropuerto : misAeropuertos) {
			if (codigo==aeropuerto.getCodigo()) {
				return true;
			}
		}
		return false;
		
	}
	
	
	
}
