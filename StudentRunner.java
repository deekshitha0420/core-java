class StudentRunner {
    public static void main(String[] args) {
        new Student();
        System.out.println("-----------");
        new Student("Ravi", 2);
        System.out.println("-----------");
        new Student("Kiran", 3, "BSc");
        System.out.println("-----------");
        new Student("Sneha", 4, "BCom", "XYZ College");
        System.out.println("-----------");
        new Student("Arjun", 5, "BBA", "PQR College", 90.2);
    }
}