package com.lee.spi_03.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInput {
	public static void main(String[] args) {
		// ���������Ӽ��̽����û�����
		InputStreamReader isr = new InputStreamReader(System.in);
		// System.in ������׼�������˵��������
		BufferedReader br = new BufferedReader(isr);
		// �ӿ���̨��ȡһ������
		try {
			// ��ȡ��һ����
			System.out.println("�������һ����");
			String s1 = br.readLine();
			// ��ȡ�ڶ�����
			System.out.println("������ڶ�����");
			String s2 = br.readLine();
			// ��Stringת����float
			float f1 = Float.valueOf(s1);
			float f2 = Float.valueOf(s2);
			/* ��չ
			 * Float.parseFloat �� Float.valueOf ��.floatValue() ������ :
			 * Float.parseFloat(String)��ʾ��String�ַ���ת����floatԭʼ���͵ĵ�������ֵ,
			 * ��Float.valueOf(String)�ǰ�String�ַ���ת����float�ķ�װ��Float
			 * ��.floatValue()�������ǰѷ�װ���Floatת����ԭʼ����float. ע�⣺float����ֵ����Float��һ���ࡣ
			 */
			// java.lang.NumberFormatException �������Ĳ��Ǹ�����,�ͻᱨ�������
			if (f1 > f2) {
				System.out.println("������ĵ�һ�����ȵڶ�������");
			} else if (f1 < f2) {
				System.out.println("������ĵ�һ�����ȵڶ�����С");
			} else {
				System.out.println("���������");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// �߼������
		System.out.println("--- �߼������ ---");
		int a = 4;
		if(3 > 2 && 5 > 2){
			System.out.println("3����2 ���� 5Ҳ����2");
		}
		if(a < 2 || 3 > 2 ){
			System.out.println("3����2 ���� 4С��2");
		}
		if( !(3  < 2)){
			System.out.println("�� 3 < 2");
		}
	}
}