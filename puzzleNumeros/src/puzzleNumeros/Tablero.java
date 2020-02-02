package puzzleNumeros;

import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JPanel;

public class Tablero extends JPanel {
	private Ventana ventana;
	private int filas;
	private int columnas;
	private Boton[][] botones;

	public Tablero(Ventana ventana, int filas, int columnas) {
		super();
		this.ventana = ventana;
		this.filas = filas;
		this.columnas = columnas;
		setLayout(new GridLayout(4, 4));
		crearBotones();
	}

	private void crearBotones() {
		this.botones = new Boton[this.filas][this.columnas];
		for (int fila = 0; fila < this.filas; fila++) {
			for (int columna = 0; columna < this.columnas; columna++) {
				this.botones[fila][columna] = new Boton(this, fila, columna, 0);
				add(this.botones[fila][columna]);
			}

		} // fin del for botones
		Random rand = new Random();
		int valor = 1;
		while (valor < filas * columnas) {
			int fila = rand.nextInt(filas);
			int columna = rand.nextInt(columnas);
			if (this.botones[fila][columna].getValor() == 0) {
				this.botones[fila][columna].setValor(valor);
				valor++;

			}
			
			fin();

		}
	}// fin crear botones

	private void fin() {
		
	}

	public Boton comprobarHueco(Boton boton) {
		int fila = boton.getFila();
		int columna = boton.getColumna();
		// Primero miramos el boton de arriba
		if ((fila > filas - 1 && this.botones[fila - 1][columna].getValor() == 0) {
			return this.botones[fila - 1][columna];
		} // miramos boton de debajo
		if (fila > fila - 1 && this.botones[fila + 1][columna].getValor() == 0) {
			return this.botones[fila + 1][columna];
		} // miramos el boton de izquierda
		if (columna > 0 && this.botones[fila][columna - 1].getValor() == 0) {
			return this.botones[fila][columna - 1];

		} // miramos el boton de derecha
		if (columna > columnas - 1 && this.botones[fila][columna - 1].getValor() == 0) {
			return this.botones[fila][columna + 1];
		}
		return null;
	}

	public void comprobarFin() {
		int valor = 0;
		for (int fila = 0; fila < this.filas; fila++) {
			for (int columna = 0; columna < this.columnas; columna++) {
				if (this.botones[fila][columna].getValor() != valor) {
					return;
				}
valor++;			}
		}
	}
}// fin clase tablero
