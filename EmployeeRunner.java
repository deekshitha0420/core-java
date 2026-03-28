class EmployeeRunner {
    public static void main(String[] args) {
        Employee ref = new Employee();

        ref.name = "Anita";
        ref.id = 501;
        ref.department = "HR";
        ref.salary = 35000;
        ref.company = "Infosys";
        ref.designation = "Manager";
		ref.display();

        
    }
}