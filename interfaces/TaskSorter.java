package masteringJava.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskSorter {

	public static void main(String[] args) {
		List<Task> tasks =new ArrayList<>();
		tasks.add(new Task(1,"helllloooooo",4));
		tasks.add(new Task(2,"hiii",3));
		tasks.add(new Task(3,"yellllloooooo",5));
		tasks.add(new Task(4,"heyaaaaooo",6));
		tasks.add(new Task(5,"how u doing?",2));
		
		//for (Task task : tasks) {     //below JAVA 8
		//	System.out.println(task);
		//}
		
		tasks.forEach(System.out::println); //JAVA 8 onwards
		
		/*
		Collections.sort(tasks); IDE error because tasks must implement the Comparable Interface and override the compareTo method. Collections.sort is modified merge sort.which will be 
		needing comparison for element.
		Solution to this error :
		sort problem : wanna be able to sort anything.
		One way is implement sorting class for every class separately and then use "Employee extends Sorting" to use sorting for employees.But Employee can extend only one class.
		Not a good idea
		Other way is implement sorting class for all the classes to be sorted and then use "Employee extends Sorting" to use sorting for employees. and override compareTo method accordingly.
		But Employee can extend only one class then.
		Inheritance tree to the extent of unusability.
		Not a good idea
		Another way : Interfaces
		Class Collections ->sort() method - sorts according to natural order and elements must all implements the Comparable interface. 
		So you need to just add interface Comparable to the class you want to be sorted and define the compateTo method for your class, and you are good to go.
		BUT WHAT IF You DONT Want to modify the class.
		ANSWER : Comparator Interface
		*/
		Collections.sort(tasks); //Sorts but returns void
		System.out.println("After Sorting");
		tasks.forEach(System.out::println); //JAVA 8 onwards
		
		//JAVA 8 sorted method on streams, returns new sorted stream.
		
 
	}

}
