package masteringJava.oop;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyPrinter {
    //prints some number as a currency.
	public static void main(String[] args) {
		double amount = 123456789.981698691;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		//Example of abstract class that has a factory method to create an instance.
		//number Format is an abstract class so u can instantiate it, so u need a method to instantiate it which is getCurrencyInstance() which is a static method(it has to be)
		//So what's getting returned by this method and what's its relation to Number Format???
		   // Must be instantiating a child of the Number Format class. 
		   //
		System.out.println(nf.format(amount));
		//by default gives the output as indian rupees.
		
		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(nf.format(amount));
		
		System.out.println(nf.getClass().getName());
		//java.text.DecimalFormat
		//object of DecimalFormat a Concrete class,which is a child class of NumebrFormat(abstract class) containing method getCurrencyInstance()

	}

}
