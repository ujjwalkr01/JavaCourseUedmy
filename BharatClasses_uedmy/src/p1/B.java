package p1;

import p1.p2.C;

public class B {

	public static void main(String[] args) {
		A.a1();            //Static keyword methods are accessed via class name.
		javaforBeginners.A.a1();

		C obj = new C();
		obj.c1();
	}

}
