class Restaurant {

    String ownerName;
    String location;
    int employees;
    boolean isVeg;
    int seatingCapacity;
    double rating;

    // Parameterized Constructor
    Restaurant(String ownerName, String location, int employees, boolean isVeg, int seatingCapacity, double rating) {
        this.ownerName = ownerName;
        this.location = location;
        this.employees = employees;
        this.isVeg = isVeg;
        this.seatingCapacity = seatingCapacity;
        this.rating = rating;
    }

    // Method to display details
    void display() {
        System.out.println("Name: Udupi");
        System.out.println("Location: Tumkur");
        System.out.println("Employees: " + employees);
        System.out.println("Food Type (Veg=true / Non-veg=false): " + isVeg);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Ratings: " + rating);
    }
}