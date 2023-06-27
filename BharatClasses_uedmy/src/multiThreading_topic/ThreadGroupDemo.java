package multiThreading_topic;

public class ThreadGroupDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
//Returns the thread group to which this thread belongs.This method returns null if this thread has died
		ThreadGroup parent = new ThreadGroup("Parent");
		System.out.println(parent.getName());

		ThreadGroup child = new ThreadGroup(parent, "child");
		System.out.println(child.getName());
		System.out.println(child.getParent().getName());

	}

}
