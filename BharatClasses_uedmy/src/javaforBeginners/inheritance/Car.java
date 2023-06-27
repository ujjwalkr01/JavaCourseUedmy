package javaforBeginners.inheritance;

public class Car extends Veichle {
	@Override    //annotation confirms with the compiler that this method has been overriden
	String fuel() {
		return "Diesel";
	}
}
