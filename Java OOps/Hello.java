public class Hello {
    public static void main(String[] args) {

        Passport p = new Passport("1234567890");
        Student s = new Student("Ranjith", p);
        System.out.println(s);

    }
}
//Aggregation
// One object uses another object, but does not own it completely.

class Passport {
    private String number;

    Passport(String number) {
        this.number = number;
    }
}

class Student {
    private String name;
    private Passport passport;
    //we are using reference of the passport class
    public Student(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }
}