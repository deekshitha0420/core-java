class FlipkartRunner {
    public static void main(String[] args) {
        Flipkart f = new Flipkart();

        double price = f.getPriceByItem("tv");
        double total = f.getTotal(price, 1, 1000);

        System.out.println("Price: " + price);
        System.out.println("Total: " + total);
    }
}