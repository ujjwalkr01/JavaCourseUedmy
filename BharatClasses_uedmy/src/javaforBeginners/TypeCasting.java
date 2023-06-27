package javaforBeginners;

public class TypeCasting {

	public static void main(String[] args) {
		// implicit type casting or widening conversion..
		int x = 5;
		byte y = (byte) x;
		System.out.println(y);

		float a = 3.4f;
		int b = (int) a;
		System.out.println(b);

		int z = 97;
		char A = (char) z;
		System.out.println(A);

		// Explicit type casting or narrowing conversion..
		char c = 'a';
		int d = c;
		System.out.println(d);

		// Explicit type casting out the range..
		int m = 612;
		byte n = (byte) m;
		char o = (char) n;
		System.out.println(o);
	}

}
