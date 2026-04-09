class OlaRunner {
    public static void main(String[] args) {
        Ola o = new Ola();

        double price = o.getCabPrice("auto");
        double total = o.getFare(price, 4, 20);

        System.out.println("Price per km: " + price);
        System.out.println("Total Fare: " + total);
    }
}