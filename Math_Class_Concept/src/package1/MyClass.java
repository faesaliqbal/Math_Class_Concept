package package1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * The JDK defines a number of useful classes.
		 * One of these useful classes is the Math class.
		 * It provides predefined methods for mathematical operations.
		 * You do not need to create an object of Math class to use it.
		 * To access it, just type Math. and the corresponding method.
		 */
		
		int a = Math.abs(10); //returns absolute value of its parameter
		int b = Math.abs(-20); // will return 20
		double c = Math.ceil(7.342); //rounds a floating point value up to the nearest integer value. Rounded value is returned as a double. 8.0
		double d = Math.floor(7.343); //rounds a floating point value down to the nearest integer value. 7.0
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		/*
		 * many more methods are also available e.g. Math.pow() Math.min() etc
		 */
		
		

	}

}
