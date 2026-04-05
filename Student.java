class Student {

    String name;
    int rollNo;
    String course;
    String college;
    double percentage;

    Student() {
        this("Anu", 1);
        System.out.println("Default Constructor");
    }

    Student(String name, int rollNo) {
        this(name, rollNo, "BCA");
        System.out.println("Two Parameter Constructor");
    }

    Student(String name, int rollNo, String course) {
        this(name, rollNo, course, "ABC College");
        System.out.println("Three Parameter Constructor");
    }

    Student(String name, int rollNo, String course, String college) {
        this(name, rollNo, course, college, 85.5);
        System.out.println("Four Parameter Constructor");
    }

    Student(String name, int rollNo, String course, String college, double percentage) {
        System.out.println(name + " " + rollNo + " " + course + " " + college + " " + percentage);
    }
}