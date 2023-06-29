package org.sp.app0629.event;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowListener implements WindowListener{

	//모든 리스너가 보유한 추상메서드는, 해당 이벤트 발생시 시스템에 의해 자동호출
	
	//프레임이 열릴 때(등장할 때)
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened 호출");
	}

	//프레임이 닫힐 때(사라질 때)
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing 호출");
	}

	//프레임이 완전히 사라진 후
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed 호출");
	}

	//윈도우가 상태표시줄로 작아질 때. 아이콘화 될 때(최소화 될 때)
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified 호출");
	}

	//윈도우가 상태표시줄에서 다시 복원될 때
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconfied 호출");
	}

	//윈도우가 활성화될 때(포커스가 올라올 때)
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated 호출");
	}

	//윈도우가 비활성화될 때(포커스를 잃어버릴 때)
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated 호출");
	}

}
