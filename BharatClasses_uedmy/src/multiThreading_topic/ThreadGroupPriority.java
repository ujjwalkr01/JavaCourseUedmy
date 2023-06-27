package multiThreading_topic;

public class ThreadGroupPriority {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		ThreadGroup parent = new ThreadGroup("Parent");
		System.out.println(parent.getName());

		ThreadGroup child = new ThreadGroup(parent, "child");
		System.out.println(child.getName());
		System.out.println(child.getParent().getName());

		child.setMaxPriority(4);
		Thread thread1 = new Thread(child, "thread1");
		Thread thread2 = new Thread(child, "thread2");
		System.out.println(thread1.getThreadGroup().getName());
		System.out.println(thread1.getPriority());

		child.setMaxPriority(5); //whenever we want to set the thread Group level priority we have to set before creating the thread class
		                        //otherwise JVM will set the default priority...
		Thread thread3 = new Thread(child, "thread3");
		System.out.println(thread3.getPriority());

	}

}
