package Aeropuerto;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		Aeropuerto misAeropuertos[] = new Aeropuerto[4];
		
		misAeropuertos[1] = new Aeropuerto(1,"Aeropuerto Capitán Vicente Almandos Almonacid", "IRJ");
		misAeropuertos[2] = new Aeropuerto(2,"Aeropuerto Buenos Aires Jorge Newbery", "AEP");
		misAeropuertos[3] = new Aeropuerto(3,"Aeropuerto El Plumerillo", "MDZ");
		misAeropuertos[4] = new Aeropuerto(4,"Aeropuerto Benjamín Matienzo", "TUC");
		
		
		for (int i = 0 ; i<=misAeropuertos.length;i++) {
			System.out.println(misAeropuertos[i].getNombre());
		}
	}

}
