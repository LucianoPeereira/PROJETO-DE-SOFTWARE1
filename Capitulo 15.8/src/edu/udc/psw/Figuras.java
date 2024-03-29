package edu.udc.psw;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Colecao.IteradorAbstrato;
import Colecao.ListaEncadeada;

public class Figuras extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private Painel mousePanel;
	private String message;
	private String origin;
	private double r;
	private int originX, originY;
	private int radiusX, radiusY;
	private int pontoAX, pontoAY, pontoBX, pontoBY, pontoCX, pontoCY;
	private int cliquesTriangulo = 3;
	
	/* Getters and Setters */
	
	public int getOriginX() {
		return originX;
	}

	public void setOriginX(int originX) {
		this.originX = originX;
	}

	public int getOriginY() {
		return originY;
	}

	public void setOriginY(int originY) {
		this.originY = originY;
	}

	public int getRadiusX() {
		return radiusX;
	}

	public void setRadiusX(int radiusX) {
		this.radiusX = radiusX;
	}

	public int getRadiusY() {
		return radiusY;
	}

	public void setRadiusY(int radiusY) {
		this.radiusY = radiusY;
	}
	
	/* Construtor */
	
	public Figuras() {
		super("Vetor de figuras");
		
		setSize(750, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		message = "";		
		
		/* Mensagens de Rodap� */
		
		JLabel status = new JLabel("Mensagens de evento do mouse");
		add(status, BorderLayout.SOUTH);
		
		
		/* Painel de Desenho */
		
		mousePanel = new Painel();
		add(mousePanel, BorderLayout.CENTER);
		mousePanel.startLista();
		
		mousePanel.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				/* Informa��es do ponto */
				if(mousePanel.getOpcao() == 3){
					mousePanel.setPoint(arg0.getX(), arg0.getY());
				
					mousePanel.repaint();	
					
					message = String.format("Ponto na posi��o [%d; %d]", arg0.getX(), arg0.getY());
					status.setText(message);
				}
				
				/* Informa��es do triangulo */
				if(mousePanel.getOpcao() == 6){
					if (cliquesTriangulo == 3){
						pontoAX = arg0.getX();
						pontoAY = arg0.getY();
						
						mousePanel.setPontoAX(pontoAX);
						mousePanel.setPontoAY(pontoAY);
						
						message = String.format("Ponto A: [%d; %d]", arg0.getX(), arg0.getY());
						status.setText(message);
						
						cliquesTriangulo = 2;
					}
					
					else if (cliquesTriangulo == 2){
						pontoBX = arg0.getX();
						pontoBY = arg0.getY();
						
						mousePanel.setPontoBX(pontoBX);
						mousePanel.setPontoBY(pontoBY);
																	
						message = message + " - " + String.format("Ponto B: [%d; %d]", arg0.getX(), arg0.getY());
						status.setText(message);
						
						cliquesTriangulo = 1;
					}
					
					else if (cliquesTriangulo == 1){
						pontoCX = arg0.getX();
						pontoCY = arg0.getY();
						
						message = message + " - " + String.format("Ponto C: [%d; %d]", arg0.getX(), arg0.getY());
						status.setText(message);
						
						mousePanel.setPontoCX(pontoCX);
						mousePanel.setPontoCY(pontoCY);
											
						mousePanel.repaint();
						
						cliquesTriangulo = 3;
					}
					
			
				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				originX = arg0.getX();
				originY = arg0.getY();
				
				mousePanel.setOriginX(originX);
				mousePanel.setOriginY(originY);
				origin = String.format("Origem: [%d; %d]", originX, originY);
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				
			}
			
			
		});
		
		mousePanel.addMouseMotionListener(new MouseMotionListener(){

			@Override
			public void mouseDragged(MouseEvent arg0) {
				/* Informa��es do c�rculo */
				if(mousePanel.getOpcao() == 1){
					radiusX = arg0.getX();
					radiusY = arg0.getY();
					
					int x = Math.abs(originX - radiusX);
					int y = Math.abs(originY - radiusY);
					
					r = Math.sqrt((x*x) + (y*y));
			
					double area = Math.PI * r * r;
							
					double circ = Math.PI * 2 * r;
					
					mousePanel.setRadiusX(radiusX);
					mousePanel.setRadiusY(radiusY);
					mousePanel.setRadius((int) Math.abs(r));
					
					mousePanel.repaint();					
										
					message = origin + " - " + String.format("Raio: [%d; %d][%.2f]", radiusX, radiusY, r)  + " - " + 
							String.format("Area: [%.2f]", area) + " - " + String.format("Circunferencia: [%.2f]", circ);
					
					status.setText(message);
				}
				
				/* Informa��es do ret�ngulo */
				if(mousePanel.getOpcao() == 2){
					radiusX = arg0.getX();
					radiusY = arg0.getY();
					
					int supX, supY, infX, infY;
					
					supX = Math.min(originX, radiusX);
					supY = Math.min(originY, radiusY);
					infX = Math.max(originX, radiusX);
					infY = Math.max(originY, radiusY);
					
					mousePanel.setRadiusX(radiusX);
					mousePanel.setRadiusY(radiusY);
					
					//mousePanel.repaint();
					
					int area = (infX - supX) * (infY - supY);
					
					int perim = ((infX - supX) * 2) + ((infY - supY) * 2);  
				
					message = String.format("Pontos: Sup Esq: [%d; %d] / Inf Dir: [%d; %d]", supX, supY, infX, infY) + " - " +
							String.format("Area: [%d]", area) + " - " + String.format("Perimetro: [%d]", perim);
				}
				
				/* Informa��es da linha */
				if(mousePanel.getOpcao() == 4){
					radiusX = arg0.getX();
					radiusY = arg0.getY();
					
					mousePanel.setRadiusX(radiusX);
					mousePanel.setRadiusY(radiusY);
					
					//mousePanel.repaint();	
					
					message = origin + " - " + String.format("Fim: [%d; %d]", radiusX, radiusY);
					
					status.setText(message);
				}
				
				/* Informa��es do quadrado */
				if(mousePanel.getOpcao() == 5){
					radiusX = arg0.getX();
					radiusY = arg0.getY();
					
					int supX, supY, infX, infY;
					
					supX = Math.min(originX, radiusX);
					supY = Math.min(originY, radiusY);
					infX = Math.max(originX, radiusX);
					infY = Math.max(originY, radiusY);
					
					mousePanel.setRadiusX(radiusX);
					mousePanel.setRadiusY(radiusY);
					
					//mousePanel.repaint();
					
					int area = (infX - supX) * (infY - supY);
					
					int perim = ((infX - supX) * 2) + ((infY - supY) * 2);  
				
					message = String.format("Pontos: Sup Esq: [%d; %d] / Inf Dir: [%d; %d]", supX, supY, infX, infY) + " - " +
							String.format("Area: [%d]", area) + " - " + String.format("Perimetro: [%d]", perim);
				}
				
				
			}

			@Override
			public void mouseMoved(MouseEvent arg0) {
				String moved = String.format("Mouse na posi��o [%d; %d]", arg0.getX(), arg0.getY());
				
				if (message.length() > 1)
					moved = moved + " - " + message;
				
				status.setText(moved);
				
			}
			
		});
		
		/* Menu Settings */
		
		JMenuBar menu = new JMenuBar();
		add(menu, BorderLayout.NORTH);
		
		JMenu desenhos = new JMenu("Desenhos");
		menu.add(desenhos);
		
		JMenuItem circulo = new JMenuItem("Circulo");
		desenhos.add(circulo);
		
		JMenuItem retangulo = new JMenuItem("Retangulo");
		desenhos.add(retangulo);
		
		JMenuItem quadrado = new JMenuItem("Quadrado");
		desenhos.add(quadrado);
		
		JMenuItem ponto = new JMenuItem("Ponto");
		desenhos.add(ponto);
		
		JMenuItem linha = new JMenuItem("Linha");
		desenhos.add(linha);
		
		JMenuItem triangulo = new JMenuItem("Triangulo");
		desenhos.add(triangulo);	
		
		circulo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mousePanel.setOpcao(1);
				
			}
			
		});
		
		retangulo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mousePanel.setOpcao(2);
				
			}
			
		});
		
		ponto.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mousePanel.setOpcao(3);
				
			}
			
			
		});

		linha.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mousePanel.setOpcao(4);
				
			}
			
			
		});

		quadrado.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mousePanel.setOpcao(5);
				
			}
			
			
		});
		
		triangulo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mousePanel.setOpcao(6);
			}
			
			
		});
		
		setVisible(true);
	}
	
	
}

class Painel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private int pointX, pointY;
	private int originX, originY, radiusX, radiusY, radius;
	private int pontoAX, pontoAY, pontoBX, pontoBY, pontoCX, pontoCY;
	private int opcao;
	
	private ListaEncadeada<Figura> f;
	
	/* Getters and Setters */
	

	public int getPontoAX() {
		return pontoAX;
	}

	public void startLista() {
		f = new ListaEncadeada<Figura>();		
	}

	public void setPontoAX(int pontoAX) {
		this.pontoAX = pontoAX;
	}

	public int getPontoAY() {
		return pontoAY;
	}

	public void setPontoAY(int pontoAY) {
		this.pontoAY = pontoAY;
	}

	public int getPontoBX() {
		return pontoBX;
	}

	public void setPontoBX(int pontoBX) {
		this.pontoBX = pontoBX;
	}

	public int getPontoBY() {
		return pontoBY;
	}

	public void setPontoBY(int pontoBY) {
		this.pontoBY = pontoBY;
	}

	public int getPontoCX() {
		return pontoCX;
	}

	public void setPontoCX(int pontoCX) {
		this.pontoCX = pontoCX;
	}

	public int getPontoCY() {
		return pontoCY;
	}

	public void setPontoCY(int pontoCY) {
		this.pontoCY = pontoCY;
	}
	
	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public void setPoint(int pointX, int pointY){
		this.pointX = pointX;
		this.pointY = pointY;
	}

	public int getPointX() {
		return pointX;
	}

	public void setPointX(int pointX) {
		this.pointX = pointX;
	}

	public int getPointY() {
		return pointY;
	}

	public void setPointY(int pointY) {
		this.pointY = pointY;
	}

	public int getOriginX() {
		return originX;
	}

	public void setOriginX(int originX) {
		this.originX = originX;
	}

	public int getOriginY() {
		return originY;
	}

	public void setOriginY(int originY) {
		this.originY = originY;
	}

	public int getRadiusX() {
		return radiusX;
	}

	public void setRadiusX(int radiusX) {
		this.radiusX = radiusX;
	}

	public int getRadiusY() {
		return radiusY;
	}

	public void setRadiusY(int radiusY) {
		this.radiusY = radiusY;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	

	/* M�todo paint */
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		
		f.inserir(new Figura(), 0);
		
		switch(opcao){
			/* C�rculo */
			case 1:{
				int x = originX - radius;
				int y = originY - radius;
				
				f.inserir(new Figura(new Ponto2D(x, y), new Ponto2D(radius*2, radius*2), 1), 500);
				break;
			}
			/* Ret�ngulo */
			case 2:{				
				if (originX < radiusX){
					if (originY < radiusY) {
						f.inserir(new Figura(new Ponto2D(originX, originY), 
								new Ponto2D(radiusX-originX, radiusY-originY), 2), 500);					
					}
					
					else {
						f.inserir(new Figura(new Ponto2D(originX, radiusY), 
								new Ponto2D(radiusX-originX, originY-radius), 2), 500);
					}
		
				}
				
				else {
					if (originY < radiusY) {
						f.inserir(new Figura(new Ponto2D(radiusX, originY), 
								new Ponto2D(originX-radiusX, radiusY-originY), 2), 500);
					}
					
					else {
						f.inserir(new Figura(new Ponto2D(radiusX, radiusY), 
								new Ponto2D(originX-radiusX, originY-radiusY), 2), 500);
					}
				}
				
				break;
			}
			/* Ponto */
			case 3:{
				f.inserir(new Figura(new Ponto2D(pointX-1, pointY-1), 
						new Ponto2D(3, 3), 3), 500);
				
				break;
			}
			/* Linha */
			case 4:{
				f.inserir(new Figura(new Ponto2D(originX, originY), 
						new Ponto2D(radiusX, radiusY), 4), 500);
				
				break;
			}
			/* Quadrado */
			case 5:{
				
				break;
			}
			/* Triangulo */
			case 6:{
				f.inserir(new Figura(new Ponto2D(pontoAX, pontoAY), 
						new Ponto2D(pontoBX, pontoBY), 4), 500);
				
				f.inserir(new Figura(new Ponto2D(pontoBX, pontoBY), 
						new Ponto2D(pontoCX, pontoCY), 4), 500);
				
				f.inserir(new Figura(new Ponto2D(pontoCX, pontoCY), 
						new Ponto2D(pontoAX, pontoAY), 4), 500);
				
				break;
			}
		}
		
		for(Figura p:f) {
			Figura i = p;
			
			/* 1 = Circulo */
			if (i.getTipo() == 1)
				g.drawOval(i.getOrigem().getX(), i.getOrigem().getY(), i.getFim().getX(), i.getFim().getY());
			
			/* 2 = Retangulo */
			else if (i.getTipo() == 2)
				g.drawRect(i.getOrigem().getX(), i.getOrigem().getY(), i.getFim().getX(), i.getFim().getY());
			
			/* 3 = Ponto */
			else if (i.getTipo() == 3)
				g.fillOval(i.getOrigem().getX(), i.getOrigem().getY(), i.getFim().getX(), i.getFim().getY());
			
			/* 4 = Linha */
			else if (i.getTipo() == 4)
				g.drawLine(i.getOrigem().getX(), i.getOrigem().getY(), i.getFim().getX(), i.getFim().getY());
			
			/* 0 = Vazio */
			else
				break;
							
		}

	
		
		
	}
}

class Figura {
	private Ponto2D origem;
	private Ponto2D fim;
	private int tipo;
	
	public Ponto2D getOrigem() {
		return origem;
	}
	
	public void setOrigem(Ponto2D origem) {
		this.origem = origem;
	}
	
	public Ponto2D getFim() {
		return fim;
	}
	
	public void setFim(Ponto2D fim) {
		this.fim = fim;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	Figura(){
		origem = new Ponto2D();
		fim = new Ponto2D();
		tipo = 0;		
	}
	
	Figura(Ponto2D origem, Ponto2D fim, int tipo){
		this.origem = origem;
		this.fim = fim;
		this.tipo = tipo;		
	}
}