package multiThreading_topic;

class DisplayMessage1 {
	public synchronized static void sayHello(String name) { // Here for classLock we have change the method to static synchronized and inside the thread
		  try {                                          // we are invoking it statically...
			for (int i = 1; i <= 10; i++)
				System.out.println("How are you " + name);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyThread3 extends Thread {

	String name;

	public MyThread3(String name) {
		this.name = name;
	}

	public void run() {
		DisplayMessage1.sayHello(name);
	}
}

public class ClassLevelLocking {

	public static void main(String[] args) {

		DisplayMessage1 dm = new DisplayMessage1();

		MyThread3 t1 = new MyThread3("Ujjwal");
		MyThread3 t2 = new MyThread3("Mr.Kumar");
		t1.start();
		t2.start();
	}

}
