package com.lee.spi_16.airplanegame;

import java.awt.Color;

// �����ʵ���� ���ǵķɻ��Ĵ���
public class MasterPlant extends AbstractAirPlant implements InterfaceAirPlant {
	Shot s = null;

	// �����ӵ�
	@Override
	public void shoot() {
		s = new Shot(this.pointX, this.pointY - 10);
		Thread t = new Thread(s);
		t.start();
		

	}

	// ���캯������Ա������ֵ
	public MasterPlant(int x, int y) {
		this.pointX = x;
		this.pointY = y;
		this.color = Color.CYAN;

	}

}