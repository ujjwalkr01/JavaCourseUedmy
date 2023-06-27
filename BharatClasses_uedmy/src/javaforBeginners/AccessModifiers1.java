package javaforBeginners;

public class AccessModifiers1 {
	private int a = 30;
	int b = 40;
	protected int c = 50;
	public int d = 60;

	public static void main(String[] args) {
        AccessModifiers1 obj=new AccessModifiers1();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
	}

}
