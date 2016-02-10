package com.lee.spi_08.josephus;

/**
 * 
 * @author SpiColorPendra
 * @version 1.0
 */
/*
 * һȺ��Χ��һ��Ȧ���ӵ�һ����ʼ���1,2,3...n �ӵ�K���˿�ʼ��m���ţ�����m��ʱ������˳��� ���к������˺��濪ʼ
 * ��1��ʼ������m,ֱ�����һ���˳��� ����еı��ϵ��
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
	// ���
	int no;
	Josephus nextJosephus = null;

	public Josephus() {
	}

	// ������˱��
	public Josephus(int no) {
		this.no = no;
	}
}

// ��������
class CycLink {
	// ��һ��С��������
	Josephus firstJosephus = null;
	// ����һ����ʱ
	Josephus temp = null;
	int len = 0;// ����һ���ж�����

	int k = 0;
	int m = 0;

	// ���������С
	public void setLen(int len) {
		this.len = len;
	}

	// �ӵڼ����˿�ʼ����
	public void setK(int k) {
		this.k = k;
	}

	public void setM(int m) {
		this.m = m;
	}

	// ��ʼK
	public void play() {
		Josephus temp = this.firstJosephus;
		// 1.�ҵ���ʼ��������
		for (int i = 1; i < k; i++) {
			temp = temp.nextJosephus;
		}
		while (this.len != 1) {
			// 2.��m��
			for (int i = 1; i < m; i++) {
				temp = temp.nextJosephus;
			}
			// �ҵ�Ҫ���е�ǰһ����
			Josephus temp2 = temp;
			while (temp.nextJosephus != temp2) {
				temp2 = temp2.nextJosephus;
			}
			// 3.������m���˴Ӷ���ɾ��
			temp2.nextJosephus = temp.nextJosephus;
			// 4.��tempָ����һ����������
			temp = temp.nextJosephus;
		}
		// ���һ��С��
		System.out.println("���һ��С�� " + temp.no);
	}

	// ��ʼ����������
	public void createLink() {
		for (int i = 1; i <= len; i++) {
			// ������һ����
			if (i == 1) {
				Josephus j = new Josephus(i);
				this.firstJosephus = j;
				this.temp = j;
			} else {
				// �������һ����
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

	// ��ӡ��������
	public void show() {
		Josephus temp = this.firstJosephus;
		do {
			System.out.println(temp.no);
			temp = temp.nextJosephus;
		} while (temp != this.firstJosephus);
	}
}
