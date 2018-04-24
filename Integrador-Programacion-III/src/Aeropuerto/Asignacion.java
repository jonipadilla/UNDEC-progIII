package Aeropuerto;

public class Asignacion {
	
	private String codigoAsignacion;
	private Asiento asiento;
	private Pasajero pasajero;
	
			
	public Asignacion(String codigoAsignacion, Asiento asiento, Pasajero pasajero) {
		this.codigoAsignacion = codigoAsignacion;
		this.asiento = asiento;
		this.pasajero = pasajero;
	}


	public Asiento getAsiento() {
		return asiento;
	}


	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}




	public String getCodigoAsignacion() {
		return codigoAsignacion;
	}




	public void setCodigoAsignacion(String codigoAsignacion) {
		this.codigoAsignacion = codigoAsignacion;
	}


	public Pasajero getPasajero() {
		return pasajero;
	}


	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	
	
	
}
