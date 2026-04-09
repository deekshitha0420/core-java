class BookMyShow {

    public double getTicketPrice(String movie) {
        double price = 0;

        if(movie.equals("kgf")) price = 200;
        else if(movie.equals("rrr")) price = 250;
        else if(movie.equals("leo")) price = 300;

        return price;
    }

    public double getTotal(double price, int tickets, double discount) {
        return (price * tickets) - discount;
    }
}