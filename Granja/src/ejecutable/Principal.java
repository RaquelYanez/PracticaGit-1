package ejecutable;

import java.util.Scanner;
import granjero.Granjero;
import oveja.Oveja;
import vaca.Vaca;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introducir valores para crear");
		System.out.println("Introucir el nombre del granjero: ");
		String nombre = sc.next();
		System.out.println(nombre);

		System.out.println("Introucir el apellido del granjero: ");
		String apellido = sc.next();
		System.out.println(apellido);

		System.out.println("Sexo del granjero: ");
		String sexo = sc.next();
		System.out.println(sexo);

		
		//oveja
		
		
		Granjero granjero1 = new Granjero(nombre, apellido, sexo);// este es nombre del objeto, no varlor
		System.out.println(granjero1);
		Vaca vaca1 = new Vaca(1, "Palo", 370);
		Vaca vaca2 = new Vaca(2, "Pipa", 400);
		Vaca vaca3 = new Vaca(3, "Pulga", 270); 
		Oveja oveja1 = new Oveja (1, "Lanuda", 70, true);

		System.out.println("vaca tras se creaa; "+ vaca1);
		System.out.println(vaca1.setCantidadLeche(5));
		System.out.println("vaca1 tras hacer el set: "+ vaca1);
		System.out.println(granjero1.ordenharVaca(vaca1));
		System.out.println("vaca1 tras ordeñar: "+ vaca1);

		granjero1.ordenharVaca(vaca1);
		System.out.println(vaca1);
		System.out.println(vaca2);
		System.out.println(vaca3);
	}

}
