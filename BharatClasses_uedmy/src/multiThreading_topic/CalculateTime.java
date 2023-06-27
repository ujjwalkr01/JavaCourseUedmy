
package multiThreading_topic;

import java.util.Scanner;

public class CalculateTime {

	static int n, sum = 0;

	public static void main(String[] args) {

		Long start = System.currentTimeMillis(); // To calculate the time of the program we use the currentTimeMillis();

		System.out.println("Sum of the first 'N' number");
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		JoinDemo.n = sc.nextInt();

		JoinDemo obj = new JoinDemo();
		obj.start();
		try { // join() allows one thread to wait until another thread completes it execution.
			obj.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum of the first " + JoinDemo.n + " number is: " + JoinDemo.sum);

		Long end = System.currentTimeMillis();

		System.out.println("The Total time taken is: " + (end - start) / 1000 + " second");
		// To calculate the time of the program we use the start and end variables and assign the System.currentTimeMillis() in it...
	}

	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
