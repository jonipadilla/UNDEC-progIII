package Aeropuerto;

import java.util.ArrayList;

public class Avion {
	
	private Integer idAvion;
	private String modelo;
	private String matricula;
	
	ArrayList<Asiento> listaAsientos = new ArrayList<Asiento>();
	
	
	public Avion() {
		
	}
	

	public Integer getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(Integer idAvion) {
		this.idAvion = idAvion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
