class Uber {

    public double getRidePrice(String type) {
        double price = 0;

        if(type.equals("mini")) price = 150;
        else if(type.equals("sedan")) price = 250;
        else if(type.equals("suv")) price = 400;

        return price;
    }

    public double getFare(double price, int km, double discount) {
        return (price * km) - discount;
    }
}