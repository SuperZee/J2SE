package com.lee.spi_07.packaging;

/*
 * ��װ��OOPһ����Ҫ������
 * �Լ��ĳ�Ա��������������ñ��˷��ʣ�
 * ��Ҫ�����ַ��ʽ��п���
 * ʹ��private���� �����ǳ�Ա��������һЩ����
 * 
 */
public class Demo1 {
	public static void main(String[] args) {
		Clerk c1 = new Clerk();
		c1.name = "С��";
		//c1.age = 19; �Ѿ����ܱ�������
		c1.setSalary(5000.0);
		System.out.println(c1.getSalary());
	}
}

class Clerk {
	public String name; // ���ֿɱ�����
	private int age; // ���䲻�ܱ�����
	private double salary;
	/*
	 * ������Щ��Ա������Ҫ���ض����˷��ʵ�
	 * ���Ա�Ҫ��������Ҫ�ṩgetter setter����
	 * 
	 */
	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary){
		this.salary =salary;
	}
}