package ExceptionHandling.checked.customException;

public class Test {

	public static void main(String[] args) throws CheckedCustomException {

//		throw new UncheckedCustomException("Buisness Exception occured");
		throw new CheckedCustomException("Buisness exception to be handled....");
	}

}
