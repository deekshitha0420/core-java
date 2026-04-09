class RelianceMart {

    public double getItemPrice(String item) {
        double price = 0;

        if(item.equals("rice")) price = 60;
        else if(item.equals("oil")) price = 150;
        else if(item.equals("sugar")) price = 50;

        return price;
    }

    public double getBill(double price, int qty, double discount) {
        return (price * qty) - discount;
    }
}