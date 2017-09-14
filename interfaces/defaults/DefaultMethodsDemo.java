package masteringJava.interfaces.defaults;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DefaultMethodsDemo {

	public static void main(String[] args) {
		List<Integer> nums = Stream.of(-1,2,3,1,6,5).collect(Collectors.toList());
		System.out.println(nums);
		//removeIf is a default method in Collection
		//returns true if any elements were removed
		boolean removed =nums.removeIf(n -> n<=0);
		System.out.println("Elements were "+ (removed ? "" : "NOT" ) + "removed");
		System.out.println(nums);
		
		//Iterator has a default forEach method
		nums.forEach(System.out::println);

	}

}

/*
Interface List : default removeIf method that takes a predicate as argument
n -> n<=0 ---returns true if n less than or equal to 0 otherwise false
Interface Stream : static of method: returns a stream then converted to a list
  
*/