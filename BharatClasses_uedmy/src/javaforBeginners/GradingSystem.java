package javaforBeginners;

import java.util.*;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks scored in maths");
		float maths = sc.nextFloat();
		System.out.println("Enter the marks scored in phy");
		float phy = sc.nextFloat();
		System.out.println("Enter the marks scored in chem");
		float chem = sc.nextFloat();

		if (maths < 35 || phy < 35 || chem < 35) {
			System.out.println("Result is failed");
		} else {
			float avg = (maths + phy + chem) / 3;
			System.out.println("Average: " +avg);
			if (avg <= 59) {
				System.out.println("grade=C");
			} else if (avg <= 69) {
				System.out.println("grade=B");
			} else if (avg <= 100) {
				System.out.println("grade=A");
			}
		}

	}

}
