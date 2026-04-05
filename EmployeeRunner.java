class EmployeeRunner {
    public static void main(String[] args) {
        new Employee();
        System.out.println("-----------");
        new Employee("Sita", 202);
        System.out.println("-----------");
        new Employee("Amit", 203, 45000);
        System.out.println("-----------");
        new Employee("Neha", 204, 60000, "IT");
        System.out.println("-----------");
        new Employee("Raj", 205, 70000, "Finance", "TCS");
    }
}