package DimeDíasdeSemana;

import java.util.Scanner;

public class Dimedías {

	public static void main(String[] args) {
		int numeroDia; //Variabñe numero dia
		
		Scanner teclado = new Scanner (System.in); //creamos objetos scanner y llmar a clase escaner, al pasar sistem in le decimos que recoja lo que se escribe por consola
		
		System.out.println("dime un numero del 1 al 7");
		
		numeroDia= teclado.nextInt();//lo que se escriba se recojera usando el objeto teclado y el metodo. Aceptamos valores 1 2 3 4 5 6 y 7
		//ESto lo almacenara en la variable numero dia. El nextin pertenece a clase scanner y nosd evovlera un entero
		
		switch (numeroDia) {
		//en caso que nuevo dia sea igual a 1
		
		case 1:
		
		System.out.println("Hoy es: lunes");
		break;
		
		case 2:
			
			System.out.println("Hoy es: marte");
			break;
			
		case 3:
			
			System.out.println("Hoy es:miercoles ");
			break;
			
		case 4:
			
			System.out.println("Hoy es: jueves ");
			break;
			
		case 5:
			
			System.out.println("Hoy es: viernes ");
			break;
			
		case 6:
			
			System.out.println("Hoy es: sabado");
			break;
			
		case 7:
			
			System.out.println("Hoy es: domingo");
			break;

	}
}
	
}
