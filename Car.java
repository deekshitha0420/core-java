class Car {

    String carName;
    int model;
    double price;
    String color;
    String fuelType;

    Car() {
        this("Swift", 2020);
        System.out.println("Default Constructor");
    }

    Car(String carName, int model) {
        this(carName, model, 800000);
        System.out.println("Two Parameter Constructor");
    }

    Car(String carName, int model, double price) {
        this(carName, model, price, "White");
        System.out.println("Three Parameter Constructor");
    }

    Car(String carName, int model, double price, String color) {
        this(carName, model, price, color, "Petrol");
        System.out.println("Four Parameter Constructor");
    }

    Car(String carName, int model, double price, String color, String fuelType) {
        System.out.println(carName + " " + model + " " + price + " " + color + " " + fuelType);
    }
}