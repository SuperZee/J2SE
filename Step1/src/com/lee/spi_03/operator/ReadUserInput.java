package com.lee.spi_03.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInput {
	public static void main(String[] args) {
		// ���������Ӽ��̽����û�����
		InputStreamReader isr = new InputStreamReader(System.in);
		// System.in �����׼�������˵��������
		BufferedReader br = new BufferedReader(isr);
		// �ӿ���̨��ȡһ������
		try {
			String s1 = br.readLine();
			System.out.println(s1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
