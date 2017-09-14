package masteringJava.oop.equalsandhashcode;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class HR {
	private List<Employee> employees = new ArrayList<>();
	//List ->interface type
	//Employee ->generic type
	//<> ->Diamond operator-->JAVA 7 onwards otherwise <Employee>
	
	public void hire(Employee e){
		employees.add(e);
	}
	
	public void layoff(Employee e){
		employees.remove(e);
	}
	
	public List<Employee> getEmployees(){
			return employees;
	}
	
	public void printEverybody(){
		employees.forEach(System.out::println);
		//iterator JAVA 5 onwards
		//forEach : method reference.
		//forEach method is added to Iterator as default method JAVA 8 onwards.Means ->add a default method in interface, override it if u want or use default one.
		//###Normally if you add a method to an interface, you break all the implementations until you implement the method
		//example needed:
		//forEach takes consumer as an argument,Consumer is an interface added in java 8 in java.util.functio package,takes each element and returns void.
		//showing java 8 lambda example : using another class's (System.out) function (println). 
	}
	
	//Magic of Polymorphism.
	public void payEverybody(){
		for(Employee e : employees){ //since JAVA 5
			System.out.printf("Paying %s %s%n",e.getName(),NumberFormat.getCurrencyInstance().format(e.getPay()));
		}
	}

}
