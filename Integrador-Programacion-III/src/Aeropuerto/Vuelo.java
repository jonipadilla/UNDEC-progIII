package Aeropuerto;

import java.time.LocalDate;
import java.util.ArrayList;


public class Vuelo {
	
	private String codigoVuelo;
	private Aeropuerto salida;
	private LocalDate fechaHoraSalida;
	private Aeropuerto arribo;
	private LocalDate fechaHoraArribo;
	private Aerolinea aeroliniea;
	private Avion avion;
	
	ArrayList<Piloto> misPilotos = new ArrayList<Piloto>();
	ArrayList<Asignacion> pasajeros = new ArrayList<Asignacion>();
	
	public Vuelo () {
		
	}


	public String getCodigoVuelo() {
		return codigoVuelo;
	}


	public void setCodigoVuelo(String codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}


	public Aeropuerto getSalida() {
		return salida;
	}


	public void setSalida(Aeropuerto salida) {
		this.salida = salida;
	}


	public LocalDate getFechaHoraSalida() {
		return fechaHoraSalida;
	}


	public void setFechaHoraSalida(LocalDate fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}


	public LocalDate getFechaHoraArribo() {
		return fechaHoraArribo;
	}


	public void setFechaHoraArribo(LocalDate fechaHoraArribo) {
		this.fechaHoraArribo = fechaHoraArribo;
	}


	public Aeropuerto getArribo() {
		return arribo;
	}


	public void setArribo(Aeropuerto arribo) {
		this.arribo = arribo;
	}


	public Aerolinea getAeroliniea() {
		return aeroliniea;
	}


	public void setAeroliniea(Aerolinea aeroliniea) {
		this.aeroliniea = aeroliniea;
	}


	public Avion getAvion() {
		return avion;
	}


	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	
		
	

}
