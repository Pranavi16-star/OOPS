package sample_prog;
		import java.util.Scanner;

		public class narrowing{
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Accept double input
		        System.out.print("Enter a double value: ");
		        double doubleValue = scanner.nextDouble();

		        // Narrowing conversion: double to int (explicit cast)
		        int intValue = (int) doubleValue;

		        // Print both values
		        System.out.println("\n--- Type Conversion Result ---");
		        System.out.println("Original double value: " + doubleValue);
		        System.out.println("After conversion to int: " + intValue);

		        scanner.close();
		    }
		}
