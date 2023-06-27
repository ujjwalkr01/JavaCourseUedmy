package ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {

		try {
			String input = args[0];
			System.out.println("Input is: " + input);
			int output = Integer.parseInt(input);
			System.out.println("Output is: " + output);
		} //catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Input is required.");
//		} catch (NumberFormatException e) {
//			System.out.println("Please give a valid input.");
//		} // In place of ArrayIndexOutOfBoundsException we can also use runtimeException
			// as it is a parent class of all the exception but
			// it will give error for the NumberFormatException as it is child class of
			// runtimeException...
			// so for multiple Catch block it's good to use specific exceptions name....

		finally {
			System.out.println("Finally block...");
		}
		System.out.println("More code can go here....");
	}

}
