package com.mario.jeu;

import javax.swing.JFrame;

public class Main {

	public static Scene scene;
	
	public static void main(String[] args) {
		
		JFrame fen = new JFrame();
		fen.setTitle("Jeu Mario");
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setSize(880, 520);
		fen.setLocationRelativeTo(null);
		fen.setResizable(false);
		fen.setAlwaysOnTop(true);
		
		scene = new Scene();
		fen.setContentPane(scene);
		fen.setVisible(true);

	}

}
