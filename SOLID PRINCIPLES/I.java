//4. Interface Segregation Principle (ISP)
// A class should not be forced to implement interfaces it does not use.

public class I {
    public static void main(String[] args) {
        printer p = new printer();
        p.prints();
        scanner s = new scanner();
        s.scans();
    }
}

interface print {
    void prints();
}

interface scan {
    void scans();
}

class printer implements print {
    @Override
    public void prints() {
        System.out.println("only Prints...");
    }
}

class scanner implements scan {
    @Override
    public void scans() {
        System.out.println("only scans...");
    }
}

// real life example
// import java.util.*;

// interface Worker {
// void work();
// void eat();
// }

// class Robot implements Worker {
// public void work() { System.out.println("Robot working"); }
// public void eat() { throw new UnsupportedOperationException("Robots don't
// eat!"); }
// }