class Amazon {

    public double getPriceByProduct(String product) {
        double price = 0;

        if(product.equals("mobile")) price = 15000;
        else if(product.equals("laptop")) price = 50000;
        else if(product.equals("watch")) price = 2000;

        return price;
    }

    public double getTotalAmount(double price, int qty, double discount) {
        return (price * qty) - discount;
    }
}