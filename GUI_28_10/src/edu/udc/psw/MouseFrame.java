package edu.udc.psw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class MouseFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel mousePanel; // Janela em branco editavel
	
	public MouseFrame() {
		super("Tratamento dos eventos de Mouse");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new BorderLayout());
		
		mousePanel = new JPanel();
		add(mousePanel, BorderLayout.CENTER);
		
		JLabel texto = new JLabel("Mensagem de Evento do Mouse");
		add(texto, BorderLayout.SOUTH);
		
		//Tratamento de eventos do Mouse
		mousePanel.addMouseListener(new MouseListener() { 
			
			@Override
			public void mouseClicked(MouseEvent event) {
				String detalhe;
				if(event.isMetaDown()) //Botao direito do mouse
					detalhe = "Com botão direito";
				else if(event.isAltDown()) //Botao do meio do mouse
					detalhe = "Com botão do meio";
				else //Botao esquerdo do mouse
					detalhe = "Com botão esquerdo";
				
				texto.setText(String.format("Mouse foi Clicado no ponto (%d; %d) %s", event.getX(), event.getY(), detalhe));
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				mousePanel.setBackground(Color.GREEN);
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				mousePanel.setBackground(Color.WHITE);
				
			}

			@Override
			public void mousePressed(MouseEvent event) {
				texto.setText(String.format("Mouse foi Pressionado no ponto (%d; %d)", event.getX(), event.getY() ));
				
			}

			@Override
			public void mouseReleased(MouseEvent event) {
				texto.setText(String.format("Mouse foi Liberado no ponto (%d; %d)", event.getX(), event.getY() ));
				
			}
			
		});
		
		mousePanel.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent event) {
				texto.setText(String.format("Mouse foi Arrastado no ponto (%d; %d)", event.getX(), event.getY() ));
				
			}

			@Override
			public void mouseMoved(MouseEvent event) {
				texto.setText(String.format("Mouse foi movido no ponto (%d; %d)", event.getX(), event.getY() ));
				
			}
			
		});
		setVisible(true);
	}
}
