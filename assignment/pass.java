package assignment;

public class pass {
	    public static void main(String[] args) {
	        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
	        int[][] marks = {
	            {65, 70, 80},
	            {50, 34, 60},
	            {90, 85, 95},
	            {45, 35, 35}
	        };

	        System.out.println("Students who passed all subjects:");
	        for (int i = 0; i < marks.length; i++) {
	            boolean passed = true;
	            for (int j = 0; j < marks[i].length; j++) {
	                if (marks[i][j] < 35) {
	                    passed = false;
	                    break;
	                }
	            }
	            if (passed) {
	                System.out.println(students[i]);
	            }
	        }
	    }
	}


