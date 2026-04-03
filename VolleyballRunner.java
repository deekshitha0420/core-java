 class VolleyballRunner {
    static String league = "Pro League";

    public static void main(String[] args) {
        Volleyball v = new Volleyball();
        v.setDetails("India Team", "Rahul", 60, 40, "India");
        System.out.println("League: " + league);
        v.displayDetails();
    }
}