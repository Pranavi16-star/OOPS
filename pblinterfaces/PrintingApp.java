package pblinterfaces;

//Interface
interface Printable {
 void printContent();
}

//Implementation 1
class PDFDocument implements Printable {
 public void printContent() {
     System.out.println("📝 Printing PDF content: 'This is a sample PDF document...'");
 }
}

//Implementation 2
class WordDocument implements Printable {
 public void printContent() {
     System.out.println("📄 Printing Word content: 'This is a sample Word document...'");
 }
}

//Main program
class PrintingApp {
 public static void main(String[] args) {
     Printable[] docs = { new PDFDocument(), new WordDocument() };

     for (Printable p : docs) {
         p.printContent();
         System.out.println("-----------------");
     }
 }
}
