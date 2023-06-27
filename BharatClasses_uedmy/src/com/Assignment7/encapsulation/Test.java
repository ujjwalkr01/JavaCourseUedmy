package com.Assignment7.encapsulation;

public class Test {

	public static void main(String[] args) {

		Patient p1=new Patient();
		
		p1.setId(1212);
		p1.setName("Ujjwal");
		p1.setSsn("XYZ");
		
		System.out.println("Id: "+p1.getId());
		System.out.println("Name: "+p1.getName());
		System.out.println("SSN: "+p1.getSsn());

   }
}
