package com.mario.persos;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.mario.jeu.Main;
import com.mario.obj.Objet;

public class Personnage {
	
	private int width, height;		//dimensions du personnage
	private int x, y;		//position du personnage
	private boolean toRight;		//vrai si le personnage est tourne vers la droite
	private boolean go;		//le personnage marche ou pas
	public int cpt;		//compteur des pas du personnage
	
	
	public Personnage(int x, int y, int width, int height) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.go = false;
		this.toRight = true;
	}

	//Getters
	public int getWidth() {return width;}
	
	public int getHeight() {return height;}
	
	public int getX() {return x;}
	
	public int getY() {return y;}
	
	public boolean isToRight() {return toRight;}
	
	public boolean isGo() {return go;}
	
	public int getCpt() {return cpt;}


	//Setters
	public void setX(int x) {this.x = x;}
	
	public void setY(int y) {this.y = y;}
	
	public void setToRight(boolean toRight) {this.toRight = toRight;}
	
	public void setGo(boolean go) {this.go = go;}
	
	public void setCpt(int cpt) {this.cpt = cpt;}
	
	//Methodes
	
	public Image marche(String nom, int freq) {
		
		String str;
		ImageIcon Ico;
		Image Img = null;
		
		if(this.go == false || Main.scene.getAbs() <= 0) {
			if(this.toRight == true) {
				str = "/images/" + nom + "Start.png";
			}else {
				str = "/images/" + nom + "Go.png";
			}
		}else {
			this.cpt++;
			if(this.cpt / freq == 0) {
				if(this.toRight == true) {
					str = "/images/" + nom + "Start.png";
				}else {
					str = "/images/" + nom + "Go.png";
				}
			}else {
				if(this.toRight == true) {
					str = "/images/" + nom + "CourtDroite.png";
				}else {
					str = "/images/" + nom + "CourtGauche.png";
				}
			}
			if(this.cpt == 2*freq) {
				this.cpt = 0;
			}
		}
		
		//aaffichage de l'image du personnage
		
		Ico = new ImageIcon(getClass().getResource(str));
		Img = Ico.getImage();
		return Img;
	}
	
	protected boolean contactBefore(Objet obj) {
		
		if(this.x + this.width < obj.getX() || this.x + this.width > obj.getX() || this.y + this.height <= obj.getY() || this.y >= obj.getY() + obj.getHeight()) {
			return false;
		}else {
			return true;
		}
		
	}
	
	protected boolean contactArriere(Objet obj) {
		
		if(this.x > obj.getX() + obj.getWidth() || this.x + this.width < obj.getX()	+ obj.getWidth() || this.y + this.height <= obj.getY() || this.y >= obj.getY() + obj.getHeight()) {
			return false;
		}else {
			return true;
		}
		
	}
	
	protected boolean contactDessous(Objet obj) {
		//detection contact en dessous du perso
		if(this.y + this.height < obj.getY()) {
			return false;
		}else {
			return true;
		}
		
	}
	
	protected boolean contactDessus(Objet obj) {
		//detection contact au dessus du perso
		if(this.x + this.width < obj.getX() + 5 || this.x > obj.getX() + obj.getWidth() - 5 || this.y < obj.getY() + obj.getHeight() || this.y > obj.getY() + obj.getHeight() + 5) {
			return false;
		}else {
			return true;
		}
		
	}
	
	
}
