package multiThreading_topic;

import java.util.Scanner;

public class JoinDemo extends Thread {

	static int n, sum = 0;

	public static void main(String[] args) {

		System.out.println("Sum of the first 'N' number");
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		JoinDemo.n = sc.nextInt();

		JoinDemo obj = new JoinDemo();
		obj.start();
		try {  //join() allows one thread to wait until another thread completes it execution.
			obj.join(); //here obj.join() will be continued till its execution get completed.  
			            //After the complete execution of 'obj' then program will get terminated to next instruction...
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum of the first " + JoinDemo.n + " number is: " + JoinDemo.sum);

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
