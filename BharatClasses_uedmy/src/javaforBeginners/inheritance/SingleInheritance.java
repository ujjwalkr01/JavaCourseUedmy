package javaforBeginners.inheritance;

public class SingleInheritance {
	void m1() {
		System.out.println("Single inheritance");
	}

	public static void main(String[] args) {
		SingleInheritance obj = new SingleInheritance();
		obj.m1();
		obj.hashCode(); // these are present in the java.lang.object
		obj.getClass();
	}

}
