package javaforBeginners;

import java.util.*;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			if (i % 10 == 0) {
				continue;
			}
			if (i > 100) {
				break;
			} else {
				System.out.println(i);
			}
		}
	}

}
