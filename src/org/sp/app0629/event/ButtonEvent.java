package org.sp.app0629.event;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonEvent extends JFrame{
	JButton bt;
	JTextField t;
	
	public ButtonEvent() {
		bt = new JButton("나 Button");
		t = new JTextField(25); // 최초 생성자 15자 크기를 확보한다. 15자만 허용X
		
		//레이아웃 변경
		this.setLayout(new FlowLayout());
		
		//버튼 부착
		add(bt);
		add(t);
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 인스턴스 heap영역에서 원본 클래스 소속인 JFrame 접근가능. 따라서 생략가능
		
		// 버튼과 이벤트 감지자인 Listener를 연결하자
		// MyListener m= new MyListener(); 변수로 받은 뒤 addActionListener에 변수를 넣어도 됨.
		bt.addActionListener(new MyListener()); //버튼과 리스너와의 연결
		
		// 텍스트필드와 리스너와의 연결
		t.addKeyListener(new MyKeyListener());
		
	}
	
	public static void main(String[] args) {
		new ButtonEvent();
	}
}
