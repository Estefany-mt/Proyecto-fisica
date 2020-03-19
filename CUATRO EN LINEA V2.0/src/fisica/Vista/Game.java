package fisica.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import fisica.Logica.*;
import fisica.Vista.*;

import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;

public class Game extends JFrame {
	//ATRIBUTOS E INSTANCIAS PERTINENTES
	private JPanel contentPane;
	private int vlancha;
	private int vrio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Game() {
		//CREA Y MODIFICA EL FRAME
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("movimiento relativo");
		setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 18));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 50, 960, 544);
		Panel contentPane = new Panel("/images/Jugadores.png");
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		
		add(new Dibujar(getVlancha(),getVrio()));
	}
	public int getVlancha() {
		return vlancha;
	}
	public int getVrio() {
		return vrio;
	}

	public void setVlancha(int lancha) {
		this.vlancha = lancha;
	}

	public void setVrio(int rio) {
		this.vrio = rio;
	}
}
