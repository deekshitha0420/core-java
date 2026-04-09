class Myntra {

    public double getClothPrice(String cloth) {
        double price = 0;

        if(cloth.equals("shirt")) price = 999;
        else if(cloth.equals("jeans")) price = 1499;
        else if(cloth.equals("jacket")) price = 2999;

        return price;
    }

    public double getFinalAmount(double price, int qty, double discount) {
        return (price * qty) - discount;
    }
}