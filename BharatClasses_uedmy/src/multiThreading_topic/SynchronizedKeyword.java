package multiThreading_topic;

class DisplayMessage {
	public synchronized void sayHello(String name) { //Here if t1 is accessing the sayHello() then till the complete execution of t1, t2 have to be in waiting state.
		try {                                        //without completing it's execution, t2 can't be executed....
			for (int i = 1; i <= 10; i++)
				System.out.println("How are you " + name);
			 Thread.sleep(3000);   
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyThread2 extends Thread {
	DisplayMessage dm;
	String name;

	public MyThread2(DisplayMessage dm, String name) {
		this.dm = dm;
		this.name = name;
	}

	public void run() {
		dm.sayHello(name);
	}
}

public class SynchronizedKeyword {

	public static void main(String[] args) {

		DisplayMessage dm = new DisplayMessage();

		MyThread2 t1 = new MyThread2(dm, "Ujjwal");
		MyThread2 t2 = new MyThread2(dm, "Mr.Kumar");
		t1.start();
		t2.start();
	}

}
