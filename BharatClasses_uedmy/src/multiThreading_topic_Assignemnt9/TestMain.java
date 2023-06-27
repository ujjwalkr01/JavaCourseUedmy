package multiThreading_topic_Assignemnt9;

class EvenNumbersThread extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.println("Even number: " + i);
		}
	}
}

class OddNumbersThread extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				System.out.println("Odd number: " + i);
		}
	}

}

public class TestMain {

	public static void main(String[] args) throws InterruptedException {

		EvenNumbersThread t1 = new EvenNumbersThread();
		OddNumbersThread t2 = new OddNumbersThread();
		t1.start();
		t2.start();
          
		Thread.sleep(2000);
		for (int i = 1; i <= 10; i++)
			System.out.println(i);
	}

}
