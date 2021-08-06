package com.techlab.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AsyncThreadListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//Creates a new thread and runs concurrently across Main Thread!!!
		new Thread() {
			public void run() {
				while(true) {
					System.out.println("(ASync Thread) Entered Infinite Loop Time: "+java.time.LocalTime.now());
				}
			}
		}.start();
	}
}