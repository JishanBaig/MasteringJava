package masteringJava.oop;

import java.time.LocalDate; //added in JAVA 8

public abstract class Employee {       //why abstract --> because it contains a method which is abstract..:)
	                                   //abstract class <---> contains at least one abstract method.
	                                   //               ----> Can not be instantiated.
	                                   //               ----> Can have References (We surely WILL)
	
	public static final String DEFAULT_NAME = "UNKNOWN";
	private static int nextId;
	
	private int id;
	private String name;
	private LocalDate hireDate;
	
	
	//When multiple constructors in one class.
	//One constructor "public Employee(String name)" do all the work while other constructor "public Employee()" can call it using arguments and this() as a method.
	
	public Employee() {
		this(DEFAULT_NAME);  //the right way will be Employee.DEFAULT_NAME, because its static ,belongs to the class.
	}

	public Employee(String name) {
		//super();
		id = nextId++;
		this.name = name;
		this.hireDate = LocalDate.now();
	}

	public int getId() {
		return id;
	}

	private void setId(int id) { //JPA have setters as private methods.
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public abstract double getPay();    //this is generic Employee. organization may have many different set of employees. everybodies pay will be different.
	                                    //but why abstract??
	                                    // I am going to use a for loop to pay all the employees as HR person. When this method gets called it will execute for 
	                                    //Employee References, so i need this method for all.
	                                    //Ultimately it will lend to their corresponding employee subclasses. :)
	                                    //No default implementation, becoz i dont know what kind of sEmployee is..
	                                    //Child classes MUST OVERRIDE unless they are also abstract.
	                                     

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", hireDate=" + hireDate + "]";
	}

}
