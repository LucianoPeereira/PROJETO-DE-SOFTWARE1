package edu.udc.psw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LinhaRetOval extends JFrame {

	private static final long serialVersionUID = 1L;

	Painel painel;
	Painel painel2;

	public LinhaRetOval() {
		super("Desenhando formas");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new BorderLayout());
		painel = new Painel();
		add(painel, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new BorderLayout());
		
		painel2 = new Painel();
		add(painel2, BorderLayout.CENTER);

		setVisible(true);
	}
	
	public static void main(String [] args) {
		new LinhaRetOval();
	}

	class Painel extends JPanel {
		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			this.setBackground(Color.WHITE);
			
			g.setColor(Color.RED);
			g.drawLine(5, 30, 380, 30);
			
//			g.setColor(Color.BLUE);
//			g.drawRect(5, 40, 90, 55);
//			
//			g.setColor(Color.RED);
//			g.fillRect(100, 40, 90, 55); //Retangulo
//			
//			g.setColor(Color.CYAN);
//			g.fillRoundRect(195, 40, 90, 55, 50, 50); //Retangulo preenchido
//			g.drawRoundRect(290, 40, 90, 55, 20, 20); //Retagunlo com bordas arredondadas
//			
//			g.setColor(Color.MAGENTA);
//			g.drawOval(195, 100, 90, 55); //Figura Oval
//			g.fillOval(290, 100, 90, 55);// Figura Oval preenchida
			
			//Desenha um conjunto de figuras com angulação
//			
//			g.setColor(Color.red); g.drawRect(15, 35, 80, 80);
//			g.setColor(Color.black); g.drawArc(15, 35, 80, 80, 0, 360);
//			
//			g.setColor(Color.red); g.drawRect(100, 35, 80, 80);
//			g.setColor(Color.black); g.drawArc(100, 35, 80, 80, 0, 110);
//			
//			g.setColor(Color.red); g.drawRect(185, 35, 80, 80);
//			g.setColor(Color.black); g.drawArc(185, 35, 80, 80, 0, -270);
//			
//			g.fillArc(15, 120, 80, 40, 0, 360);
//			
//			g.fillArc(100, 120, 80, 40, 270, -90);
//			
//			g.fillArc(185, 120, 80, 40, 0, -270);
//			
			//Desenha o poligono
//			int xValues[] = {20, 40, 50, 30, 20, 15};
//			int yValues[] = {50, 50, 60, 80, 80, 60};
//			Polygon polygon1 = new Polygon(xValues, yValues, 6);
//			g.drawPolygon(polygon1);
//			
//			int xValues2[] = {70, 90, 100, 80, 70, 65, 60};
//			int yValues2[] = {100, 100, 110, 110, 130, 110, 90};
//			g.drawPolyline(xValues2, yValues2, 7);
			
		}
		
		public void paintComponent1(Graphics g) {
			super.paintComponent(g);

			this.setBackground(Color.WHITE);
			
//			g.setColor(Color.RED);
//			g.drawLine(5, 30, 380, 30);
//			
//			g.setColor(Color.BLUE);
//			g.drawRect(5, 40, 90, 55);
//			
//			g.setColor(Color.RED);
//			g.fillRect(100, 40, 90, 55); //Retangulo
//			
//			g.setColor(Color.CYAN);
//			g.fillRoundRect(195, 40, 90, 55, 50, 50); //Retangulo preenchido
//			g.drawRoundRect(290, 40, 90, 55, 20, 20); //Retagunlo com bordas arredondadas
//			
//			g.setColor(Color.MAGENTA);
//			g.drawOval(195, 100, 90, 55); //Figura Oval
//			g.fillOval(290, 100, 90, 55);// Figura Oval preenchida
			
			//Desenha um conjunto de figuras com angulação
//			
//			g.setColor(Color.red); g.drawRect(15, 35, 80, 80);
//			g.setColor(Color.black); g.drawArc(15, 35, 80, 80, 0, 360);
//			
//			g.setColor(Color.red); g.drawRect(100, 35, 80, 80);
//			g.setColor(Color.black); g.drawArc(100, 35, 80, 80, 0, 110);
//			
//			g.setColor(Color.red); g.drawRect(185, 35, 80, 80);
//			g.setColor(Color.black); g.drawArc(185, 35, 80, 80, 0, -270);
//			
//			g.fillArc(15, 120, 80, 40, 0, 360);
//			
//			g.fillArc(100, 120, 80, 40, 270, -90);
//			
//			g.fillArc(185, 120, 80, 40, 0, -270);
//			
			//Desenha o poligono
			int xValues[] = {20, 40, 50, 30, 20, 15};
			int yValues[] = {50, 50, 60, 80, 80, 60};
			Polygon polygon1 = new Polygon(xValues, yValues, 6);
			g.drawPolygon(polygon1);
			
			int xValues2[] = {70, 90, 100, 80, 70, 65, 60};
			int yValues2[] = {100, 100, 110, 110, 130, 110, 90};
			g.drawPolyline(xValues2, yValues2, 7);
			
		}
		
		
	}

}
