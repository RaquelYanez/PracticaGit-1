import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class Tablero extends JPanel {
	// creamos más constantes para tablero 3
	public static final int TURNO_CIRCULO = 1;
	public static final int TURNO_CRUZ = 2;
	public static final int EMPATE;

	public Ventana ventana;
	// variables de filas y columnas
	private int filas;
	private int columnas;
	// variable para turno del jugador
	private int turno;
	// botones
	private int pulsados;
	private Boton[][] botones;

	public Tablero(Ventana ventana, int filas, int columnas) {
		super();
		this.ventana = ventana;
		this.filas = filas;
		this.columnas = columnas;
		this.pulsados = pulsados;
		//
		// Que va a tener el tablero
		// Borde
		setBorder(new LineBorder(Color.RED, 5));
		setLayout(new GridLayout(this.filas, this.columnas)); // constructor de capas para colocar filas y columnas.
																// GRID nos crea filas y columnas
		// metodo para crear botones
		crearBotones();
		generarTurno();

	}

	private void generarTurno() {// 1
		this.turno = generarNumeroAleatorio(1, 2);
		// acedemos a ventana con la variable ventana
		ventana.cambiarTurno(this.turno);
	}

	private int generarNumeroAleatorio(int min, int max) { // generador de numero aleatorio 2
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}

	private void crearBotones() {
		botones = new Boton[filas][columnas];
		for (int filas = 0; filas < this.filas; filas++) {// recorren las filas del array

			for (int columnas = 0; columnas < this.columnas; columnas++) {// recorren las columnas del array
				botones[filas][columnas] = new Boton(this, filas, columnas);
				add(this.botones[filas][columnas]);

			}
		}
	}

	public int getTurno() {
//metodo generado desde metodo boton en case boton
		return this.turno;
	}

	public void pulsarBoton(Boton boton) {
		// en nuestro array de botonos en la fila del boton y en la columna el boton el
		// nuevo boton va a ser boton
		this.botones[boton.getFila()][boton.getColumna()] = boton;
		pulsados++;
		comprobarFin();
//aqui le mandamos de calse boton pulsar boton
		cambiarTurno();

	}

	private void comprobarFin() { //me cago en jesus......
		int resultado = 0;
		if(comprobar (Tablero.TURNO_CIRCULO)) {
			resultado = Tablero.TURNO_CIRCULO;
		}else if (comprobar (Tablero.TURNO_CRUZ)) 
			resultado = Tablero.TURNO_CRUZ;
		
		}else if (this.pulsados == 9){
		resultado = Tablero.EMPATE;
		
	}else{
		return;
	}

public boolean comprobar(int jugador) {
	if ((this.botones[0][0].getEstado() == jugador) 
			&& (this.botones[0][1].getEstado() == jugador)
			&& (this.botones[0][2].getEstado() == jugador)) {
		return true;
		
	} else if ((this.botones[1][0].getEstado() == jugador)
			&& (this.botones[1][1].getEstado() == jugador)
			&& (this.botones[1][2].getEstado() == jugador))
	{
		return true;
		
	} else if ((this.botones[2][0].getEstado() == jugador) 
			&& (this.botones[2][1].getEstado() == jugador)
			&& (this.botones[2][2].getEstado() == jugador))
	{
		return true;
		
	} else if ((this.botones[0][0].getEstado() == jugador)
			&& (this.botones[1][0].getEstado() == jugador)
			&& (this.botones[2][0].getEstado() == jugador))
	{
		return true;
		
	} else if ((this.botones[0][1].getEstado() == jugador) 
			&& (this.botones[1][1].getEstado() == jugador)
			&& (this.botones[2][1].getEstado() == jugador)) 
	{
		return true;
		
	} else if ((this.botones[0][2].getEstado() == jugador)
			&& (this.botones[1][2].getEstado() == jugador)
			&& (this.botones[2][2].getEstado() == jugador))
	{
		return true;
		
	} else if ((this.botones[0][0].getEstado() == jugador) 
			&& (this.botones[1][1].getEstado() == jugador)
			&& (this.botones[2][2].getEstado() == jugador)) 
	{
		return true;
		
	} else if ((this.botones[0][2].getEstado() == jugador) 
			&& (this.botones[1][1].getEstado() == jugador)
			&& (this.botones[2][0].getEstado() == jugador))
	{
		return true;
	}
	return false;
}

	private void cambiarTurno() {
		if (this.turno == TURNO_CIRCULO) { // si estamos en criculo cambia a cruz
			this.turno = TURNO_CRUZ;
		} else if (this.turno == TURNO_CRUZ) {
			this.turno = TURNO_CIRCULO;
		}
		ventana.cambiarTurno(this.turno);
	}
	}
}
