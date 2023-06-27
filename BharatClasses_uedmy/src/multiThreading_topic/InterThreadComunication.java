package multiThreading_topic;

class MyInterThread extends Thread {

	int total;

	public void run() {
		synchronized (this) {
//After wait method removes the lock the flow of program will come here as we have used synchronized block 
//so this thread will get the lock and completes it execution process and after completing the execution it will call notify()....
			System.out.println("Child thread is calculating the sum..");
			for (int i = 1; i <= 10; i++)
				total += i;

			this.notify(); //after calling the notify() this thread will release the lock and
			               //the flow of program will go back to the main thread and will complete the execution...
		}
	}
}

public class InterThreadComunication {

	public static void main(String[] args) throws InterruptedException {

		MyInterThread obj = new MyInterThread();
		obj.start();
      //here main thread get the lock on the object on the thread here
		synchronized (obj) {
			System.out.println("Main thread is going to wait!!");
			obj.wait(); //but when wait method is invoked this thread will remove the lock and will go to the child thread i.e MyThread5 class and
			 //this thread will be in the waiting state.....until child class invokes notify()...
			//After calling the notify() this thread will again lock the current object and start running after the wait()....
			System.out.println("Main thread is notified...");
			System.out.println(obj.total);
		}

	}

}
