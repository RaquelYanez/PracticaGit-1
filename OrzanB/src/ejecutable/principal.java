package ejecutable;

import Persona.hombre;
import Persona.mujer;
import Pub.Portero;
import Pub.Pub;
import cajero.Cajero;

public class principal {

	private static Object persona;

	public static void main(String[] args) {
		hombre objeto1;
		objeto1 = new hombre("Pepe", "López", 72, true);
		mujer objeto2;
		objeto2 = new mujer ("Maria","Divina", 17, true);
		
		Cajero cajero1 = new Cajero("Abanca", 1, 100);
		Cajero cajero2 = new Cajero("Abanca", 2, 1010);
		Cajero cajero3 = new Cajero("Abanca", 3, 1020);

		Cajero cajero4 = new Cajero("Abanca", 4, 1022220);
		Cajero cajero5 = new Cajero("Abanca", 5, 1030);
		Cajero cajero6 = new Cajero("Abanca", 6, 1000);

		objeto1.sacarDinero(cajero1, 100);

		System.out.println(objeto1);
		System.out.println(cajero1);
		// objeto1.sacarDinero(objetoCajero, 100);

		Portero portero1 = new Portero("Mutombo", "karate", 120);
		Portero portero2 = new Portero("Mauricia", "MA", 85);
		Pub pub1= new Pub("Lolita", 5, true, 2300, portero1);
		objeto1.entrerEnPub(pub1);
	}

}
