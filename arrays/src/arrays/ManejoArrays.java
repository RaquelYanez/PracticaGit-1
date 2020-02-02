package arrays;

public class ManejoArrays {

	public static void main(String[] args) {
		// declaraciçón del Array
		//[0 0 0 0 0 0 0 0 0 0 ]
		int[] unArray = new int[10];

//inserción de valroes en el array
		//[0 0 0 0 0 0 0 0 0 0 ]
		unArray[0] = 100;
		//[0 0 0 0 0 0 0 0 0 0 ]
		unArray[1] = 200;
		//[0 0 0 0 0 0 0 0 0 0 ]
		unArray[2] = 300;
		//[0 0 0 0 0 0 0 0 0 0 ]
		unArray[3] = 400;
		//[0 0 0 0 0 0 0 0 0 0 ]

		unArray[4] = 500;
		//[0 0 0 0 0 0 0 0 0 0 ]

		unArray[5] = 600;
		//[0 0 0 0 0 0 0 0 0 0 ]

		unArray[6] = 700;
		//[0 0 0 0 0 0 0 0 0 0 ]

		unArray[7] = 800;
		//[0 0 0 0 0 0 0 0 0 0 ]

		unArray[8] = 900;
		//[0 0 0 0 0 0 0 0 0 0 ]

		unArray[9] = 1000;

//recorrer el array para ver el contenido que tiene. Para ello usaremos for,siempre se usa for con array
//desde 1 = 0 hasta 1<10(9)itera de uno en uno
		for (int i = 0; i < unArray.length; i++) {
			System.out.println(unArray[i]);
			//					unArray[0], unArray[1]....unArray[9]

			if (unArray [i] != 0);
			System.out.println ("El varlor de la posición: " + i + "es: " + unArray[i]);
			
		}else{
			System.out.println("El valor enla posición: " + i + unArray[i]);
		}

	}

}
