package com.bini.babu;

public class JavaStaticMethods {

	public static void main(String[] args) {
		System.out.println("Inside Main");
		JavaStaticMethods.method1();
	}

	static void method1() {
		System.out.println("Inside Method 1");
	}
	
	static {
		System.out.println("Inside the static block");
		JavaStaticMethods.method1();
	}
}
