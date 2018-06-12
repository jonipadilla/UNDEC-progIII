package Aeropuerto;

import java.util.ArrayList;

public class Avion implements Comparable<Avion>{

	private Integer idAvion;
	private String modelo;
	private String matricula;

	ArrayList<Asiento> listaAsientos = new ArrayList<Asiento>();


	public Avion(Integer idAvion, String modelo, String matricula, ArrayList<Asiento> listaAsientos) {
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.matricula = matricula;
		this.listaAsientos = listaAsientos;
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

	@Override
	public String toString() {
		return "Avion modelo=" + modelo + ", matricula=" + matricula ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAvion == null) ? 0 : idAvion.hashCode());
		result = prime * result + ((listaAsientos == null) ? 0 : listaAsientos.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Avion other = (Avion) obj;
		if (idAvion == null) {
			if (other.idAvion != null) {
				return false;
			}
		} else if (!idAvion.equals(other.idAvion)) {
			return false;
		}

		if (matricula == null) {
			if (other.matricula != null) {
				return false;
			}
		} else if (!matricula.equals(other.matricula)) {
			return false;
		}
		if (modelo == null) {
			if (other.modelo != null) {
				return false;
			}
		} else if (!modelo.equals(other.modelo)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Avion o) {
		return idAvion-o.getIdAvion();
	}

}
