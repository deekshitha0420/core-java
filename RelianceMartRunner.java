class RelianceMartRunner {
    public static void main(String[] args) {
        RelianceMart r = new RelianceMart();

        double price = r.getItemPrice("rice");
        double total = r.getBill(price, 5, 30);

        System.out.println("Price: " + price);
        System.out.println("Total: " + total);
    }
}