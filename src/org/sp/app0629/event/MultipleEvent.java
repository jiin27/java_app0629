package org.sp.app0629.event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MultipleEvent extends JFrame{
	
	JButton bt;
	JTextField t;
	JComboBox com;
	
	public MultipleEvent() {
		bt = new JButton("나 버튼");
		t = new JTextField(25);
		com = new JComboBox();
		
		setLayout(new FlowLayout()); //레이아웃 변경
		
		//콤보박스에 아이템 추가
		com.addItem("사과");
		com.addItem("딸기");
		com.addItem("키위");
		com.addItem("복숭아");
		com.addItem("수박");
		
		add(bt);
		add(t);
		add(com);
		
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//버튼과 리스너 연결
		bt.addActionListener(new MyButtonListener());
		
		//텍스트필드와 리스너 연결
		t.addKeyListener(new MyInputListener());
		
		//콤보박스와 리스너 연결
		com.addItemListener(new MyChangeListener());
		
		//윈도우와 리스너 연결
		addWindowListener(new MyWindowListener()); //윈도우가 JFrame. 곧 나.
		
	}
	
	public static void main(String[] args) {
		new MultipleEvent();
	}
}
