package masteringJava.oop.equalsandhashcode;

public class UseHR {

	public static void main(String[] args) {
		HR hr =new HR();
		
		hr.hire(new Salaried("Fred"));
		hr.hire(new Hourly("Tom"));
		hr.hire(new Salaried());
		hr.hire(new Hourly());
		hr.printEverybody();
		hr.payEverybody();
		

	}

}
