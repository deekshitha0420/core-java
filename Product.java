class Product {

    String productName;
    int productId;
    double price;
    String brand;
    String category;

    Product() {
        this("Laptop", 101);
        System.out.println("Default Constructor");
    }

    Product(String productName, int productId) {
        this(productName, productId, 50000);
        System.out.println("Two Parameter Constructor");
    }

    Product(String productName, int productId, double price) {
        this(productName, productId, price, "Dell");
        System.out.println("Three Parameter Constructor");
    }

    Product(String productName, int productId, double price, String brand) {
        this(productName, productId, price, brand, "Electronics");
        System.out.println("Four Parameter Constructor");
    }

    Product(String productName, int productId, double price, String brand, String category) {
        System.out.println(productName + " " + productId + " " + price + " " + brand + " " + category);
    }
}