package ExceptionHandling;

public class ThrowKeyword {

	static void fun() {
		try {
			throw new NullPointerException("demo1");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("caught inside the fun method");
		}
	} //throw keyword is used to throw exception explicitly by the programmer...

	public static void main(String[] args) {

		try {
			fun();
			throw new ArrayIndexOutOfBoundsException("demo");
		} catch (NullPointerException e) {
			System.out.println("caught inside the main method!!!!");
		}
	}

}
