package sample_prog;

public class wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Declare and initialize variables of all primitive types
		        byte byteVar = 10;
		        short shortVar = 1000;
		        int intVar = 100000;
		        long longVar = 10000000000L;
		        float floatVar = 10.5f;
		        double doubleVar = 20.99;
		        char charVar = 'A';
		        boolean booleanVar = true;

		        // Print the values
		        System.out.println("Values of Primitive Types:");
		        System.out.println("byte: " + byteVar);
		        System.out.println("short: " + shortVar);
		        System.out.println("int: " + intVar);
		        System.out.println("long: " + longVar);
		        System.out.println("float: " + floatVar);
		        System.out.println("double: " + doubleVar);
		        System.out.println("char: " + charVar);
		        System.out.println("boolean: " + booleanVar);

		        // Print sizes using wrapper class constants
		        System.out.println("\nSizes of Primitive Types (in bits):");
		        System.out.println("byte: " + Byte.SIZE);
		        System.out.println("short: " + Short.SIZE);
		        System.out.println("int: " + Integer.SIZE);
		        System.out.println("long: " + Long.SIZE);
		        System.out.println("float: " + Float.SIZE);
		        System.out.println("double: " + Double.SIZE);
		        System.out.println("char: " + Character.SIZE);
		        // Boolean doesn't have a SIZE constant, but we can state it's typically 1 bit (logical value)
		        System.out.println("boolean: " + "Not precisely defined (typically 1 bit for logical use)");
		    }
		}
