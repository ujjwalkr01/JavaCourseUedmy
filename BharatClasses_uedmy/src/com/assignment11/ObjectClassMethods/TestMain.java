package com.assignment11.ObjectClassMethods;

public class TestMain {

	public static void main(String[] args) {

		ElectricityBill eb=new ElectricityBill();
		eb.setMeterNo(1211);
		eb.setName("Ujjwal");
		eb.setAddress("66/c,Block22,Neyveli,Chennai");
		System.out.println(eb);
		
		System.out.println(eb.hashCode());
		
		ElectricityBill eb1=new ElectricityBill();
		eb1.setMeterNo(1211);
		eb1.setName("Ujjwal");
		eb1.setAddress("66/c,Block22,Neyveli,Chennai");
		
		System.out.println(eb.equals(eb1));
	}

}
