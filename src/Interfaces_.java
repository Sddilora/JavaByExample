// In the Java programming language, an interface is a reference type, similar to a class, 
// that can contain only constants, method signatures, default methods, static methods, and nested types.
// Method bodies exist only for default methods and static methods. Interfaces cannot be instantiated
// they can only be implemented by classes or extended by other interfaces.

public class Interfaces_ {

    public OperateBMW760i car = new OperateBMW760i();

    public static void main(String[] args) {
        OperateBMW760i.turn(Direction.LEFT, 1.0, 1.0, 1.0);
    }
}

// Declaring an interface is similar to declaring a new class.
interface OperateCar {

    // constant declarations, if any

    // method signatures

    // An enum with values RIGHT, LEFT
    int turn(Direction direction,
                double radius,
                double startSpeed,
                double endSpeed);
    int changeLanes(Direction direction,
                    double startSpeed,
                    double endSpeed);
    int signalTurn(Direction direction,
                    boolean signalOn);
    int getRadarFront(double distanceToCar,
                        double speedOfCar);
    int getRadarRear(double distanceToCar,
                        double speedOfCar);
    // more method signatures
}

// To use an interface, you write a class that implements the interface.
// When an instantiable class implements an interface, it provides a method body for ""each of the methods!!""" declared in the interface.
class OperateBMW760i implements OperateCar {

    // the OperateCar method signatures, with implementation --
    // for example:
    public int signalTurn(Direction direction, boolean signalOn) {
        return 0;
    }

    public static void turn(int left, double radius, double startSpeed, double endSpeed) {
    }

    public int getRadarFront(double distanceToCar, double speedOfCar) {
        return 0;
    }

    public int getRadarRear(double distanceToCar, double speedOfCar) {
        return 0;
    }

    public int changeLanes(Direction direction, double startSpeed, double endSpeed) {
        return 0;
    }

    public int turn(Direction direction, double radius, double startSpeed, double endSpeed) {
        return 0;
    }

    // other members, as needed -- for example, helper classes not 
    // visible to clients of the interface
}

class Direction {
    public static final int RIGHT = 0;
    public static final int LEFT = 1;
}

// In the robotic car example above, it is the automobile manufacturers who will implement the interface.
// Chevrolet's implementation will be substantially different from that of Toyota, of course, but both manufacturers
// will adhere to the same interface. The guidance manufacturers, who are the clients of the interface, will build systems 
// that use GPS data on a car's location, digital street maps, and traffic data to drive the car. In so doing, 
// the guidance systems will invoke the interface methods: turn, change lanes, brake, accelerate, and so forth.