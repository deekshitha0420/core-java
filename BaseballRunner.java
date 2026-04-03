 class BaseballRunner {
    static String country = "USA";

    public static void main(String[] args) {
        Baseball obj = new Baseball();
        obj.setDetails("Yankees", "Aaron Judge", 62, 162, "MLB");
        System.out.println("Country: " + country);
        obj.displayDetails();
    }
}