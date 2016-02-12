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

// 我的面板
class MyPanel extends JPanel {
	// 定义一个我的tank
	Hero hero = null;

	// 构造函数
	public MyPanel() {
		hero = new Hero(10, 10);
	}

	// 绘制tank
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 1.画出左边的j矩形
		g.fillRect(0, 0, 400, 300);
		this.drawTank(hero.x, hero.y, g, 0, 0);

	}

	// 封装画出tank的函数
	public void drawTank(int x, int y, Graphics g, int direct, int type) {
		switch (type) {
		case 0:
			g.setColor(Color.RED); // 设置颜色
			break;
		case 1:
			g.setColor(Color.BLUE);
		default:
			break;
		}
		// 判断方向
		switch (direct) {
		case 0:
			g.fill3DRect(x, y, 5, 30, false); // 第一个jux
			// 2.画出右边的矩形
			g.fill3DRect(x + 15, y, 5, 30, false);
			// 3.画出中间矩形
			g.fill3DRect(x + 5, y + 5, 10, 20, false);
			// 4.画出圆形
			g.drawOval(x + 5, y + 10, 9, 9);
			// 5.画出线
			g.drawLine(x + 10, y + 15, x + 10, y);
			break;
		case 1:

		default:
			break;
		}

	}

}

// 坦克类
class Tank {
	// 表示tank的横坐标
	int x = 0;
	// 表示tank的纵坐标
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
