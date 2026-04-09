class DominosRunner {
    public static void main(String[] args) {
        Dominos d = new Dominos();

        double price = d.getPizzaPrice("margherita");
        double total = d.getTotal(price, 2, 50);

        System.out.println("Price: " + price);
        System.out.println("Total: " + total);
    }
}