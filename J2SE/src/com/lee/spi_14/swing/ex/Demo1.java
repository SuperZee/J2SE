package com.lee.spi_14.swing.ex;

import java.awt.BorderLayout;

import javax.swing.*;

public class Demo1 extends JFrame {
	JSplitPane jsp;
	JList jList;
	JLabel jl1;

	public static void main(String[] args) {
		Demo1 d = new Demo1();
	}

	public Demo1() {
		String[] words = { "aaa", "bcd", "oop", "java" };
		jList = new JList(words);
		jl1 = new JLabel(new ImageIcon());

		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jList, jl1);
		// ����jsp��������
		jsp.setOneTouchExpandable(true);
		
		
		this.setLayout(new BorderLayout());
		this.add(jsp);
		this.setBounds(600, 400, 400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
