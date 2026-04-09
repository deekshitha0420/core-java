class AmazonRunner {
    public static void main(String[] args) {
        Amazon a = new Amazon();

        double price = a.getPriceByProduct("mobile");
        double total = a.getTotalAmount(price, 1, 500);

        System.out.println("Price: " + price);
        System.out.println("Total: " + total);
    }
}