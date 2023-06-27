package ioStreams;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String s = "Success is the product of daily habits";
		String s1 = "Success, is, the, product, of, daily, habits";

		StringTokenizer st = new StringTokenizer(s); // it allows us to break strings into multiple tokens....
		StringTokenizer st1 = new StringTokenizer(s1, ",", true); // if boolean value is true then it will print the delimiter..but
																 // if false then it will skip the delimiter...

		while (st.hasMoreTokens()) { //it checks whether a line has more than one token..
			System.out.println(st.nextToken()); //it returns the next token in the line..
		}
		System.out.println("---------------------------");
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
	}

}
