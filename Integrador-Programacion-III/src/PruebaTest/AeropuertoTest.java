package PruebaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import Aeropuerto.Aeropuerto;
import Aeropuerto.Ciudad;

class AeropuertoTest {

	@Test
	void ShowDetails_ReturnsFormatted() {

		Ciudad theCity = new Ciudad(1, "La Rioja", "5300");

		Aeropuerto theAirport = new Aeropuerto(1, "Capit�n Vicente Almandos Almonacid", "IRJ",
				theCity);

		String returned = theAirport.showDenomination();

		assertEquals("Capit�n Vicente Almandos Almonacid - La Rioja - IRJ", returned);

	}

}
