package com.lee.spi_05.class_object;

public class ObjectDemo2 {
	public static void main(String[] args) {
		// ����Student
		Student s = new Student(5,"С��");
		System.out.println(s.age + "---" + s.name);
	}
}

class Student {
	int age;
	String name;

	public Student() {
	}// �޲ι��췽��

	public Student(int age) {
		this.age = age;
	}
	// ���ι��췽��
	public Student(int age,String name) {
		this.age = age;
		this.name = name;
	}
}