class MyntraRunner {
    public static void main(String[] args) {
        Myntra m = new Myntra();

        double price = m.getClothPrice("shirt");
        double total = m.getFinalAmount(price, 2, 100);

        System.out.println("Price: " + price);
        System.out.println("Total: " + total);
    }
}