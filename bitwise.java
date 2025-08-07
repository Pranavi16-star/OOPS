package sample_prog;


	import java.util.Scanner;
	public class bitwise {

	    public static void main(String[] args) {
	        Scanner Sc = new Scanner(System.in);
	        System.out.print("Enter two integers: ");
	        int a = Sc.nextInt(), b = Sc.nextInt();

	        System.out.println("a & b: " + (a & b) + " (" + Integer.toBinaryString(a & b) + ")");
	        System.out.println("a | b: " + (a | b) + " (" + Integer.toBinaryString(a | b) + ")");
	        System.out.println("a ^ b: " + (a ^ b) + " (" + Integer.toBinaryString(a ^ b) + ")");
	        System.out.println("a << 1: " + (a << 1) + " (" + Integer.toBinaryString(a << 1) + ")");
	        System.out.println("b >> 1: " + (b >> 1) + " (" + Integer.toBinaryString(b >> 1) + ")");
	    }
	}


