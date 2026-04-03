 class HockeyRunner {
    static String format = "International";

    public static void main(String[] args) {
        Hockey h = new Hockey();
        h.setDetails("India", "Harmanpreet", 120, 80, "Graham Reid");
        System.out.println("Format: " + format);
        h.displayDetails();
    }
}