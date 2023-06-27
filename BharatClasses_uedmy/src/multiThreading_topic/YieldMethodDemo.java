package multiThreading_topic;

class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child class..");
			Thread.yield();
// yield() basically means that the thread is not doing anything particularly important and 
//if any other threads or processes need to be run, they should run. Otherwise, the current thread will continue to run.			
		}
	}
}

public class YieldMethodDemo {

	public static void main(String[] args) {

		MyThread obj = new MyThread();
		obj.start();

		for (int i = 0; i < 10; i++)
			System.out.println("Main class..");
	}

}
