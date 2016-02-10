package com.lee.spi_12.collection;

import java.util.ArrayList;

/*
 * JavaºØ∫œ¿‡
 */
public class Demo {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		array.add("java");
		array.add("collection");
		for (Object object : array) {
			System.out.println(object);
		}
	}
}
