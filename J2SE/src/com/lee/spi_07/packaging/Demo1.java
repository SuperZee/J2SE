package com.lee.spi_07.packaging;

/*
 * 封装是OOP一大重要的特性
 * 自己的成员变量，不能随便让别人访问，
 * 需要对这种访问进行控制
 * 使用private修饰 不论是成员变量还是一些方法
 * 
 */
public class Demo1 {
	public static void main(String[] args) {
		Clerk c1 = new Clerk();
		c1.name = "小明";
		//c1.age = 19; 已经不能被访问了
		c1.setSalary(5000.0);
		System.out.println(c1.getSalary());
	}
}

class Clerk {
	public String name; // 名字可被访问
	private int age; // 年龄不能被访问
	private double salary;
	/*
	 * 但是有些成员还是需要被特定的人访问的
	 * 所以必要的属性需要提供getter setter方法
	 * 
	 */
	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary){
		this.salary =salary;
	}
}