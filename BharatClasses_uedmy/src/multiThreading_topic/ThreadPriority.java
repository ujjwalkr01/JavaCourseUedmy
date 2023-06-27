package multiThreading_topic;

public class ThreadPriority extends Thread {

	public static void main(String[] args) {

		ThreadPriority obj = new ThreadPriority();
		obj.setPriority(MAX_PRIORITY);
		obj.setName("obj");
		obj.start();
//setPriority() is used to set the priority of the Thread.Like which thread will be executed most of the times. 
		ThreadPriority obj1 = new ThreadPriority();
		obj1.setPriority(MIN_PRIORITY);
		obj1.setName("obj1");
		obj1.start();
	}

	public void run() {
		System.out.println("Thread name is: " + currentThread().getName());
	}

}
