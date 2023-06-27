package javaforBeginners;

public class Static_NonstaticDemo {
	static String bankName = "Axis bank";
	String customerName;
	float balance;

	public static void main(String[] args) {
		long bankAccountNumber = 12345678954l;
		System.out.println(bankAccountNumber);
		System.out.println(Static_NonstaticDemo.bankName);

		Static_NonstaticDemo bank = new Static_NonstaticDemo();
		bank.customerName = "Ujjwal";
		System.out.println(bank.customerName);
	}

}
