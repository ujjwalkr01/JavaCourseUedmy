package javaforBeginners;

public class AccessM2 {

	public static void main(String[] args) {
		AccessModifiers1 obj = new AccessModifiers1();
		// System.out.println(obj.a); cannot be accessible becoz its a private variable...
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}

}
