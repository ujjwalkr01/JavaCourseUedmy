package ioStreams;

import java.util.Scanner;

public class HasNextFunctionDemo {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		while (sc.hasNextInt()) {
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("sum of the number is: " + sum);
	}
//hasNext() check for the data types that we have used with it ..if it satisfies that data type then it returns true otherwise false....
}
