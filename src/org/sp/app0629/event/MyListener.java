package org.sp.app0629.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 버튼과 같은 컴포넌트에 마우스로 클릭이벤트를 일으키면, 해당 이벤트를 감지할 수 있는 객체인 
 * 리스너를 이용하여 이벤트 처리해보기
 * */
public class MyListener implements ActionListener{
									/* is a */
	
	//ActionListener 가 보유한 추상메서드를 오버라이드하자
	public void actionPerformed(ActionEvent e) {
		//버튼이 눌렸을 때 이 메서드가 호출!!
		System.out.println("버튼 눌렀어?");
	}
}
