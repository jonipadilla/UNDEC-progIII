package Aeropuerto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Vuelo {
	
	private String codigoVuelo;
	private Aeropuerto salida;
	private LocalDateTime fechaHoraSalida;
	private Aeropuerto arribo;
	private LocalDateTime fechaHoraArribo;
	private Aerolinea aeroliniea;
	private Avion avion;
	
	private ArrayList<Piloto> mPilotos = new ArrayList<Piloto>();
	private ArrayList<Asignacion> asigancionPasajeros = new ArrayList<Asignacion>();
	
	
	
	public Vuelo(String codigoVuelo, Aeropuerto salida, LocalDateTime fechaHoraSalida, Aeropuerto arribo,
			LocalDateTime fechaHoraArribo, Aerolinea aeroliniea, Avion avion, ArrayList<Piloto> mPilotos,
			ArrayList<Asignacion> asigancionPasajeros) {
		this.codigoVuelo = codigoVuelo;
		this.salida = salida;
		this.fechaHoraSalida = fechaHoraSalida;
		this.arribo = arribo;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aeroliniea = aeroliniea;
		this.avion = avion;
		this.mPilotos = mPilotos;
		this.asigancionPasajeros = asigancionPasajeros;
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


	public LocalDateTime getFechaHoraSalida() {
		return fechaHoraSalida;
	}


	public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}


	public LocalDateTime getFechaHoraArribo() {
		return fechaHoraArribo;
	}


	public void setFechaHoraArribo(LocalDateTime fechaHoraArribo) {
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
