class CarRunner {
    public static void main(String[] args) {
        new Car();
        System.out.println("-----------");
        new Car("i20", 2021);
        System.out.println("-----------");
        new Car("Creta", 2022, 1500000);
        System.out.println("-----------");
        new Car("Baleno", 2023, 900000, "Blue");
        System.out.println("-----------");
        new Car("Verna", 2024, 1800000, "Black", "Diesel");
    }
}