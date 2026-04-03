 class CricketRunner {
    static String format = "ODI";

    public static void main(String[] args) {
        Cricket obj = new Cricket();
        obj.setDetails("Rohit Sharma", "Batsman", 10000, 250, "India");
        System.out.println("Format: " + format);
        obj.displayDetails();
    }
}