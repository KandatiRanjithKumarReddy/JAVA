// Liskov Substitution Principle (LSP)
// subtypes should be substitutable for their base types 
//  - without altering the correctness of the program.

// public class L{
//     public static void main(String[]
//  args) {
//         Bird obj_pengiun = new penguin();
//         obj_pengiun.fly();
//     }
// }

//  Example (Violation of LSP)
//  Imagine a Bird class with a method fly().
//   If we create a subclass Penguin that cannot fly, we break LSP:

// class Bird{
//     void fly(){
//         System.out.println("I  flying");
//     }
// }

// class penguin extends Bird{
//     @Override
//     void fly(){
//         throw new UnsupportedOperationException("can't fly ");
//     }
// }




// Base Bird class
class Bird {

    // Common behavior for all birds
    void eat() {
        System.out.println("I am eating!");
    }
}

// Interface for flying birds
interface Flyable {

    // Method declaration
    void fly();
}

// Sparrow is a flying bird
class Sparrow extends Bird implements Flyable {

    // Overriding fly method
    @Override
    public void fly() {
        System.out.println("I am flying!");
    }
}

// Penguin is a non-flying bird
class Penguin extends Bird {

    // No fly() method because penguins cannot fly
}

// Main class
public class L {

    public static void main(String[] args) {

        // Creating Sparrow object
        Bird sparrow = new Sparrow();

        // Type casting Bird to Flyable
        ((Flyable) sparrow).fly();

        // Calling inherited eat method
        sparrow.eat();

        // Creating Penguin object
        Bird penguin = new Penguin();

        // Penguin can eat
        penguin.eat();

        // Penguin cannot fly
        // ((Flyable) penguin).fly(); // This will give error
    }
}

// Now, LSP is preserved because no subclass breaks expected behavior.
// Use Case: Preventing unexpected crashes when substituting subclasses.