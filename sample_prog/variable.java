package sample_prog;

public class variable {
	
	    public static void main(String[] args) {
	        final int x = 10;
	        // x = 20; // ❌ Compile-time error: cannot assign a value to final variable
	        System.out.println("Final value: " + x);
	    }
	}


