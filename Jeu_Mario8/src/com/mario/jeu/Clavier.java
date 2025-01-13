package com.mario.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
	
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Main.scene.setDx(1);
			
			if(Main.scene.getAbs() == -1) {
				Main.scene.setAbs(0);
				Main.scene.setxFond1(-50);
				Main.scene.setxFond2(830);
			}
			
			Main.scene.mario.setGo(true);
			Main.scene.mario.setToRight(true);
			
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			Main.scene.setDx(-1);
			Main.scene.mario.setGo(true);
			Main.scene.mario.setToRight(false);
		}
		//mario saute
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			Main.scene.mario.setJump(true);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Main.scene.mario.setGo(false);
		
		Main.scene.setDx(0);
	}

}
