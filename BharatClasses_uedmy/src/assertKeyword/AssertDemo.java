package assertKeyword;

public class AssertDemo {

	public static void main(String[] args) {

//Assertions were introduced in Java 1.4 mainly for testing and debugging reasons. Instead of using System.out.println statements, we can use a assertion statement which starts with assert
//keyword, then a expression which should evaluate to a boolean value. If it returns true then the assertion will pass.
//If not it will throw a AssertionsError which is a child class of java.lang.Error in the exception hierarchy.
		
		
		int withdrawlAmount = 4000;
		int currentBalance = 2000;

		assert (withdrawlAmount < currentBalance) : "Withdrawl amount is more than the current balance";
		
//typically we use a string message. If expression1 returns true or false,the expression1 always needs to be an expression that evaluates to a boolean value.
// If it evaluates to a false, only then the expression2 will be evaluated and the value of it will be used in the AssertionError.	
//To enable/disable assertion we should pass the command in VM-arguments of the arguments section...
		// -ea = for enabling assertions...
		// -da = for disabling assertions..
		// -esa = for enabling system level assertion..
		// -dsa = for disabling system level assertion..
	}

}
