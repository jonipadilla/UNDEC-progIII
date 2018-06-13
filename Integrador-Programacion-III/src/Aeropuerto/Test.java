package Aeropuerto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//CIUDAD
		ArrayList<Ciudad> miCiudad = new ArrayList<>();

		Ciudad nuevaCiudad1 = new Ciudad(1, "La Rioja", "5360");
		Ciudad nuevaCiudad2 = new Ciudad(2, "Buenos Aires", "1000");
		Ciudad nuevaCiudad3 = new Ciudad(3, "Mendoza", "5500");
		Ciudad nuevaCiudad4= new Ciudad(4, "Tucuman", "4000");

		miCiudad.add(nuevaCiudad1);
		miCiudad.add(nuevaCiudad2);
		miCiudad.add(nuevaCiudad3);
		miCiudad.add(nuevaCiudad4);		


		//AEROLINEA
		ArrayList<Aerolinea> misAerolineas = new ArrayList<>();

		Aerolinea nuevaAerolinea1 = new Aerolinea(1,"Aerolíneas Argentinas");
		Aerolinea nuevaAerolinea2 = new Aerolinea(2,"Austral");
		Aerolinea nuevaAerolinea3= new Aerolinea(3, "LATAM");
		Aerolinea nuevaAerolinea4 = new Aerolinea(4, "Iberia");

		misAerolineas.add(nuevaAerolinea1);
		misAerolineas.add(nuevaAerolinea2);
		misAerolineas.add(nuevaAerolinea3);
		misAerolineas.add(nuevaAerolinea4);


		//PILOTO
		ArrayList<Piloto> misPilotos = new ArrayList<>();

		//LocalDateTime fechaHora1 = LocalDateTime.of(2018,Month.APRIL,12,13,56);
		LocalDate fechap1 = LocalDate.of(1970, Month.SEPTEMBER, 7);
		LocalDate fechap2 = LocalDate.of(1978, Month.AUGUST, 8);
		LocalDate fechap3 = LocalDate.of(1950, Month.MAY, 5);
		LocalDate fechap4 = LocalDate.of(1960, Month.OCTOBER, 10);

		Piloto nuevoPiloto1 = new Piloto(1,"Pérez","Juan Antonio","07071970",fechap1);
		Piloto nuevoPiloto2 = new Piloto(2,"Martínez", "Juan Ignacio", "08081978", fechap2);
		Piloto nuevoPiloto3 = new Piloto(3,"López", "Juan Carlos", "05051950", fechap3);
		Piloto nuevoPiloto4 = new Piloto(4,"Gómez", "Juan Gabriel", "10101960", fechap4);

		misPilotos.add(nuevoPiloto1);
		misPilotos.add(nuevoPiloto2);
		misPilotos.add(nuevoPiloto3);
		misPilotos.add(nuevoPiloto4);



		// ASIENTO
		ArrayList<Asiento> misAsientos = new ArrayList<>();

		Asiento asiento1 = new Asiento(1,"A1");
		Asiento asiento2 = new Asiento(2, "B1");
		Asiento asiento3 = new Asiento(3, "C1");
		Asiento asiento4 = new Asiento(4, "H1");
		Asiento asiento5 = new Asiento(5, "J1");
		Asiento asiento6 = new Asiento(6, "K1");
		Asiento asiento7 = new Asiento(7, "A2");
		Asiento asiento8 = new Asiento(8, "B2");
		Asiento asiento9 = new Asiento(9, "C2");
		Asiento asiento10 = new Asiento(10, "H2");
		Asiento asiento11 = new Asiento(11, "J2");
		Asiento asiento12 = new Asiento(12, "K2");

		misAsientos.add(asiento1);
		misAsientos.add(asiento2);
		misAsientos.add(asiento3);
		misAsientos.add(asiento4);
		misAsientos.add(asiento5);
		misAsientos.add(asiento6);
		misAsientos.add(asiento7);
		misAsientos.add(asiento8);
		misAsientos.add(asiento9);
		misAsientos.add(asiento10);
		misAsientos.add(asiento11);
		misAsientos.add(asiento12);


		//PASAJERO
		ArrayList<Pasajero> misPasajeros = new ArrayList<>();

		Pasajero nuevoPasajero1 = new Pasajero(1,"20123456784", "Ramírez","Ramiro Ramón","12345678");
		Pasajero nuevoPasajero2 = new Pasajero(2, "20102030404", "Fernández", "Fernando Fermín", "10203040");
		Pasajero nuevoPasajero3 = new Pasajero(3, "20987654324", "Martínez", "Martín Marcos", "98765432");
		Pasajero nuevoPasajero4 = new Pasajero(4, "20198273644", "Rodríguez", "Rodrigo Rogelio", "19827364");

		misPasajeros.add(nuevoPasajero1);
		misPasajeros.add(nuevoPasajero2);
		misPasajeros.add(nuevoPasajero3);
		misPasajeros.add(nuevoPasajero4);



		//ASIGNACION
		ArrayList<Asignacion> misAsignaciones = new ArrayList<>();

		Asignacion nuevaAsignacion1 = new Asignacion("AR2443100420182012345678443",asiento1,nuevoPasajero1);
		Asignacion nuevaAsignacion2 = new Asignacion("AR2443100420182012345678443", asiento2, nuevoPasajero2);

		misAsignaciones.add(nuevaAsignacion1);
		misAsignaciones.add(nuevaAsignacion2);



		//AVION
		ArrayList<Avion> miAvion = new ArrayList<>();

		Avion nuevoAvion1 = new Avion(1, "Airbus A340-313X", "LV-FPV", misAsientos);
		Avion nuevoAvion2 = new Avion(2, "Airbus A330-223", "LV-FNI", misAsientos);
		Avion nuevoAvion3 = new Avion(3, "Boeing 737-8MB", "LV-FYK", misAsientos);
		Avion nuevoAvion4 = new Avion(4, "Embraer ERJ-190-100AR", "LV-CIH", misAsientos);

		miAvion.add(nuevoAvion1);
		miAvion.add(nuevoAvion2);
		miAvion.add(nuevoAvion3);
		miAvion.add(nuevoAvion4);



		//AEROPUERTO
		ArrayList<Aeropuerto> misAeropuertos = new ArrayList<>();

		Aeropuerto nuevoAeropuerto1 = new Aeropuerto(1, "Aeropuerto Capitán Vicente Almandos Almonacid", "IRJ", nuevaCiudad1);
		Aeropuerto nuevoAeropuerto2 = new Aeropuerto(2,"Aeropuerto Buenos Aires Jorge Newbery", "AEP", nuevaCiudad2);
		Aeropuerto nuevoAeropuerto3 = new Aeropuerto(3,"Aeropuerto El Plumerillo", "MDZ", nuevaCiudad3);
		Aeropuerto nuevoAeropuerto4 = new Aeropuerto(4,"Aeropuerto Benjamín Matienzo", "TUC", nuevaCiudad4);

		misAeropuertos.add(nuevoAeropuerto1);
		misAeropuertos.add(nuevoAeropuerto2);
		misAeropuertos.add(nuevoAeropuerto3);
		misAeropuertos.add(nuevoAeropuerto4);

		for(Aeropuerto aeropuerto : misAeropuertos) {
			System.out.println(aeropuerto.getNombre() + "-" + aeropuerto.getCiudad().getNombre() +"-"+ aeropuerto.getCodigo());
		}





		ArrayList<Vuelo> misVuelos = new ArrayList<>();

		LocalDateTime fechaHoraS = LocalDateTime.of(2018,Month.APRIL,12,13,56);
		LocalDateTime fechaHoraA = LocalDateTime.of(2018,Month.APRIL,18,13,56);

		LocalDateTime fechaHoraS2 = LocalDateTime.of(2018,Month.APRIL,12,13,56);
		LocalDateTime fechaHoraA2 = LocalDateTime.of(2018,Month.APRIL,13,13,56);

		//Vuelo nuevoVuelo = new Vuelo("1",nuevoAeropuerto1,nuevoAeropuerto2,fechaHoraS,fechaHoraA,nuevaAerolinea1, nuevoAvion1,misPilotos,misAsignaciones);
		//Vuelo nuevoVuelo = new Vuelo("1",nuevoAeropuerto1, fechaHoraS, nuevoAeropuerto2, fechaHoraA, nuevaAerolinea1, nuevoAvion1, misPilotos, misAsignaciones);
		Vuelo nuevoVuelo = new Vuelo("AR2443", nuevoAeropuerto1, fechaHoraS, nuevoAeropuerto2, fechaHoraA, nuevaAerolinea1, nuevoAvion1, misPilotos, misAsignaciones);
		Vuelo nuevoVuelo3 = new Vuelo("AR2017", nuevoAeropuerto1, fechaHoraS, nuevoAeropuerto2, fechaHoraA, nuevaAerolinea1, nuevoAvion1, misPilotos, misAsignaciones);

		Vuelo nuevoVuelo2 = new Vuelo("AR2018", nuevoAeropuerto1, fechaHoraS2, nuevoAeropuerto2, fechaHoraA2, nuevaAerolinea1, nuevoAvion2, misPilotos, misAsignaciones);

		misVuelos.add(nuevoVuelo);
		misVuelos.add(nuevoVuelo2);
		misVuelos.add(nuevoVuelo3);


		//MOSTRAR DETALLE DE VUELO
		mostrarDetalleVuelo(misVuelos, "AR2443");


		//MOSTRAR DETALLE DE ASIGNACIONES
		mostrarDetalleAsignaciones(misVuelos,"AR2443");


		//MOSTRAR PILOTOS POR EDAD
		mostrarPilotosPorEdad(misPilotos);


		//MOSTRAR RANKIN DE AVION POR HORAS DE VUELOS
		rankinAvionHoraVuelo(misVuelos);


	}


	public static void mostrarDetalleVuelo(ArrayList<Vuelo> misVuelos, String codigoV) {
		for (Vuelo vuelo : misVuelos) {
			if(vuelo.getCodigoVuelo().equals(codigoV)){
				System.out.println("vuelo" +" "+ vuelo.getCodigoVuelo() +"-"+ vuelo.getAvion().getModelo());
			}
		}
	}


	public static void mostrarDetalleAsignaciones(ArrayList<Vuelo> misVuelos, String codVueloAsignacion) {

		boolean encontrado = false;

		for (Vuelo vuelo : misVuelos) {
			if (vuelo.getCodigoVuelo().equals(codVueloAsignacion)) {
				//System.out.println("Detalle de asignaciones - vuelo " + vuelo.getCodigoVuelo() + vuelo.getAsigancionPasajeros());
				for (Asiento asiento : vuelo.getAvion().listaAsientos) {

					encontrado = false;

					for (Asignacion asignacion: vuelo.getAsigancionPasajeros()) {

						//System.out.println("Asiento " + asiento.getNumeroAsiento() + " - ASignacion  " + asignacion.getAsiento().getNumeroAsiento());

						if (asiento.getNumeroAsiento().equals(asignacion.getAsiento().getNumeroAsiento())) {
							encontrado = true;
							System.out.println("Asiento : " + asiento.getNumeroAsiento() + " - ocupado");
							break;
						}

					}
					if(encontrado==false) {
						System.out.println("Asiento : " + asiento.getNumeroAsiento() + " - libre");
					}
				}	

			}
		}
	}

	public static void rankinAvionHoraVuelo(ArrayList<Vuelo> misVuelos) {
		SortedMap<Avion, Double> salida = new TreeMap<Avion,Double>();
		for (Vuelo vuelo : misVuelos) {		
			if (!salida.containsKey(vuelo.getAvion())) {
				salida.put(vuelo.getAvion(), new Double(2));
			}else {
				salida.put(vuelo.getAvion(), Double.sum(salida.get(vuelo.getAvion()), new Double(5)));
			}
		}
		for (Iterator iterator = salida.keySet().iterator(); iterator.hasNext();) {
			Object key = iterator.next();
			Avion aux = (Avion) key;
			System.out.println(aux.toString()+" " +salida.get(key));;

		}

	}


	public static void mostrarPilotosPorEdad(ArrayList<Piloto> misPilotos) {
		//for (Piloto piloto : misPilotos) {

	}
}
