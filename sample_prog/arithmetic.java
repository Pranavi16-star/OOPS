package sample_prog;
import java.util.Scanner;
public class arithmetic {
	


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        int a = sc.nextInt(), b = sc.nextInt();
	        
	        System.out.println("Addition: " + (a + b));
	        System.out.println("Subtraction: " + (a - b));
	        System.out.println("Multiplication: " + (a * b));
	        System.out.println("Division: " + (a / b));
	        System.out.println("Modulus: " + (a % b));
	    }
	}


