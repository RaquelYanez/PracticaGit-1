package com.liceolapaz.des.mass;

public class Principal { // linea de declaración de paquete

	public static void main(String[] args) {

		// Definicion de variables con String
		/*
		 * tipos string definimosuna variable ej saludar = asginar valor y "" cadena de
		 * impresión con esto definimos una variable tipo string
		 */
	//	String saludar = "Hola Kentucky";
		/*
		 * para imprimir solo hay que poner el nombre de la variable
		 */
		//System.out.println(saludar);
		//System.out.println(saludar);
		//System.out.println(saludar); // sysout con ctrl y espacio autocompleta

		//tambien en java 10 podemos usar la palabra reservada var en lugar de string
	//String despedirse= "Adios";
	//System.out.println(despedirse);
	
	//en J8 hay que elegir la variable concreta en 10 la palabra reservada var vale para cualquier tipo de variable
	//var j10 int j8 
	
	//--------Segunda parte curso----
	
		String usuario = "Kentucky";
		String saludar = "Hola ";
		
		System.out.println(saludar + usuario);
	}

}