package multiThreading_topic;

public class MultiThread extends Thread {

	public static void main(String[] args) throws InterruptedException {

		MultiThread obj = new MultiThread();
		obj.start();

		for (int i = 0; i <= 100; i++)
			System.out.println("i=" + i);
		Thread.sleep(1000); 
//sleep method pause the execution of the current thread for the specific duration of time and after the duration time is over,
		// the thread which was executing earlier starts to execute again.

	}

	public void run() {
		for (int j = 0; j <= 100; j++)
			System.out.println("j=" + j);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Child thread is exiting..");
		}
		;
	}

}
