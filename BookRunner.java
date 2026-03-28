class BookRunner {
    public static void main(String[] args) {
        Book ref = new Book();

        ref.title = "Java Programming";
        ref.author = "James Gosling";
        ref.price = 500;
        ref.publisher = "Tech Books";
        ref.pages = 350;
        ref.language = "English";
		ref.display();

        
    }
}