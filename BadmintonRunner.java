class BadmintonRunner {
    static String sport = "Badminton";

    public static void main(String[] args) {
        Badminton b = new Badminton();
        b.setDetails("PV Sindhu", "India", 300, 200, "Gopi Chand");
        System.out.println("Sport: " + sport);
        b.displayDetails();
    }
}