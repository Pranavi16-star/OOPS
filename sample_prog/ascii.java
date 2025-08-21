package sample_prog;
		import java.util.Scanner;

		public class ascii {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Accept a character from the user
		        System.out.print("Enter a character: ");
		        char inputChar = scanner.next().charAt(0);

		        // Convert character to ASCII value (int)
		        int asciiValue = (int) inputChar;

		        // Display results
		        System.out.println("\n--- Character to ASCII ---");
		        System.out.println("Character entered : " + inputChar);
		        System.out.println("ASCII value       : " + asciiValue);

		        scanner.close();
		    }
		}
