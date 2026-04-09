class StarbucksRunner {
    public static void main(String[] args) {

        Starbucks s = new Starbucks();

        double price = s.getDrinkPrice("latte");
        double total = s.getTotalAmount(price, 2, 40);

        System.out.println("Drink Price: " + price);
        System.out.println("Total after discount: " + total);
    }
}