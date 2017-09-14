package masteringJava.interfaces.defaults;

public class CompanyEmployee implements Company,Employee{
	private String first;
	private String last;
	@Override
	public String getFirst() {
		return first;
	}
	@Override
	public String getLast() {
		return last;
	}
	@Override
	public void doWork() {
		System.out.println("working......");
		
	}
	@Override
	public String getName() {
		return String.format("%s is working for %s", Employee.super.getName(), Company.super.getName());
	}

}

/*
//As we can see here class CompanyEmployee implements both Company and employee gets
//default method from both:::Conflict ::Does not compile
//CLASS OVERRIDE INTERFACE
//no default toString() method in an interface because it will get overriden by class object.
//CLASS WINS EVERYTIME.
//Multiple Interfaces : Child overrides the parent
//The same way as in class
//Solution : add your own implementation for getName()
//how to access interfaces getName() :: Using Super keyword.
*/