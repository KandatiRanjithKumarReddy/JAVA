// 5. Dependency Inversion Principle (DIP)

// Definition:
// High-level modules should not depend on low-level modules. 
// Both should depend on abstractions.

// Explanation:
// Instead of directly depending on concrete classes, 
// we should depend on interfaces or abstract classes. 
// This makes the system more flexible and decoupled.

public class D {
    public static void main(String[] args) {

        Keyboard k = new WiredKeyboard();
        Computer c = new Computer(k);

        c.start();
    }
}

interface Keyboard {
    void connect();
}

class WiredKeyboard implements Keyboard {
    @Override
    public void connect() {
        System.out.println("Connected via wire.");
    }
}

class WirelessKeyboard implements Keyboard {
    @Override
    public void connect() {
        System.out.println("Connected via Bluetooth.");
    }
}

class Computer {
    private Keyboard keyboard;

    Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    void start() {
        keyboard.connect();
    }
}

// The Computer class does not depend on one fixed keyboard type.
// It works with any keyboard that follows the Keyboard rules.
// WiredKeyboard and WirelessKeyboard both can be used.
// Because of this, the Computer class does not need changes when a new keyboard
// is added.
// The keyboard object is given to the computer from outside.
// This makes the code more flexible and reusable.
// It also makes testing easier because different keyboard types can be used
// anytime.
// The main idea is to avoid hardcoding one specific object inside another class
// so the program becomes easier to manage and extend later.

// The SOLID principles help in building scalable, maintainable, and flexible
// software.
// SRP ensures that classes have a single responsibility.
// OCP allows extending functionality without modifying existing code.
// LSP ensures that subclasses do not break the behavior of base classes.
// ISP prevents forcing classes to implement unnecessary methods.
// DIP promotes dependency on abstractions rather than concrete implementations.
// used to write clean code
