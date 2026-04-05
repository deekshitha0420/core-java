class Book {

    String title;
    String author;
    int pages;
    double price;
    String publisher;

    Book() {
        this("Java Basics", "John");
        System.out.println("Default Constructor");
    }

    Book(String title, String author) {
        this(title, author, 200);
        System.out.println("Two Parameter Constructor");
    }

    Book(String title, String author, int pages) {
        this(title, author, pages, 350);
        System.out.println("Three Parameter Constructor");
    }

    Book(String title, String author, int pages, double price) {
        this(title, author, pages, price, "XYZ Publications");
        System.out.println("Four Parameter Constructor");
    }

    Book(String title, String author, int pages, double price, String publisher) {
        System.out.println(title + " " + author + " " + pages + " " + price + " " + publisher);
    }
}