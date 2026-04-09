class Zomato {

    public double getFoodPrice(String food) {
        double price = 0;

        if(food.equals("pizza")) price = 250;
        else if(food.equals("burger")) price = 120;
        else if(food.equals("pasta")) price = 180;

        return price;
    }

    public double getBill(double price, int qty, double discount) {
        return (price * qty) - discount;
    }
}