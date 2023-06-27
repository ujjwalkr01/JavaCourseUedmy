package superKeyword;

public class Child extends Parent {

	int c, d;

	Child(int a, int b, int c, int d) {
		super(a, b);   //must be placed at the top....
		this.c = c;
		this.d = d;
	}

	void displayDetails() {
		System.out.println("Parent a=" + super.a);
		System.out.println("Parent b=" + super.b);
		System.out.println("Childs c=" + this.c);
		System.out.println("Childs d=" + this.d);
	}

	void f1() {
		super.f1();
		System.out.println("Inside the child class");
	}
}
