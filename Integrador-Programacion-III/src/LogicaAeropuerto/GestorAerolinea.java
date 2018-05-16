package LogicaAeropuerto;

import java.util.ArrayList;

import Aeropuerto.Aerolinea;

public class GestorAerolinea {
	
	ArrayList<Aerolinea> misAerolineas = new ArrayList<>();
	
	public boolean crearAerolinea(Integer idAerolinea, String nombre) {
		
		if (existeAerolinea(nombre)==false) {
			Aerolinea nuevaAerolinea = new Aerolinea(1,"Aerolíneas Argentinas");
			
			misAerolineas.add(nuevaAerolinea);
			return true;
		}
		return false;
	}

	public boolean modificarAerolinea(Aerolinea AerolineaNueva, Aerolinea AerolineaVieja) {
		if (!misAerolineas.contains(AerolineaVieja))
			return false;
			
		misAerolineas.remove(AerolineaVieja);
		misAerolineas.add(AerolineaNueva);
		return true;
	}
	
	public boolean bajaAerolinea(String nombre) {
		for (Aerolinea aerolinea : misAerolineas) {
			if (nombre==aerolinea.getNombre()) {
				misAerolineas.remove(aerolinea);
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Aerolinea> buscarAerolinea(String nombre) {
		ArrayList<Aerolinea> AerolineaEncontrada = new ArrayList<>();
		
		return AerolineaEncontrada;
	}
	
	public boolean existeAerolinea(String nombre) {
		for (Aerolinea Aerolinea : misAerolineas) {
			if (Aerolinea.getNombre().equals(nombre)) {
				return true;
			}
		}
		return false;
	}

}
