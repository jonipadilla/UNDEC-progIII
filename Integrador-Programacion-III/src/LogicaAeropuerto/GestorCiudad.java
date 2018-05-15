package LogicaAeropuerto;

import java.util.ArrayList;

import Aeropuerto.Ciudad;

public class GestorCiudad {
	
	
	private ArrayList<Ciudad> miCiudad = new ArrayList<>();
	
	public boolean crearCiudad(Integer idCiudad, String nombre, String codigoPostal) {
		
		if (existeCiudad(codigoPostal)==false) {
			Ciudad nuevaCiudad = new Ciudad(1, "La Rioja", "5360");
			
			miCiudad.add(nuevaCiudad);
			return true;
		}
		return false;
	}

	public boolean modificarCiudad(Ciudad CiudadNueva, Ciudad ciudadVieja) {
		if (!miCiudad.contains(ciudadVieja))
			return false;
			
		miCiudad.remove(ciudadVieja);
		miCiudad.add(CiudadNueva);
		return true;
	}
	
	public boolean bajaCiudad(String codigoPostal) {
		for (Ciudad ciudad : miCiudad) {
			if (codigoPostal==ciudad.getCodigoPostal()) {
				miCiudad.remove(ciudad);
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Ciudad> buscarCiudad(String codigoPostal) {
		ArrayList<Ciudad> ciudadEncontrada = new ArrayList<>();
		
		return ciudadEncontrada;
	}
	
	public boolean existeCiudad(String codigoPostal) {
		for (Ciudad ciudad : miCiudad) {
			if (codigoPostal==ciudad.getCodigoPostal()) {
				return true;
			}
		}
		return false;
	}

}
