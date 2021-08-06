package com.techlab.test;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class FrameMessagePassing extends JFrame{
	public FrameMessagePassing(String title) {
		super(title);
		setSize(700,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(Color.YELLOW);
		
		JButton hellobtn = new JButton("Hello");
		JButton syncbtn = new JButton("Sync");
		JButton asyncbtn = new JButton("Async");
		
		hellobtn.setBounds(50, 100, 100, 50);
		hellobtn.setBackground(Color.GREEN);
		
		syncbtn.setBounds(280,100,100,50);
		syncbtn.setBackground(Color.RED);
		
		asyncbtn.setBounds(520,100,100,50);
		asyncbtn.setBackground(Color.ORANGE);
		
		hellobtn.addActionListener(new HelloActionListener());
		syncbtn.addActionListener(new SyncThreadListener());
		asyncbtn.addActionListener(new AsyncThreadListener());
		
		add(hellobtn);
		add(syncbtn);
		add(asyncbtn);	
	}
}
