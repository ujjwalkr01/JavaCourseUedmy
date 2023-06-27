package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling_eg3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			int arr[] = { 10, 20, 30 };
			for (int i = 0; i <= arr.length; i++)
				System.out.println(arr[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array beyond length....");
		} // In place of ArrayIndexOutOfBoundsException we can also use runtimeException
			// as it is a parent class of all the exception
		finally {
			System.out.println("Finally block...");
		}
		System.out.println("After array out of bond Exception");
	}

	public void method1() {
		System.out.println("Example of null pointer exception..");
	}

}
