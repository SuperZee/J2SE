package com.lee.spi_16.airplanegame;

import java.awt.Color;

public class EnemyAirPlant extends AbstractAirPlant implements InterfaceAirPlant, Runnable {

	boolean isLive = true;

	@Override
	public void shoot() {

	}

	public EnemyAirPlant(int x, int y) {
		this.pointX = x;
		this.pointY = y;
		this.color = Color.RED;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
			int random = (int) (Math.random() * 2);
			if (random < 1) {
				System.out.println("this.pointX--");
				for (int i = 0; i < 5; i++) {
					this.pointX--;
				}
			} else {
				for (int i = 0; i < 5; i++) {
					this.pointX++;
				}
			}
			// �жϷɻ��Ƿ�����
			if (this.isLive == false) {
				// �÷ɻ��������˳��߳�
				break;
			}

		}
	}

}
