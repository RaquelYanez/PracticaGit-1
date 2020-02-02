package Casos;

public class Casos {

	public static void elegirDiaSemana() {

		int dia = 9;

		switch (dia) { // variables que vamos a evaluar es en el parentesis
		case 1:
			System.out.println("es lunes");
			break;
		case 2:
			System.out.println("es martes");
			break;
		case 3:
			System.out.println("es miercoles");
			break;
		case 4:
			System.out.println("es jueves");
			break;

		case 5:
			System.out.println("es viernes");
			break;
		case 6:
			System.out.println("es sabado");
			break;
		case 7:
			System.out.println("es domingo");
			break;
		default:
			System.out.println("intruzca un numero del 1 a 7");
			elegirDiaSemana();

		}
	}

	public static void main(String[] args) {

		Casos.elegirDiaSemana();
		System.out.println("he salido del switch");
	}
}
