package masteringJava.interfaces.defaults;

public interface Employee {
	String getFirst();
	String getLast();
	void doWork();
	
	default String getName(){
		return String.format("%s %s",getFirst(), getLast()); 
	}

}

//As we can see here interface Employee has getName() as default method.