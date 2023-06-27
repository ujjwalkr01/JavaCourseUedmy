package multiThreading_topic;

class DisplayMessage2 {
	public void sayHello(String name) { //we can pass the reference to the current object using synchronized(this) syntax....
//We can also use class level lock by passing the class name to the synchronized block using synchronized(className.class) syntax[i.e(DisplayMessage2.class)]
//we can pass any object to the synchronized block and the current thread will get a lock to that object..[i.e synchronized(dm)]....
		
		//Any code can go here...
		synchronized (this) {
			try { 
				for (int i = 1; i <= 10; i++)
					System.out.println("How are you " + name);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread4 extends Thread {
	DisplayMessage2 dm;
	String name;

	public MyThread4(DisplayMessage2 dm, String name) {
		this.name = name;
		this.dm = dm;
	}

	public void run() {
		dm.sayHello(name);
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {

		DisplayMessage2 dm = new DisplayMessage2();

		MyThread4 t1 = new MyThread4(dm, "Ujjwal");
		MyThread4 t2 = new MyThread4(dm, "Mr.Kumar");
		t1.start();
		t2.start();
	}

}
