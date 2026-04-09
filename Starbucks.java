class Starbucks {

    public double getDrinkPrice(String drinkName) {
        double price = 0.0;

        if(drinkName.equals("coffee")) {
            price = 150;
        } else if(drinkName.equals("cappuccino")) {
            price = 200;
        } else if(drinkName.equals("latte")) {
            price = 220;
        } else if(drinkName.equals("espresso")) {
            price = 180;
        } else {
            price = 0.0;
        }

        return price;
    }

    public double getTotalAmount(double price, int quantity, double discount) {
        double total = price * quantity;
        total = total - discount;
        return total;
    }
}