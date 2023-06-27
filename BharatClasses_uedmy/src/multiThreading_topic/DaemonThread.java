package multiThreading_topic;

class Mythread6 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println(i);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class DaemonThread {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().isDaemon());

		Mythread6 t1 = new Mythread6();
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		t1.start();
//		t1.setDaemon(true);
	}

}
