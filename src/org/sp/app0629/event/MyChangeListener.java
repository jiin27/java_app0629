package org.sp.app0629.event;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyChangeListener implements ItemListener{

	public void itemStateChanged(ItemEvent e) {
		System.out.println("아이템 변경했어?");
	}

}
