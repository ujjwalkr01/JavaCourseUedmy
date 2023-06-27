package collectionFramework_Set;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {

		Random obj = new Random(); //It generate the random number 

		int x = obj.nextInt(); //this method will generate random number
		System.out.println("X: " + x);

		int y = obj.nextInt(100); //this method will generate the random number under the limit 100....
		System.out.println("Y: " + y);
	}

}
