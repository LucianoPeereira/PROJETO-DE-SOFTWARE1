package edu.udc.psw.gui;

import javax.swing.JPanel;

import edu.udc.psw.modelo.FormaGeometrica;
import edu.udc.psw.modelo.Ponto2D;
import edu.udc.psw.modelo.manipulador.ManipuladorFormaGeometrica;
import edu.udc.psw.colecao.Iterador;
import edu.udc.psw.colecao.ListaEncadeada;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PainelDesenho extends JPanel implements MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;

	private boolean desenhando = false;
	private ManipuladorFormaGeometrica manipulador;
	private FormaGeometrica forma;
	private ListaEncadeada<FormaGeometrica> listaFormaGeometrica;

	public PainelDesenho() {
		listaFormaGeometrica = new ListaEncadeada<FormaGeometrica>();

		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void setFormaGeometrica(FormaGeometrica forma) {
		this.forma = forma;
		manipulador = forma.getManipulador();
	}

	public boolean isDesenhando() {
		return desenhando;
	}

	public void setDesenhando(boolean desenhando) {
		this.desenhando = desenhando;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (forma != null)
			manipulador.paint(g);

		FormaGeometrica formaAux;
		Iterador<FormaGeometrica> it = listaFormaGeometrica.getInicio();

		formaAux = it.getObjeto();
		while (formaAux != null) {
			formaAux.getManipulador().paint(g);
			formaAux = it.proximo();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (manipulador != null) {
			manipulador.click(e.getX(), e.getY());
			repaint();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (manipulador != null) {
			manipulador.press(e.getX(), e.getY());

			desenhando = true;
			
//			originX = arg0.getX();
//			originY = arg0.getY();
//			
//			mousePanel.setOriginX(originX);
//			mousePanel.setOriginY(originY);
//			origin = String.format("Origem: [%d; %d]", originX, originY);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (desenhando) {
			manipulador.release(e.getX(), e.getY());

			listaFormaGeometrica.inserirFim(forma);

			desenhando = false;

			forma = forma.clone();
			manipulador = forma.getManipulador();

			repaint();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (desenhando) {
			manipulador.drag(e.getX(), e.getY());

			repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		String moved = String.format("Mouse na posição [%d; %d]", arg0.getX(), arg0.getY());;
		
//		if (message.length() > 1)
//			moved = moved + " - " + message;
//		
//		status.setText(moved);
	}
}