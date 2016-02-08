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
			String s1 = br.readLine();
			// ��ȡ�ڶ�����
			String s2 = br.readLine();
			// ��Stringת����float
			float f1 = Float.valueOf(s1);
			float f2 = Float.valueOf(s2);
			/*
			 * ��չFloat.parseFloat �� Float.valueOf ��.floatValue() ������ :
			 * Float.parseFloat(String)��ʾ��String�ַ���ת����floatԭʼ���͵ĵ�������ֵ,
			 * ��Float.valueOf(String)�ǰ�String�ַ���ת����float�ķ�װ��Float
			 * ��.floatValue()�������ǰѷ�װ���Floatת����ԭʼ����float. ע�⣺float����ֵ����Float��һ���ࡣ
			 */
			if (f1 > f2) {
				System.out.println("������ĵ�һ�����ȵڶ�������");
			} else {
				System.out.println("������ĵ�һ�����ȵڶ�����С");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}