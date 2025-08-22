package pblinterfaces;

//Interface
interface Payment {
 void process(double amount);
 void refund(double amount);
}

//Implementation 1
class CreditCardPayment implements Payment {
 public void process(double amount) {
     System.out.println("💳 Processing credit card payment of $" + amount);
 }
 public void refund(double amount) {
     System.out.println("💳 Refunding $" + amount + " to credit card");
 }
}

//Implementation 2
class UPIPayment implements Payment {
 public void process(double amount) {
     System.out.println("📱 Processing UPI payment of $" + amount);
 }
 public void refund(double amount) {
     System.out.println("📱 Refunding $" + amount + " via UPI");
 }
}

//Main program
class Ecommerceapp {
 public static void main(String[] args) {
     Payment[] payments = { new CreditCardPayment(), new UPIPayment() };

     double[] amounts = {250.0, 120.5};
     
     for (int i = 0; i < payments.length; i++) {
         payments[i].process(amounts[i]);
         payments[i].refund(50.0); // demo refund
         System.out.println("-----------------");
     }
 }
}
