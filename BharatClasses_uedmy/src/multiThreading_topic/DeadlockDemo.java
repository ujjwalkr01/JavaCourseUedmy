package multiThreading_topic;

class FirstResource {

	public synchronized void method1(SecondResource sr) {
		System.out.println("Inside the method1 of FR");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking the method of SR");
		sr.method2();
	}

	public synchronized void method2() {
		System.out.println("Inside the method2 of FR");
	}
}

class SecondResource {

	public synchronized void method1(FirstResource fr) {
		System.out.println("Inside the method1 of SR");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking the method of FR");
		fr.method2();
	}

	public synchronized void method2() {
		System.out.println("Inside the method2 of SR");
	}
}

public class DeadlockDemo implements Runnable {

	FirstResource fr = new FirstResource();
	SecondResource sr = new SecondResource();

	public DeadlockDemo() {
		new Thread(this).start();
		sr.method1(fr);
	}

	public static void main(String[] args) {

		new DeadlockDemo();
	}

	@Override
	public void run() {
		fr.method1(sr);
	}

}
