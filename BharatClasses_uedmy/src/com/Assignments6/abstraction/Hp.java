package com.Assignments6.abstraction;

abstract class Hp implements TouchScreenLaptop {

	@Override
	public void scroll() {
		System.out.println("Hp method scroll");
	}
}
