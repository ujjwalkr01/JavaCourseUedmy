package javaforBeginners;

public class PrimeNo {

	public static void main(String[] args) {
		int num = 105;
		boolean primeFlag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				primeFlag = false;
				break;
			}
			continue;
		}
		if (primeFlag) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime number");
		}
	}

}
