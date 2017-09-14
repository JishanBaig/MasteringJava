package masteringJava.oop;

public class Salaried extends Employee{
	
	public static final double DEFAULT_SALARY = 1200000;
	public double salary =DEFAULT_SALARY;
	
	public Salaried() {
	}

	public Salaried(String name) {
		this(name, DEFAULT_SALARY);
	}

	public Salaried(String name, double salary) {
		super(name);
		this .salary =salary;
	}

	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double getPay() { //Super class is abstract class so we have to define here otherwise declare it as abstract method and corresponding Salaried as abstract class.
		return salary / 24;     //the price you pay is "You cant instantiate abstract class but i can still make COLLECTIONS of these"
	}
	
	

}
