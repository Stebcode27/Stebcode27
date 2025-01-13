package com.mario.jeu;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.mario.obj.Bloc;
import com.mario.obj.Tuyau;
import com.mario.persos.Mario;

@SuppressWarnings("serial")
public class Scene extends JPanel{
	
	//champs
	private ImageIcon IcoFond;
	private Image ImgFond;
	private Image ImgFond1;
	
	private ImageIcon ChateauIco;
	private Image ChateauImg;
	
	private int xFond1;
	private int xFond2;
	private int dx;
	private int abs;
	private int ySol;
	private int hauteurPlafond;
	
	public Mario mario;
	public Tuyau tuyau;
	public Bloc bloc;
	
	public Scene()
	{
		
		super();
		
		this.xFond1 = -50;
		this.xFond2 = 830;
		this.dx = 0;
		this.abs = -1;
		this.ySol = 430;
		this.hauteurPlafond = 0;
		
		IcoFond = new ImageIcon(getClass().getResource("/images/font1.png"));
		this.ImgFond = this.IcoFond.getImage();
		this.ImgFond1 = this.IcoFond.getImage();
		
		ChateauIco = new ImageIcon(getClass().getResource("/images/chateau.png"));
		this.ChateauImg = this.ChateauIco.getImage();
		
		mario = new Mario(270, 379);
		tuyau = new Tuyau(555, 365);
		bloc = new Bloc(800, 250);
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier());
		
		Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();
		
	}

	//Getters
	public int getDx() {return dx;}
	public int getAbs() {return abs;}
	public int getxFond1() {return xFond1;}
	public int getxFond2() {return xFond2;}
	public int getySol() {return ySol;}
	public int getHauteurPlafond() {return hauteurPlafond;}

	//Setters
	public void setDx(int dx) {this.dx = dx;}
	public void setAbs(int abs) {this.abs = abs;}
	public void setxFond1(int xFond1) {this.xFond1 = xFond1;}
	public void setxFond2(int xFond2) {this.xFond2 = xFond2;}
	public void setySol(int ySol) {this.ySol = ySol;}
	public void setHauteurPlafond(int hauteurPlafond) {this.hauteurPlafond = hauteurPlafond;}

	//mathodes
	public void deplacementFond()
	{
		if(this.abs >= 0) {
			this.abs = this.abs + this.dx;
			this.xFond1 = this.xFond1 - this.dx;
			this.xFond2 = this.xFond2 - this.dx;
		}
		
		if(this.xFond1 == -880) {
			this.xFond1 = 880;
		}else if(xFond2 == -880) {
			this.xFond2 = 880;
		}else if(xFond1 == 880) {
			this.xFond1 = -880;
		}else if(xFond2 == 880) {
			this.xFond2 = -880;
		}
	}
	
	public void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		//detection du contact
		this.mario.contact(bloc);
		
		this.deplacementFond();
		this.tuyau.move();
		this.bloc.move();
		
		g2.drawImage(this.ImgFond, this.xFond1, 0, null);  //dessin de l'image de fond
		g2.drawImage(this.ImgFond1, this.xFond2, 0, null);
		g2.drawImage(ChateauImg, 50 - this.abs, 198, null);
		g2.drawImage(this.tuyau.getImgTuyau(), this.tuyau.getX(), this.tuyau.getY(), null);
		g2.drawImage(this.bloc.getImgBloc(), this.bloc.getX(), this.bloc.getY(), null);
		
		if(this.mario.isJump()) {
			g2.drawImage(this.mario.jump(), this.mario.getX(), this.mario.getY(), null);
		}else {
			g2.drawImage(this.mario.marche("mario", 25), this.mario.getX(), this.mario.getY(), null);
		}
		
	}
}
