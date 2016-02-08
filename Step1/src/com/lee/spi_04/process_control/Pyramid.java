package com.lee.spi_04.process_control;

public class Pyramid {
	// �������Ĳ���
	final static int LAYER = 7;
	public static void main(String[] args) {
		/*
		 * ��ӡһ��������
		 * 		8
		 *     888
		 * 	  88888
		 *   8888888
		 *  888888888
		 * 88888888888
		 *8888888888888
		 * 
		 */
		// ���������� һ��LAYER��
		for (int i = 1; i <= LAYER; i++) {
			// �ڲ��������  һ��LAYER * 2 - 1��
			for (int j = 0; j < LAYER * 2; j++) {
				 if(j < LAYER - i){
					 System.out.print(" ");
				 }else if(j > LAYER - i && j < LAYER + i){
					 System.out.print("8");
				 }else{
					 //System.out.print(" ");
				 }
			}
			System.out.println();
		}
	}
}