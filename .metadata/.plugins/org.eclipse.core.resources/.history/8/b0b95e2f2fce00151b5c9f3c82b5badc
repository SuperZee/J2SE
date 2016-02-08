package com.lee.spi_03.operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInput {
	public static void main(String[] args) {
		// 输入流，从键盘接受用户输入
		InputStreamReader isr = new InputStreamReader(System.in);
		// System.in 代表标准输入或者说键盘输入
		BufferedReader br = new BufferedReader(isr);
		// 从控制台读取一行数据
		try {
			String s1 = br.readLine();
			System.out.println(s1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
