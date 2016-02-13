package com.lee.spi_16.airplanegame;

public class Bomb extends AbstractAirPlant {
	int Life = 9;
	boolean isLive = true;
	// 构造函数 定义坐标(x,y)
	public Bomb(int x, int y) {
		this.pointX = x;
		this.pointY = y;
	}
	
	public void lifeDown(){
		if(Life > 0){
			Life--;
		}else{
			this.isLive = false;
		}
	}
}
