class ZomatoRunner {
    public static void main(String[] args) {
        Zomato z = new Zomato();

        double price = z.getFoodPrice("pizza");
        double total = z.getBill(price, 2, 50);

        System.out.println("Price: " + price);
        System.out.println("Total: " + total);
    }
}