Static Methods



package com.bini.babu;

public class JavaStaticMethods {

	public static void main(String[] args) {
	 System.out.println("Inside Main");
         JavaStaticMethods.method1();
	}

	static void method1() {
		System.out.println("Inside Method 1");
	}
}



method1 is the function name of type void hence doesn't return anything and the method is static. Simply writing static method (i.e static void method1() {System.out.println("Inside Method 1");}) will not invoke the start method we need to call the method1 in main function. Invoking static method is done by this command 'JavaStaticMethods.method1();'. The output will be as follows

Inside Main
Inside Method 1


static methods can also be called in static blocks.(like as below)



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



Output

Inside the static block
Inside Method 1
Inside Main
Inside Method 1
