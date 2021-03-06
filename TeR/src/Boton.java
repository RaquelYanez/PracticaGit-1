import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Boton extends JButton {
	private static final ImageIcon iconoCirculo = new ImageIcon(Boton.class.getResource("img/circulo.png"));
	private static final ImageIcon iconoCruz = new ImageIcon(Boton.class.getResource("img/cruz.png"));
//creamos constantes de estado 
	public static final int VACIO = 0;
	public static final int CIRCULO = 1;
	public static final int CRUZ = 2;

	private Tablero tablero;
	private int fila;
	private int columna;
	// evitar que se sobreescriba
	private int estado;
	//hacemos cambios de estado y controlamos nosotros cuando esta pulsado y cuadno no
	private boolean pulsado;

	public Boton(Tablero tablero, int fila, int columna) {
		super();
		this.tablero = tablero;
		this.fila = fila;
		this.columna = columna;
		this.estado = Boton.VACIO;//
		this.pulsado = false;
		setBackground(Color.black);// color del cuadrado
		// escuchar lo que se introduce
		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!pulsado) { //o !Boton.this.pulsado
									pulsar();

				}
			}

		});

	}

	private void pulsar() {
		int turno = tablero.getTurno();
		if (turno == Tablero.TURNO_CIRCULO) {
			setIcon(iconoCirculo); //añade icono 
//añadimos estado
			this.estado = CIRCULO;
		} else if (turno == Tablero.TURNO_CRUZ) {
			setIcon(iconoCruz);
			this.estado = CRUZ;

		}
		// mandamos al tablero que se pulsa boton
		setBackground(Color.white); // cambiar el color al pulsar el boton
		this.pulsado = true;
		//setEnabled(false);//desactiva el boton y no nos dejara pulsarlo por segunda vez
		tablero.pulsarBoton(this);
	}
	public int getEstado() {
		return estado;
		
	}
	public int getFila() {
		return this.fila;
		
	}
	public int getColumna() {
		return this.fila;
		
	}
}
