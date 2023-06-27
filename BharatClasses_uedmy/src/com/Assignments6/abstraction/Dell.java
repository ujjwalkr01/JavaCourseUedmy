package com.Assignments6.abstraction;

abstract class Dell implements TouchScreenLaptop {

	@Override
	public void scroll() {
		System.out.println("Dell scroll method");
	}
}
