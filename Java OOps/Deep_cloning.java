public class Deep_cloning {

    public static void main(String[] args) throws CloneNotSupportedException {

        Passport p = new Passport("568");

        Student s = new Student("Ranjith Kumar Reddy", p);

        Student copiedStudent = (Student) s.clone();

        System.out.println(s.name);
        System.out.println(s.passport.passportNumber);

        // changed
        copiedStudent.name = "Kandati Ranjith Kumar Reddy";
        copiedStudent.passport.passportNumber = "91011";

        System.out.println(copiedStudent.name);
        System.out.println(copiedStudent.passport.passportNumber);

    }
}

class Passport {

    String passportNumber;

    Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}

class Student implements Cloneable {

    String name;
    Passport passport;

    Student(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // shallow copy
        Student cloned = (Student) super.clone();

        // deep copy
        cloned.passport = new Passport(this.passport.passportNumber);

        return cloned;
    }
}