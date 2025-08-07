package sample_prog;

public class management {
	
	    int id;
	    String name;
	    String course;

	    management() {
	        this(1, "Default", "None");
	    }

	    management(int id, String name, String course) {
	        this.id = id;
	        this.name = name;
	        this.course = course;
	    }

	    void display() {
	        System.out.println("ID: " + this.id + ", Name: " + this.name + ", Course: " + this.course);
	    }

	    public static void main(String[] args) {
	    	management s1 = new management();
	    	management s2 = new management(101, "Ravi", "Java");
	        s1.display();
	        s2.display();
	    }
	}


