package com.mario.obj;

import com.mario.jeu.Main;

public class Objet {

	private int width, height, x, y;
	
	public Objet(int x, int y, int height, int width) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	//Getters et Setters

	public int getWidth() {return width;}

	public void setWidth(int width) {this.width = width;}

	public int getHeight() {return height;}

	public void setHeight(int height) {this.height = height;}

	public int getX() {return x;}

	public void setX(int x) {this.x = x;}

	public int getY() {return y;}

	public void setY(int y) {this.y = y;}
	
	
	//Methodes
	public void move() {
		if(Main.scene.getAbs() >= 0) {
			this.x = this.x - Main.scene.getDx();
		}
	}
	
}
