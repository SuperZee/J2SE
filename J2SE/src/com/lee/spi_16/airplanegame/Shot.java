package com.lee.spi_16.airplanegame;

public class Shot implements Runnable {
	int x;
	int y;
	// 子弹是否或者
	boolean isLive = true;

	public Shot(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		while (true) {
			try {
				// 子弹跑出边框
				if (y > -4 && this.isLive) {
					y-=2;
					Thread.sleep(15);
					// 启动子弹线程
					System.out.println(this.x + "," + this.y);
				} else {
					this.isLive = false;
					break;
				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
