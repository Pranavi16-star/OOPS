package sample_prog;
	import java.util.Scanner;

	public class student_details {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter student name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter roll number: ");
	        int rollNumber = scanner.nextInt();

	        System.out.print("Enter age: ");
	        int age = scanner.nextInt();

	        System.out.print("Enter gender (M/F): ");
	        char gender = scanner.next().charAt(0);

	        System.out.print("Enter percentage: ");
	        float percentage = scanner.nextFloat();

	        // Displaying formatted output
	        System.out.println("\n----- Student Details -----");
	        System.out.printf("Name       : %s\n", name);
	        System.out.printf("Roll Number: %d\n", rollNumber);
	        System.out.printf("Age        : %d\n", age);
	        System.out.printf("Gender     : %c\n", gender);
	        System.out.printf("Percentage : %.2f%%\n", percentage);

	        scanner.close();
	    }
	}


