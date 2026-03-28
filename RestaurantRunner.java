class RestaurantRunner {

    public static void main(String[] args) {

        System.out.println("Restaurant details with parameters: vaibhav, Mandya, 15, true, 100, 9.0");

        // Creating object with parameters
        Restaurant r = new Restaurant("vaibhav", "Mandya", 15, true, 50, 4.3);

        // Calling method
        r.display();
    }
}