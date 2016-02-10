package com.lee.spi_06.this_classmethod;

public class ThisDemo {
	public static void main(String[] args) {
		Person p = new Person(5,"С��");
		System.out.println(p);
	}

}
/*
 * this ������ ���÷����ĵ�ǰ����  this.age ==  p.age
 */
class Person {
	int age;
	String name;

	// ˽�й��췽�� ,�����಻�ܴ�������
	private Person() {
	}
	// �������ι���ӿ�
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	

}