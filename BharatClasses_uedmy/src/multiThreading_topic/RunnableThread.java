package multiThreading_topic;

public class RunnableThread implements Runnable {

	public static void main(String[] args) {

		RunnableThread obj = new RunnableThread();
  //we use runnable thread most of the time as we can implement as many no of the interface but we can extend only one class..
		Thread t = new Thread(obj);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Using runnable thread...");
	}

}
