package fisica.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import CuatroEnLinea.Vista.Game2;
import CuatroEnLinea.Vista.Panel;
import CuatroEnLinea.Vista.VentanaInicio;
import CuatroEnLinea.Vista.VentanaJugador;
import fisica.Logica.Nave;

public class Datos extends JFrame {
	//ATRIBUTOS 
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
///*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datos frame = new Datos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//*/
	/**
	 * Create the frame.
	 */
	public Datos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setType(Type.UTILITY);
		setTitle("movimiento relativo");
		setLocationRelativeTo(null);
		setResizable(false);
		setBounds(200, 0, 800, 800);
		Panel contentPane = new Panel("/images/fondoInicio.jpg");
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		//CREA LOS COMPONENTES Y LOS POSICIONA EN EL FRAME
		JLabel Titulo = new JLabel("");
		Titulo.setIcon(new ImageIcon(VentanaInicio.class.getResource("/images/TITULO.png")));
		Titulo.setBounds(98, 86, 600, 150);
		contentPane.add(Titulo);
		
		JLabel lancha = new JLabel("Digite la velocidad del barco (m/s)");
		lancha.setFont(new Font("Agency FB", Font.BOLD, 20));
		lancha.setBounds(246, 227, 300, 40);
		contentPane.add(lancha);
		
		JSpinner vlancha = new JSpinner();
		vlancha.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		vlancha.setBounds(246, 266, 300, 40);
		contentPane.add(vlancha);
		
		JLabel rio = new JLabel("Digite la velocidad del rio (m/s)");
		rio.setFont(new Font("Agency FB", Font.BOLD, 20));
		rio.setBounds(246, 317, 300, 40);
		contentPane.add(rio);
	
		JSpinner vrio = new JSpinner();
		vrio.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		vrio.setBounds(246, 355, 300, 40);
		contentPane.add(vrio);
		
		//BOTON QUE CAPTURA LOS DATOS DE LOS USUARIOS Y LOS LLEVA AL FRAME DEL JUEGO
		JButton Siguiente = new JButton("");
		Siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!((Integer)(vlancha.getValue())).equals(0)){
					Game g=new Game();
					g.setVlancha(((Integer)(vlancha.getValue())));
					g.setVrio(((Integer)(vrio.getValue())));
					g.setVisible(true);
					g.setAlwaysOnTop(true);
					setVisible(false);
				}else{
					JOptionPane.showMessageDialog(null, "Debe Digitar un valor", "WARNING", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		Siguiente.setIcon(new ImageIcon(VentanaJugador.class.getResource("/images/ContinuarV3.jpg")));
		Siguiente.setBounds(246, 464, 300, 40);
		contentPane.add(Siguiente);
	}

}
/*		JLabel angu = new JLabel("Digite el angulo (grados)");
angu.setFont(new Font("Agency FB", Font.BOLD, 20));
angu.setBounds(246, 426, 300, 40);
contentPane.add(angu);

JSpinner angulo = new JSpinner();
angulo.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
angulo.setBounds(246, 464, 300, 40);
contentPane.add(angulo);
*/