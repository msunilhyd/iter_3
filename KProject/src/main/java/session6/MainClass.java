package session6;

public class MainClass {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.goFast();
        car1.soundHorn();
    }
}
// Abstraction = Interface, providing functionality, hiding implementation
// Inheritance = Child class extending Parent Class
// Encapsulation = private attributes, getters and setters
interface Vehicle {

    public void soundHorn();

    public void goFast();
}

class Car implements Vehicle {

    @Override
    public void soundHorn() {
        System.out.println("Sounding Horn");
    }

    @Override
    public void goFast() {
        System.out.println("Going Fast");
    }
}

