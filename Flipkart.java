class Flipkart {

    public double getPriceByItem(String item) {
        double price = 0;

        if(item.equals("tv")) price = 30000;
        else if(item.equals("fridge")) price = 25000;
        else if(item.equals("ac")) price = 40000;

        return price;
    }

    public double getTotal(double price, int qty, double discount) {
        return (price * qty) - discount;
    }
}