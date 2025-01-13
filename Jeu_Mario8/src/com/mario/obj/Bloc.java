package com.mario.obj;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bloc extends Objet{

	private Image ImgBloc;
	private ImageIcon IcoBloc;
	
	
	public Bloc(int x, int y) {
		
		super(x, y, 48, 196);
		this.IcoBloc = new ImageIcon(getClass().getResource("/images/miniMur.png"));
		this.ImgBloc = this.IcoBloc.getImage();
	}

	//Getters
	public Image getImgBloc() {return ImgBloc;}
	
	//Methodes

}
