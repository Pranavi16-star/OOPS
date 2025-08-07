package sample_prog;

public class BankAccount {
	
	    static String bankName;
	    static double interestRate;
	    int accountNo;
	    String holderName;

	    static {
	        bankName = "Global Bank";
	        interestRate = 4.5;
	    }

	    BankAccount(int accountNo, String holderName) {
	        this.accountNo = accountNo;
	        this.holderName = holderName;
	    }

	    static void updateInterestRate(double rate) {
	        interestRate = rate;
	    }

	    void display() {
	        System.out.println("Account No: " + accountNo + ", Name: " + holderName +
	                           ", Bank: " + bankName + ", Interest: " + interestRate + "%");
	    }

	    public static void main(String[] args) {
	        BankAccount b1 = new BankAccount(1001, "Arjun");
	        BankAccount b2 = new BankAccount(1002, "Meera");
	        b1.display();
	        b2.display();

	        updateInterestRate(5.0);
	        b1.display();
	        b2.display();
	    }
	}


