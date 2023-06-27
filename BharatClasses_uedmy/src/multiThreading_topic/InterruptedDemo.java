package multiThreading_topic;

class MyThread1 extends Thread{
	
	public void run() {
		
		try {
			for(int i=0;i<10;i++) {
				System.out.println("I am lazy thread.."+i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
			System.out.println("Got Interrupted!!!");
		}
	}
}

public class InterruptedDemo {

	public static void main(String[] args) {

		MyThread1 obj=new MyThread1();
		obj.start();
		
		obj.interrupt(); //If any thread is in waiting/sleeping for a state then using the interrupt(), 
		                 //we can interrupt the execution of that thread by showing the Interrupted Exception...  
		
		System.out.println("End of the program...");
	}

}
