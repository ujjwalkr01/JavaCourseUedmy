package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling_eg4 {

	static ExceptionHandling_eg3 a;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			ExceptionHandling_eg4.a.method1();
		} catch (NullPointerException e) {
			System.out.println("please instansiate the class...");
		} // In place of NullPointerException we can also use runtimeException as it is a
			// parent class of all the exception
		finally {
			System.out.println("Finally block...");
		}
		System.out.println("after the code....");
	}

}
