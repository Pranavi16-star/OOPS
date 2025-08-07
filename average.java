package sample_prog;
import java.util.Scanner;
  
public class average {
	
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter three numbers: ");
	        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
	        
	        double avg = (a + b + c) / 3.0;  // Ensures correct float division
	        System.out.println("average: " + avg);
	    }
}


