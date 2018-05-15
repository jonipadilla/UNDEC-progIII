package LogicaAeropuerto;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import Aeropuerto.Piloto;

public class GestorPiloto {
	
	
	private ArrayList<Piloto> misPilotos = new ArrayList<>();
	
	public boolean crearPiloto(Integer idPiloto, String apellido, String nombre, String documento, LocalDate fechaNacimiento) {
		LocalDate fechap1 = LocalDate.of(1970, Month.SEPTEMBER, 7);
		if (existePiloto(documento)==false) {
			Piloto nuevoPiloto = new Piloto(1,"Pérez","Juan Antonio","07071970",fechap1);
			
			misPilotos.add(nuevoPiloto);
			return true;
		}
		return false;
	}

	public boolean modificarPiloto(Piloto pilotoNuevo, Piloto pilotoViejo) {
		if (!misPilotos.contains(pilotoViejo))
			return false;
			
		misPilotos.remove(pilotoViejo);
		misPilotos.add(pilotoNuevo);
		return true;
	}
	
	public boolean bajaPilotos(String documento) {
		for (Piloto piloto : misPilotos) {
			if (documento==piloto.getDocumento()) {
				misPilotos.remove(piloto);
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Piloto> buscarPiloto(String documento) {
		ArrayList<Piloto> PilotoEncontrado = new ArrayList<>();
		
		return PilotoEncontrado;
	}
	
	public boolean existePiloto(String documento) {
		for (Piloto piloto : misPilotos) {
			if (documento==piloto.getDocumento()) {
				return true;
			}
		}
		return false;
	}

}
