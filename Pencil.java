class Pencil {

    String brand;
    String color;
    int price;
    boolean isSharp;
    double length;

    // Parameterized Constructor
    Pencil(String brand, String color, int price, boolean isSharp, double length) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.isSharp = isSharp;
        this.length = length;
    }

    // Method to display details
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Is Sharp (true/false): " + isSharp);
        System.out.println("Length: " + length + " cm");
    }
}