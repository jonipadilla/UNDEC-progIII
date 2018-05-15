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
	
	
	
	
	
	public boolean existeAeropuerto(String codigo) {
		for (Aeropuerto aeropuerto : misAeropuertos) {
			if (codigo==aeropuerto.getCodigo()) {
				return true;
			}
		}
		return false;
		
	}
	
	
	
}
