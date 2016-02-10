package com.lee.spi_06.this_classmethod;

public class InheritDemo {
	public static void main(String[] args) {
		Dog d = new Dog(2, "旺财");
		System.out.println(d);
	}
}

class Animal {
	int age;
}
/*
 * 狗类共享了Animal类的age成员变量
 */
class Dog extends Animal {
	String name;

	public Dog() {
	}

	public Dog(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [age =" + age + ", name=" + name + "]";
	}

}
