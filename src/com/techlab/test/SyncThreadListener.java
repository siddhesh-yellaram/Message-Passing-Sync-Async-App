package com.techlab.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SyncThreadListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//Runs on Main Thread!!!
		while(true) {
			System.out.println("(Sync Thread) Entered Infinite Loop Time: "+java.time.LocalTime.now());
		}
	}
}
