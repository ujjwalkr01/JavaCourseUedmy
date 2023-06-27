package com.Assignment8.ExceptionHandling;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new MyThreadException("demo1");
		} finally {
			System.out.println("More code to go..");
		}
	}
}
