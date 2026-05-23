public class composition {
    public static void main(String[] args) {

        Student s = new Student("Ranjith", "123456");
        System.out.println(s);

    }
}

//Composition
//One object strongly owns another object.

class Passport {
    private String number;

    Passport(String number) {
        this.number = number;
    }
}

class Student {
    private String name;
    private Passport passport;
    //created here
    public Student(String name, String passportNum) {
        this.name = name;
        this.passport = new Passport(passportNum);
    }
}