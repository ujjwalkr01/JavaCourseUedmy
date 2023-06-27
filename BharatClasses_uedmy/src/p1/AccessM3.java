package p1;

import javaforBeginners.AccessModifiers1;

public class AccessM3 extends AccessModifiers1 {

	public static void main(String[] args) {
		AccessModifiers1 obj = new AccessModifiers1();
		System.out.println(obj.d);

		AccessM3 obj1 = new AccessM3(); // inheritance process
		System.out.println(obj1.c);
	}

}
