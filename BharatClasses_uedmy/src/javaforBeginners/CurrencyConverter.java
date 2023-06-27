package javaforBeginners;

public class CurrencyConverter {
	
	int rupee = 63;
	int dirham = 3;
	int _yen = 4;
	int $australian = 2;
    int Rupee = 63;
    int minValue = Integer.MIN_VALUE;
    
    void printCurrencies () {
    	System.out.println("rupee : "+ rupee);
    	System.out.println("dirham : "+ dirham);
    	System.out.println("australian : "+ $australian);
    	System.out.println("Rupee : "+ Rupee);
    	System.out.println("int : "+ minValue);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         CurrencyConverter cc = new CurrencyConverter();
         cc.printCurrencies();
	}

}
