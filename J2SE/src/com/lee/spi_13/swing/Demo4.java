package com.lee.spi_13.swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 网格布局 GuideLayout
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
			// 创建组件
			jbs[i] = new JButton(String.valueOf(i));
			// 添加组件
			this.add(jbs[i]);
		}
		// 设置网络布局 3行3列
		this.setLayout(new GridLayout(3, 3, 10, 10));
		// init
		this.setTitle("学习布局管理器");
		this.setBounds(600, 400, 200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
