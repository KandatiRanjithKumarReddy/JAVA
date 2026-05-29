public class Main {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.name = "ranjith";
        // s1.details();
        // System.out.println();
        // Student s2 = new Student();
        // s1.name = "Rajat";
        // s1.details();
        // System.out.println();
        // s1.name = "kandati ranjith Kumar reddy";
        // Student.role = "SWE";
        // s1.details();
        System.out.println(Student.role);

    }
}
// static = Belongs to class - Automatically Loaded into memory - no Need Of
// Object Creation
// if the method or variable is static we can access it without creating an
// object

class Student {
    String name;
    static String role = "Developer";

    void details() {
        System.out.println("Name : " + name + " " + "Role : " + role);
    }
}

// static fields (variables or Methods ) stored in = Method Area -fixed-share to
// multiple objects
// object fields (variables or Methods ) stored in = Heap Area;
