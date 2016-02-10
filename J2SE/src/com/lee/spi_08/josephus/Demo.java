package com.lee.spi_08.josephus;

/**
 * 
 * @author SpiColorPendra
 * @version 1.0
 */
/*
 * 一群人围成一个圈，从第一个开始编号1,2,3...n 从第K个人开始数m个号，数到m的时候这个人出列 出列后从这个人后面开始
 * 从1开始再数到m,直到最后一个人出列 求出列的编号系列
 * 
 */
public class Demo {
	public static void main(String[] args) {
		CycLink cycLink = new CycLink();
		cycLink.setLen(5);
		cycLink.setK(2);
		cycLink.setM(2);
		cycLink.createLink();
		cycLink.play();
		//cycLink.show();
	}
}

class Josephus {
	// 编号
	int no;
	Josephus nextJosephus = null;

	public Josephus() {
	}

	// 给这个人编号
	public Josephus(int no) {
		this.no = no;
	}
}

// 环形链表
class CycLink {
	// 第一个小孩的引用
	Josephus firstJosephus = null;
	// 设置一个临时
	Josephus temp = null;
	int len = 0;// 代表一共有多少人

	int k = 0;
	int m = 0;

	// 设置链表大小
	public void setLen(int len) {
		this.len = len;
	}

	// 从第几个人开始数数
	public void setK(int k) {
		this.k = k;
	}

	public void setM(int m) {
		this.m = m;
	}

	// 开始K
	public void play() {
		Josephus temp = this.firstJosephus;
		// 1.找到开始数数的人
		for (int i = 1; i < k; i++) {
			temp = temp.nextJosephus;
		}
		while (this.len != 1) {
			// 2.数m下
			for (int i = 1; i < m; i++) {
				temp = temp.nextJosephus;
			}
			// 找到要出列的前一个人
			Josephus temp2 = temp;
			while (temp.nextJosephus != temp2) {
				temp2 = temp2.nextJosephus;
			}
			// 3.将数到m的人从队列删除
			temp2.nextJosephus = temp.nextJosephus;
			// 4.将temp指向下一个数数的人
			temp = temp.nextJosephus;
		}
		// 最后一个小孩
		System.out.println("最后一个小孩 " + temp.no);
	}

	// 初始化环形链表
	public void createLink() {
		for (int i = 1; i <= len; i++) {
			// 创建第一个人
			if (i == 1) {
				Josephus j = new Josephus(i);
				this.firstJosephus = j;
				this.temp = j;
			} else {
				// 创建最后一个人
				if (i == len) {
					Josephus j = new Josephus(i);
					temp.nextJosephus = j;
					temp = j;
					temp.nextJosephus = this.firstJosephus;
				} else {
					Josephus j = new Josephus(i);
					temp.nextJosephus = j;
					temp = j;
				}
			}
		}
	}

	// 打印环形链表
	public void show() {
		Josephus temp = this.firstJosephus;
		do {
			System.out.println(temp.no);
			temp = temp.nextJosephus;
		} while (temp != this.firstJosephus);
	}
}
