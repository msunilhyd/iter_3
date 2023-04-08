package session2;

public class MainClass {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Lorry", 8);
        v1.soundHorn();

        Car c1 = new Car("Benz", 4);
        c1.soundHorn();

        // Child class inheriting all the parent class's
        // attributes and methods is called Inheritance
    }
}
