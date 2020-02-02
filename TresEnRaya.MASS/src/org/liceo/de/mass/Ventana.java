package org.liceo.de.mass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana extends JFrame implements ActionListener{
    private JMenuBar mb;
    private JMenu menu1,menu2,menu3;
    private JMenuItem mi1,mi2,mi3,mi4;
    private ImageIcon iconoNuevaPartida, iconoSalir;
    
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
				setLayout(null);
				// metodo para crear componentes
				
				crearCanvas();
    }
  

    private void crearCanvas() {
    	
    	iconoNuevaPartida = new ImageIcon(getClass().getResource("img/icono.png"));
    	
        setLayout(null);
        mb=new JMenuBar();
        setJMenuBar(mb);
        
        menu1=new JMenu("Jugar");
        mb.add(menu1);
        
        menu2=new JMenu("Nueva partida");
        menu1.add(menu2);//menú uno incluye menu 
        
        menu3=new JMenu("Color de fondo");
        menu1.add(menu3);
        
        mi1=new JMenuItem("640*480");
        menu2.add(mi1);
        mi1.addActionListener(this);
        
        mi2=new JMenuItem("1024*768");
        menu2.add(mi2);
        
        mi2.addActionListener(this);
        mi3=new JMenuItem("Rojo");
        menu3.add(mi3);
        
        mi3.addActionListener(this);
        mi4=new JMenuItem("Verde");
        menu3.add(mi4);
        
        mi4.addActionListener(this);
    }		
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==mi1) {
            setSize(640,480);
        }
        if (e.getSource()==mi2) {
            setSize(1024,768);
        }
        if (e.getSource()==mi3) {
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource()==mi4) {
            getContentPane().setBackground(new Color(0,255,0));
        }      
	
		}
	}


