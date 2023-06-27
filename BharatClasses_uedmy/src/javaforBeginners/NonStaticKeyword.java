package javaforBeginners;

public class NonStaticKeyword {

	int num;

	NonStaticKeyword() {
		System.out.println("its a constructor");
	}

	{
		System.out.println("Its a nonstatic block");
	}

	public static void main(String[] args) {
		System.out.println("Its a main method");
		NonStaticKeyword obj = new NonStaticKeyword();
         obj.foo();
	}

	static {
		System.out.println("Its a static block");
	}

	void foo() {
		System.out.println("this is a non static method");
	}
}
