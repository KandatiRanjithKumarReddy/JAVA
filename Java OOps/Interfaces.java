public class Interfaces {
    public static void main(String[] args) {
        car c1 = new Swift();
        c1.Engine();
        c1.Seats();
        c1.mirrors();
        car.air_ballon();
    }
}

// Interface define rules and the classes implementing Those Interface Should
// Follow Those Rules
// the Interface methods Should not have body the (only Declaration) must be
// override in Implemented Classes
// 💥Through Interfaces We Can Achieve Abstraction
interface car {
    void Engine();

    void Seats();

    default void mirrors() {
        System.out.println("The Car Must Contain Mirrors If No Its Is Not an car");
    }

    // the static methods in interfaces we can access them directly in main method
    // without implementations in other classes
    public static void air_ballon() {
        System.out.println("Every Car Needs air balloons for Security of passengers");
    }
}

class Swift implements car {
    @Override
    public void Engine() {
        System.out.println("The Car Must Contain Engine! Electric cars are Not Safe");
    }

    @Override
    public void Seats() {
        System.out.println("The Car Must Contain Four Seats Minimum");
    }

}