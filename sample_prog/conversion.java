package sample_prog;
		public class conversion {
		    public static void main(String[] args) {
		        // Step 1: Declare and initialize an int
		        int intValue = 123456789;
		        System.out.println("Original int value     : " + intValue);

		        // Step 2: Widening from int to long
		        long longValue = intValue;
		        System.out.println("After conversion to long : " + longValue);

		        // Step 3: Widening from long to float
		        float floatValue = longValue;
		        System.out.println("After conversion to float: " + floatValue);

		        // Comparison to show no significant data loss
		        System.out.println("\nIs intValue equal to longValue? " + (intValue == longValue));
		        System.out.println("Is longValue equal to floatValue? " + (longValue == (long) floatValue));
		    }
		}
