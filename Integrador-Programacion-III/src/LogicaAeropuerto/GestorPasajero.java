package LogicaAeropuerto;

import java.util.ArrayList;

import Aeropuerto.Pasajero;

public class GestorPasajero {
	
	
	private ArrayList<Pasajero> misPasajeros = new ArrayList<>();
	
	public boolean crearPasajero(Integer idPasajero, String cuil, String apellido, String nombre, String telefono) {
		
		if (existePasajero(cuil)==false) {
			Pasajero nuevoPasajero = new Pasajero(1,"20123456784", "Ramírez","Ramiro Ramón","12345678");
			
			misPasajeros.add(nuevoPasajero);
			return true;
		}
		return false;
	}

	public boolean modificarPasajero(Pasajero PasajeroNuevo, Pasajero PasajeroViejo) {
		if (!misPasajeros.contains(PasajeroViejo))
			return false;
			
		misPasajeros.remove(PasajeroViejo);
		misPasajeros.add(PasajeroNuevo);
		return true;
	}
	
	public boolean bajaPasajero(String cuil) {
		for (Pasajero pasajero : misPasajeros) {
			if (cuil==pasajero.getCuil()) {
				misPasajeros.remove(pasajero);
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Pasajero> buscarPasajero(String cuil) {
		ArrayList<Pasajero> PasajeroEncontrado = new ArrayList<>();
		
		return PasajeroEncontrado;
	}
	
	public boolean existePasajero(String cuil) {
		for (Pasajero pasajero : misPasajeros) {
			if (cuil==pasajero.getCuil()) {
				return true;
			}
		}
		return false;
	}

}
