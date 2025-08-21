package sample_prog;


	class Person {
	    String name;

	    Person(String name) {
	        this.name = name;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	    }
	}

	class Student extends Person {
	    int id;

	    Student(String name, int id) {
	        super(name);
	        this.id = id;
	    }

	    void display() {
	        super.display(); // call parent method
	        System.out.println("Student ID: " + id);
	    }

	    public static void main(String[] args) {
	        Student s = new Student("Priya", 200);
	        s.display();
	    }
	}

