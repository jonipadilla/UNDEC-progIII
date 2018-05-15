package Aeropuerto;

public class Aeropuerto {
	
	private Integer idAeropuerto;
	private String nombre;
	private String codigo;	
	private Ciudad ciudad;
	
	public Aeropuerto(Integer idAeropuerto, String nombre, String codigo, Ciudad ciudad) {
		this.idAeropuerto = idAeropuerto;
		this.nombre = nombre;
		this.codigo = codigo;
		this.ciudad = ciudad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Ciudad getCiudad() {
		return ciudad;
	}


	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}


	public Integer getIdAeropuerto() {
		return idAeropuerto;
	}


	public void setIdAeropuerto(Integer idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}
	
	
	public void mostrarAeropuertos() {
		System.out.println("Los Aeropuertos son: ");
	}

	
	
}
