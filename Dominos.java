class Dominos {

    public double getPizzaPrice(String pizza) {
        double price = 0;

        if(pizza.equals("margherita")) price = 199;
        else if(pizza.equals("farmhouse")) price = 349;
        else if(pizza.equals("pepperoni")) price = 399;

        return price;
    }

    public double getTotal(double price, int qty, double discount) {
        return (price * qty) - discount;
    }
}