package assignment;

public class string {
	    public static void main(String[] args) {
	        String s1 = "Hello";
	        String s2 = "Hello";
	        String s3 = new String("Hello");
	        String s4 = new String("HELLO");

	        System.out.println("s1 == s2: " + (s1 == s2)); // true (same memory in string pool)
	        System.out.println("s1 == s3: " + (s1 == s3)); // false (new object in heap)
	        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (value comparison)
	        System.out.println("s1.equals(s4): " + s1.equals(s4)); // false (case sensitive)
	        System.out.println("s1.equalsIgnoreCase(s4): " + s1.equalsIgnoreCase(s4)); // true
	    }
	}



