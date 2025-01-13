package com.mario.obj;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Tuyau extends Objet{

	private Image ImgTuyau;
	private ImageIcon IcoTuyau;
	
	
	public Tuyau(int x, int y) {
		
		super(x, y, 90, 57);
		this.IcoTuyau = new ImageIcon(getClass().getResource("/images/tuyau.png"));
		this.ImgTuyau = this.IcoTuyau.getImage();
	}

	//Getters
	public Image getImgTuyau() {
		return ImgTuyau;
	}
	
	//Methodes

}
