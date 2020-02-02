package puzzleNumeros;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Boton extends JButton {
	private Tablero tablero;
	private int fila;
	private int columna;
	private int valor;

	public Boton(Tablero tablero, int fila, int columna, int valor) {
		super();
		this.tablero = tablero;
		this.fila = fila;
		this.columna = columna;
		setValor(valor);
		addMouseListener(new MouseAdapter() { // lo mismo que el teclado pero con raton
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				Pulsar();
			}

			private void Pulsar() {
				Boton hueco = tablero.comprobarHueco(Boton.this);
				if (hueco == null) {
					JOptionPane.showConfirmDialog(Boton.this.tablero, "El boton seleccionado no se puede mover",
							"Botón bloqueado", JOptionPane.WARNING_MESSAGE);
				} else {
					hueco.setValor(Boton.this.valor);
					setValor(0);
					tablero.comprobarFin();
				}

			}
		});
		// setBackground(Color.BLUE);
		// setForeground(Color.WHITE);//Color letras
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
		if (valor == 0) {
			setBackground(Color.WHITE);
			setText("");
		} else {
			setBackground(Color.BLUE);
			setText("" + valor);
		}
		setForeground(Color.WHITE);

	}

	public int getFila() {
		return this.fila;
	}

	public int getColumna() {
		return this.columna;
	}
}
