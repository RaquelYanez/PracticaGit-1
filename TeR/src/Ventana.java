import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class Ventana extends JFrame {
	private Tablero tablero;

	public Ventana() {
		super();
		
		setSize(300, 300); // tamaño de ventana
		setLocationRelativeTo(null); // centra la ventana pero si le pasas un componente te lo coloca en base a la
										// ventana

		// titulo de ventana
		setTitle("TRES en RAYA ");

		// redimensionar ventana
		setResizable(false);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Aqui decimos como queremos colocar elementos
		// setLayout(null);
		// metodo para crear componentes
		URL url = getClass().getResource("/img/icono.png");
		setIconImage(new ImageIcon(url).getImage());

		crearMenu();
		crearTablero();

	}

	private void crearTablero() {
		tablero = new Tablero(this, 3, 3);
		// añadismos a la ventana ese tablero que acabamos de crear
		add(this.tablero);
	}

	private void crearMenu() {
		JMenuBar mBar = new JMenuBar();
		JMenu mPartida = new JMenu("Juego");

		mPartida.setMnemonic(KeyEvent.VK_P);// lee la entrada es un atajo del teclado al pulsar p inciaria
		JMenuItem nuevaPartida = new JMenuItem("Nueva PArtida");
		nuevaPartida.setIcon(new ImageIcon(getClass().getResource("/img/icono.png")));
		nuevaPartida.setMnemonic(KeyEvent.VK_N); // vk son constantes que van asociadas al teclado
		nuevaPartida.setAccelerator(KeyStroke.getKeyStroke("ctrl N")); // crea el atajo de teclado para acceder directo
																		// al item
		nuevaPartida.addActionListener(new ActionListener() {// para que cuando pulsemos va a estar escuchando y al
																// pulsar el menou hara lo que este el metodo

			@Override
			public void actionPerformed(ActionEvent e) {//
				nuevaPartida();
			}

			private void nuevaPartida() {
				System.out.println("Nueva partida");
			}
		});
		mPartida.add(nuevaPartida);// lee la entrada es un atajo del teclado al pulsar p inciaria
		JMenuItem salir = new JMenuItem("Salir");
		salir.setIcon(new ImageIcon(getClass().getResource("/img/salir.png")));
		salir.setMnemonic(KeyEvent.VK_S); // vk son constantes que van asociadas al teclado
		salir.setAccelerator(KeyStroke.getKeyStroke("ctrl S")); // crea el atajo de teclado para acceder directo
																// al item
		salir.addActionListener(new ActionListener() {// para que cuando pulsemos va a estar escuchando y al pulsar el
														// menou hara lo que este el metodo

			@Override
			public void actionPerformed(ActionEvent e) {//
				System.exit(0);
			}
		});
		mPartida.add(salir);
		mBar.add(mPartida);
		setJMenuBar(mBar);
	}

	public void cambiarTurno(int turno) {// 3
//ver que valor tiene este turno y ponerle un titulo 
		if (turno == Tablero.TURNO_CIRCULO) {
			setTitle("Jugador 1 (Círculo)");
			
		}else if (turno == Tablero.TURNO_CRUZ) {
			setTitle("Jugador 2 (Cruz)");
		}
	}

}
