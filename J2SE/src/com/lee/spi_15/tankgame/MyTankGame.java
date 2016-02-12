package com.lee.spi_15.tankgame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @version 1.0
 * @author SpiColorPendra
 *
 */
public class MyTankGame extends JFrame {
	MyPanel mp = null;

	public static void main(String[] args) {
		MyTankGame my = new MyTankGame();
	}

	public MyTankGame() {
		mp = new MyPanel();
		this.add(mp);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

// �ҵ����
class MyPanel extends JPanel {
	// ����һ���ҵ�tank
	Hero hero = null;

	// ���캯��
	public MyPanel() {
		hero = new Hero(10, 10);
	}

	// ����tank
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 1.������ߵ�j����
		g.fillRect(0, 0, 400, 300);
		this.drawTank(hero.x, hero.y, g, 0, 0);

	}

	// ��װ����tank�ĺ���
	public void drawTank(int x, int y, Graphics g, int direct, int type) {
		switch (type) {
		case 0:
			g.setColor(Color.RED); // ������ɫ
			break;
		case 1:
			g.setColor(Color.BLUE);
		default:
			break;
		}
		// �жϷ���
		switch (direct) {
		case 0:
			g.fill3DRect(x, y, 5, 30, false); // ��һ��jux
			// 2.�����ұߵľ���
			g.fill3DRect(x + 15, y, 5, 30, false);
			// 3.�����м����
			g.fill3DRect(x + 5, y + 5, 10, 20, false);
			// 4.����Բ��
			g.drawOval(x + 5, y + 10, 9, 9);
			// 5.������
			g.drawLine(x + 10, y + 15, x + 10, y);
			break;
		case 1:

		default:
			break;
		}

	}

}

// ̹����
class Tank {
	// ��ʾtank�ĺ�����
	int x = 0;
	// ��ʾtank��������
	int y = 0;

	public Tank(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

class Hero extends Tank {
	public Hero(int x, int y) {
		super(x, y);
	}
}