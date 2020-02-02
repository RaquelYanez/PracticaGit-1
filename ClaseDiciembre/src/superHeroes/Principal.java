package superHeroes;

public class Principal {

	public static void main(String[] args) {
//Superheroes batman;//nombre del objeto batman
		Superheroes batman = new Superheroes("Bruce Waine", 100, 100);// nombre del valor de la proiedad, todo lo de la
																		// derecha es llamada al contructor
		System.out.println(batman);
		//nombre objeto.funcion
		batman.contadorVelocidad(60);
		
		Superheroes spyderman = new Superheroes ("Peter Parker", 60, 50);
		spyderman.contadorVelocidad(60);

		// operador condicional
		int x = 100;
		int y = 10;
// -----------------------------------------------------------------------------------------------
		// int z = 0; //no le damos valor
		// la operacioḉon ternaria = expresión booleana ? true : false
		// z = (x<y)?x+3:y+8;
		// string z =""; z = batman instanceof Superheroes ? "es un super heroe" ? : "no
		// es superheroe". Podemosmeter el insntace fo detro del sysout y ahorramos la
		// variable
		// System.out.println(z);
		// --------------------------------
		/*
		 * int j = 0; int z = 0;
		 * 
		 * for (int i = 0; i<=3;i++) { System.out.println("valor de i: " + i);
		 * 
		 * System.out.println("valor de z antes : " + z); z=j++;
		 * System.out.println("valor de z despues: " + z);
		 * System.out.println("valor de j despues: " + j);
		 * 
		 */
//----------------------------------------------------------------------------------------

	}

}
