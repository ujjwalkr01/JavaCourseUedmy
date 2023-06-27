package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling_eg1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter two integers:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("Result: " + c);
		} catch (ArithmeticException e) {
			System.out.println("Please don't enter 0");
		} // In place of arithmeticException we can also use runtimeException as it is a
			// parent class of all the exception...
		finally {
			System.out.println("Finally block...");
		}
		System.out.println("More code to go....");
	}

}
