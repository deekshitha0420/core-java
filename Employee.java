class Employee {

    String empName;
    int empId;
    double salary;
    String department;
    String company;

    Employee() {
        this("Ramesh", 201);
        System.out.println("Default Constructor");
    }

    Employee(String empName, int empId) {
        this(empName, empId, 30000);
        System.out.println("Two Parameter Constructor");
    }

    Employee(String empName, int empId, double salary) {
        this(empName, empId, salary, "HR");
        System.out.println("Three Parameter Constructor");
    }

    Employee(String empName, int empId, double salary, String department) {
        this(empName, empId, salary, department, "Infosys");
        System.out.println("Four Parameter Constructor");
    }

    Employee(String empName, int empId, double salary, String department, String company) {
        System.out.println(empName + " " + empId + " " + salary + " " + department + " " + company);
    }
}