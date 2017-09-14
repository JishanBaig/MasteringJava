package masteringJava.interfaces.defaults;

/*Before JAVA 8 : Interface : collection of abstract methods, instance methods and const (Providing static final property).
Classes would implement all those methods in them.
Onwards JAVA 8 : static and default methods.
static means class level (ODD CHOICE for interface because classes implements interface)
example from past : Collection Interface - can't add static method
  Collection(s) is a class that contains all the static methods only.      
But now we have static method in interface so no need to create another class.        
*/

/*
Interface Stream : Not Stored everywhere
  immutable, provide in sequence
  all the static methods are factory methods for creating streams.
*/

/*
Interface Iterable : Since JAVA 1.5
before abstract Iterator<T> iterator();
now forEach() as default method
e.g. list implements iterator => employees.forEach(System.out::println);
*/

/*
WHAT IF : Two interfaces have default method and one class implements both interfaces:
#CONFLICT#


*/
public interface Company {
	default String getName(){
		return "default.Company\n";
	}
}


//As we can see here interface Company has getName() as default method.

