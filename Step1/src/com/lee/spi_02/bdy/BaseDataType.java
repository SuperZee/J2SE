package com.lee.spi_02.bdy;

public class BaseDataType {
	public static void main(String[] args) {
		int a = 7;  // 4字节
		// 第二种定义方式
		Integer aa = new Integer(7); 
		//Integer aa = 7 // 自动装拆箱
		System.out.println("---基本数据类型所占字节---");
		System.out.println("Integer: " + Integer.SIZE / 8 + "bytes");
		System.out.println("Double: " + Double.SIZE / 8 + "bytes");
		System.out.println("Character: " + Character.BYTES + "bytes");
		System.out.println("Long: " + Long.BYTES + "bytes");
		System.out.println("---基本数据类型的范围---");
		System.out.println("Integer: " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		// String类型int类型相互转换
		System.out.println("---String类型int类型相互转换---");
		System.out.println(aa.toString());
		System.out.println(Integer.parseInt("7"));
		// 自动提升
		System.out.println("---自动提升类型---");
		System.out.println("a:7 + 3.0 = " + (a + 3.0));
		System.out.println("---丢失精度---");
		System.out.println("a:7 + 3.5 = " + (int) (a + 3.5));
	}
}
