class UberRunner {
    public static void main(String[] args) {
        Uber u = new Uber();

        double price = u.getRidePrice("mini");
        double total = u.getFare(price, 5, 50);

        System.out.println("Price per km: " + price);
        System.out.println("Total Fare: " + total);
    }
}