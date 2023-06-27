package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling_eg2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			String s = sc.next();
			int a = Integer.parseInt(s);
			System.out.println(a);
		} catch (NumberFormatException e) {
			System.out.println("Please enter the valid input...");
		} // In place of NumberFormatException we can also use runtimeException as it is a
			// parent class of all the exception
		finally {
			System.out.println("Finally block...");
		}
		System.out.println("After the code...");
	}

}
