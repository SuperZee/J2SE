package com.lee.spi_16.airplanegame;

import java.awt.Color;

/**
 * ��һ���ɻ���ս����Ϸ. ��Ϸ�ܼ�,��һ���ɻ��������������ƶ�
 * ���Է����ӵ�  �ط��ķɻ����Ϸ����� ������� Ȼ��̶������ӵ� 
 * �ӵ��ķ�������ֱ����.
 * ����ʱ������� �ӵ��ٶȻ�Խ��Խ��,�ӵ����ܶ�Ҳ������,
 * 
 * ����ͳ�ƹ���: ����һ���ط��ɻ� �÷�xxx��
 * һ���������ͬʱ��
 */
import javax.swing.JFrame;

public class Main extends JFrame {
	// �����
	MainPanel mp = null;
	public static void main(String[] args) {
		Main m = new Main();

	}

	public Main() {
		// ���������
		mp = new MainPanel();
		// ����mp�߳�
		Thread t = new Thread(mp);
		t.start();
		this.add(mp);
		// ����ע�����
		this.addKeyListener(mp);
		
		this.setSize(300, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}