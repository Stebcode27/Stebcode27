package com.mario.jeu;

public class Chrono implements Runnable{

	private final short PAUSE = 3;  //temps d'atente entre deux tours de boucle
	
	@Override
	public void run() {
		
		while(true) {
			
			Main.scene.repaint();
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {}
		}
	}

}
