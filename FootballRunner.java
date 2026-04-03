 class FootballRunner {
    static String country = "Spain";

    public static void main(String[] args) {
        Football obj = new Football();
        obj.setDetails("Barcelona", "Xavi", 85, 38, "La Liga");
        System.out.println("Country: " + country);
        obj.displayDetails();
    }
}