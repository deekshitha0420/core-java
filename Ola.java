class Ola {

    public double getCabPrice(String cab) {
        double price = 0;

        if(cab.equals("auto")) price = 100;
        else if(cab.equals("bike")) price = 80;
        else if(cab.equals("prime")) price = 300;

        return price;
    }

    public double getFare(double price, int km, double discount) {
        return (price * km) - discount;
    }
}