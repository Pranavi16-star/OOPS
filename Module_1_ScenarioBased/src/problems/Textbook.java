package problems;
class Book {
    // Private fields (Encapsulation)
    private String title;
    private String author;
    private double price;

    // Initialization block – runs every time an object is created
    {
        System.out.println("📚 Welcome! A new book object is being created...");
    }

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price); // use setter for validation
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    // Setters with validation
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("❌ Invalid price. Must be positive.");
    }
}
class Textbook {
    public static void main(String[] args) {
        Book b1 = new Book("Effective Java", "Joshua Bloch", 450);
        System.out.println(b1.getTitle() + " by " + b1.getAuthor() + " - $" + b1.getPrice());

        b1.setPrice(-50); // invalid update
        b1.setPrice(500); // valid update
        System.out.println("Updated Price: $" + b1.getPrice());
    }
}

