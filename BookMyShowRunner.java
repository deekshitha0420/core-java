class BookMyShowRunner {
    public static void main(String[] args) {
        BookMyShow b = new BookMyShow();

        double price = b.getTicketPrice("kgf");
        double total = b.getTotal(price, 3, 50);

        System.out.println("Price: " + price);
        System.out.println("Total: " + total);
    }
}