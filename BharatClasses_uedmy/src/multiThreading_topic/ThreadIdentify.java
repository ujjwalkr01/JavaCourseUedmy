package multiThreading_topic;

public class ThreadIdentify extends Thread {

	public static void main(String[] args) {

		ThreadIdentify obj = new ThreadIdentify();
		obj.start();

		Thread currentThread = Thread.currentThread(); //It is use to retrieve the current thread....
		System.out.println("Thread name is " + currentThread.getName()); //method to print the name of the Current thread...
	}

	public void run() {
		Thread currentThread = Thread.currentThread();
		currentThread.setName("Thread name is T1"); //method use to set the name of the thread....
		                                       //If we didn't set the name of the thread then JVM will automatically set the default name..... 
		System.out.println("Thread name is " + currentThread.getName());
	}
}
