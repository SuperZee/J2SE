package com.lee.spi_13.swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * ���񲼾� GuideLayout
 * 
 * @author SpiColorPendra
 *
 */
public class Demo4 extends JFrame {
	JButton jbs[] = new JButton[9];

	public static void main(String[] args) {
		Demo4 d = new Demo4();
	}

	public Demo4() {
		for (int i = 0; i < 9; i++) {
			// �������
			jbs[i] = new JButton(String.valueOf(i));
			// ������
			this.add(jbs[i]);
		}
		// �������粼�� 3��3��
		this.setLayout(new GridLayout(3, 3, 10, 10));
		// init
		this.setTitle("ѧϰ���ֹ�����");
		this.setBounds(600, 400, 200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
