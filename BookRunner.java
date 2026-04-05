class BookRunner {
    public static void main(String[] args) {
        new Book();
        System.out.println("-----------");
        new Book("Python", "David");
        System.out.println("-----------");
        new Book("C++", "Bjarne", 300);
        System.out.println("-----------");
        new Book("DSA", "Mark", 400, 500);
        System.out.println("-----------");
        new Book("AI", "Andrew", 600, 800, "TechBooks");
    }
}