package sample_prog;


	public class Student {
	    int id;
	    String name;
	    static String college;

	    static {
	        college = "ABC College";
	    }

	    static void changeCollege(String newCollege) {
	        college = newCollege;
	    }

	    Student(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    void display() {
	        System.out.println("ID: " + id + ", Name: " + name + ", College: " + college);
	    }

	    public static void main(String[] args) {
	        Student s1 = new Student(1, "Akhil");
	        Student s2 = new Student(2, "Bhanu");
	        s1.display();
	        s2.display();

	        changeCollege("XYZ University");
	        s1.display();
	        s2.display();
	    }
	}


