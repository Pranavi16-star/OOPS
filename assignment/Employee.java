package assignment;

public class Employee {
	
	    private String name;
	    private int id;
	    private static int count = 0;

	    public Employee(String name, int id) {
	        this.name = name;
	        this.id = id;
	        count++;
	    }

	    public void display() {
	        System.out.println("Employee ID: " + id + ", Name: " + name);
	    }

	    public static void displayCount() {
	        System.out.println("Total Employees: " + count);
	    }

	    public static void main(String[] args) {
	        Employee e1 = new Employee("Alice", 101);
	        Employee e2 = new Employee("Bob", 102);
	        Employee e3 = new Employee("Charlie", 103);

	        e1.display();
	        e2.display();
	        e3.display();

	        Employee.displayCount();
	    }
	}


