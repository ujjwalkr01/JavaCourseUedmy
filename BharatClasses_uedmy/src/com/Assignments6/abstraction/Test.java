package com.Assignments6.abstraction;

public class Test {

	public static void main(String[] args) {

		HpNoteBook hp = new HpNoteBook();
		hp.click();
		hp.scroll();

		DellNoteBook dell = new DellNoteBook();
		dell.click();
		dell.scroll();
	}

}
