package org.sp.app0629.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyInputListener implements KeyListener{

	public void keyTyped(KeyEvent e) {
		//추상 메서드를 완성은 해야함! 사용하지 않더라도 포함하고 있어야 불완전한 인터페이스를 완성하는 것
	}
	
	public void keyPressed(KeyEvent e) {
		System.out.println("키눌렀어");
	}

	public void keyReleased(KeyEvent e) {
		System.out.println("키눌렀다 뗌");
	}

	
	
}
