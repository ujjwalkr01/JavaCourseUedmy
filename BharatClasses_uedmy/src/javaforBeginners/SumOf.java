package javaforBeginners;

import java.util.*;
import static java.lang.Integer.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class SumOf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers"); //due to static import of system we are not using System.out
//		int num1 = parseInt(sc.next());          //due to static import we are not using the Integer class...
		                                   //if we are not using static import then we have to write Integer.parseInt()......
		int num2 = parseInt(sc.next());
		double result = sqrt(num2);
//		System.out.println("sum is " + result);
		out.println("Square root of the number is:"+result);
		
	}

}
