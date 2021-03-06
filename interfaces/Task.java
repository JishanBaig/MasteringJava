package masteringJava.interfaces;

import java.time.LocalDate;

/*Interfaces : 
To get away from single Inheritance--a class can only have a single parent.
class A extends B,C,D --NOT POSSIBLE
e.g. A is a B,C,D
B   C   D
 \  |  /
  \ | /
    A
Class A can only extend B
  B
  |
  |
  A
Solution : Interfaces
"IS A" relationship to multiple classes.
  
*/
public class Task implements Comparable<Task>{
	
	private int id;
	private String name;
	private LocalDate startDate = LocalDate.now();
	private LocalDate endDate = LocalDate.now();
	
	private int priority;
	private boolean completed;
	
	public Task() {
	}

	public Task(int id, String name, int priority) {
		this(id,name,LocalDate.now(),LocalDate.now(), priority,false);
	}

	public Task(int id, String name, LocalDate startDate, LocalDate endDate, int priority, boolean completed) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
		this.completed = completed;
	}
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + 
				", name=" + name + 
				", startDate=" + startDate + 
				", endDate=" + endDate + 
				", priority=" + priority + 
				", completed=" + completed + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (completed ? 1231 : 1237);
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + priority;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (completed != other.completed)
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (priority != other.priority)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	@Override
	public int compareTo(Task o) {
		return name.compareTo(o.name);
		//if this > o then return +
		//if this < o then return -
		//if this = o then return 0
	}
	
}
