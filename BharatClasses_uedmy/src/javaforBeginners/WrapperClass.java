package javaforBeginners;

public class WrapperClass {

	public static void main(String[] args) {

		// Primitive to Object
		int x = 100;
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		// object to primitive..
		int z = y.intValue();
		System.out.println(z);

		System.out.println("-------------------------1--------------------------------");

		byte a = 97;
		String b = Byte.toString(a);// primitive to String
		System.out.println(b);
		byte c = Byte.parseByte(b);// String to byte
		System.out.println(c);

		System.out.println("----------------------------2-----------------------------");

		long d = 1000;
		Long e = Long.valueOf(d);// object to string
		String f = e.toString();  
		System.out.println(f);

		System.out.println("------------------------------3---------------------------");

		Long g = Long.valueOf(f);// String to object
		System.out.println(g);
	}

}
