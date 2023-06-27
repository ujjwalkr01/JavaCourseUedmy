package multiThreading_topic;

class CustomThread extends Thread {

	public CustomThread(ThreadGroup g, String name) {
		super(g, name);
	}

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class ThreadGroupMethods {

	public static void main(String[] args) throws InterruptedException {

		ThreadGroup obj = new ThreadGroup("MyThreadGroup");
		
		CustomThread thread1=new CustomThread(obj,"thread1");
		CustomThread thread2=new CustomThread(obj,"thread2");
		CustomThread thread3=new CustomThread(obj,"thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		//activeCount() will check the count status of the active threads...... 
		System.out.println("No of threads active are "+obj.activeCount());
		obj.list();
		//list() displays the list of active thread without using the print function.....
		
		Thread.sleep(5000);
		System.out.println("No thread is active all are in sleep mode so active thread will be "+obj.activeCount());
		obj.list();
	}

}
