package masteringJava.oop;

public class Hourly extends Employee{
	public static final double DEFAULT_RATE = 100; //100Rs per hour
	public static final int DEFAULT_HOURS = 80;  //80Hrs worked per month
	
	public double rate = DEFAULT_RATE;
	public int hours = DEFAULT_HOURS;
	
	public Hourly() {		
	}
	
	public Hourly(String name){
		this(name,DEFAULT_RATE);
	}
	
	public Hourly(String name,double rate){
		super(name);
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public double getPay() {
		return rate * hours;
	}
	
	

}
