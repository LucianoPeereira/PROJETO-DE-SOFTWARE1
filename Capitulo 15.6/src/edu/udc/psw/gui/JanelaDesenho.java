package edu.udc.psw.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import edu.udc.psw.modelo.Retangulo;
import edu.udc.psw.modelo.Ponto2D;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaDesenho extends JFrame {
	private static final long serialVersionUID = 1L;
	private PainelDesenho contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaDesenho frame = new JanelaDesenho();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JanelaDesenho() {
		setTitle("Janela de desenho");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new PainelDesenho();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFiguras = new JMenu("Geometria");
		menuBar.add(mnFiguras);
		
		JMenuItem mntmPonto = new JMenuItem("Ponto");
		mntmPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ponto2D ponto = new Ponto2D();
				
				contentPane.setFormaGeometrica(ponto);
			}
		});
		mnFiguras.add(mntmPonto);
		
		JMenuItem mntmRetangulo = new JMenuItem("Retângulo");
		mntmRetangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Retangulo retangulo = new Retangulo();
				contentPane.setFormaGeometrica(retangulo);
			}
		});
		mnFiguras.add(mntmRetangulo);
		
		JMenuItem mntmCirculo = new JMenuItem("Circulo");
		mntmRetangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mousePanel.setOpcao(1);
			}
		});
		mnFiguras.add(mntmCirculo);
	}
}
