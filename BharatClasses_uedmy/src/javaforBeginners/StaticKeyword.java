package javaforBeginners;

public class StaticKeyword {

	static int a = StaticKeyword.method1();

	public static void main(String[] args) {
		System.out.println("Value of a=" + a);
		StaticKeyword.method1();
	}

	static int method1() {
		System.out.println("Second");
		return 20;
	}

	static {
		System.out.println("Third");
		StaticKeyword.method1();
	}

}
