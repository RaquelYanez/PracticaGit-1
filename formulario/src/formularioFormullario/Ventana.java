package formularioFormullario;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Event;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame {

	public Ventana() {
		super();
		setSize(800, 600); // tamaño de ventana
		setLocationRelativeTo(null); // centra la ventana pero si le pasas un componente te lo coloca en base a la
										// ventana

		// titulo de ventana
		setTitle("Formulario de registro");

		// redimensionar ventana
		setResizable(false);

		/*
		 * botono cerrar. Este es por defecto. pero si pusnemo el do nothing on close no
		 * nos deja cerrar par apoder crear un evento de aviso para guardar antes de
		 * cerarar
		 */
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Aqui decimos como queremos colocar elementos
		setLayout(null);
		// metodo para crear componentes
		crearComponentes();

	}

	private void crearComponentes() {
		JLabel lbUsuario = new JLabel("Usuario");// jlabel son clases
		lbUsuario.setBounds(10, 10, 200, 50);// colocamos por cordenadas en el canvas
		add(lbUsuario);// añade al canvas el objeto
		// campo de texto
		JTextField txtUsuario = new JTextField();
		txtUsuario.setBounds(10, 50, 200, 30);
		add(txtUsuario);
		// Contraseña
		JLabel lbPass = new JLabel("Pasword");
		lbPass.setBounds(10, 70, 200, 50);
		add(lbPass);

		// Pasword
		JPasswordField txtPass = new JPasswordField();
		txtPass.setBounds(10, 110, 200, 30);
		add(txtPass);

		// pais
		JLabel lbPais = new JLabel("Pais");
		lbPais.setBounds(10, 130, 200, 50);
		add(lbPais);

		// lista desplgable JComboBox. Igual que e array list hay que decirle que vamos
		// aguardar
		String[] paises = { "España", "Francia", "Alemania", "Italia" };
		JComboBox<String> lstPais = new JComboBox<>(paises);
		// una vez creado le decimos donde lo queremos poner
		lstPais.setBounds(10, 180, 200, 50);
		add(lstPais);

		// sexo
		JLabel lbSex = new JLabel("Sexo");
		lbSex.setBounds(10, 250, 200, 30);
		add(lbSex);
		// Boton
		JRadioButton rbH = new JRadioButton("Hombre");
		rbH.setSelected(true);
		rbH.setBounds(10, 280, 80, 30);
		add(rbH);
		JRadioButton rbM = new JRadioButton("Mujer");
		rbM.setBounds(120, 280, 80, 30);
		add(rbM);

		ButtonGroup bgSex = new ButtonGroup();
		bgSex.add(rbH);
		bgSex.add(rbM);

		// CheckBox
		JCheckBox cbNewsLetter = new JCheckBox("Suscribirse Newa Letter", true);
		cbNewsLetter.setBounds(10, 310, 200, 50);
		add(cbNewsLetter);

		// TEXTO
		JTextArea taDatos = new JTextArea();
		taDatos.setEditable(false);
		taDatos.setBorder(new LineBorder(Color.lightGray));
		taDatos.setBounds(400, 20, 300, 400);
		add(taDatos);
		// boton
		JButton btnAcept = new JButton("Aceptar");
		// añadir nustrp propio codigo al boton
		btnAcept.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = "";
				texto += "usuario: ";
				texto += txtUsuario.getText();
				texto += "\r\n";
				texto += "contraseña: ";
				texto += new String (txtPass.getPassword());
				texto += "\r\n";
				texto += "Pais: ";
				texto += lstPais.getSelectedItem();
				texto += "\r\n";
				texto += "Sexo:";
				if (rbH.isSelected()) {
					texto += "hombre";
				} else {
					texto += "mujer";
				}
				texto += "\r\n";
				texto += "Suscribirse: ";
				if (cbNewsLetter.isSelected()) {
					texto += "si";
				} else {
					texto += "no";
				}
				taDatos.setText(texto);

			}
		});

		btnAcept.setBounds(10, 400, 200, 40);
		add(btnAcept);

	}
}
