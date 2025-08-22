package assignment;

public class memory {
	
	    int instanceVar;
	    
	    public memory(int val) {
	        this.instanceVar = val;
	    }

	    @Override
	    protected void finalize() throws Throwable {
	        System.out.println("Object with value " + instanceVar + " is garbage collected");
	    }

	    public static void main(String[] args) {
	        memory obj1 = new memory(10);
	        memory obj2 = new memory(20);

	        obj1 = null; // Eligible for GC
	        obj2 = null; // Eligible for GC

	        System.gc(); // Request GC

	        int localVar = 5; // Stored in stack
	        System.out.println("Local variable: " + localVar);
	    }
	}


