package session9;

// Compile Time Polymorphism
public class Vehicle {

    public void soundHorn() {
        System.out.println("Sounding Horn");
    }

    public void soundHorn(int n) {
        System.out.println("Sounding Horn " + n + "times");
    }

    public void soundHorn(int n, String str) {
        System.out.println("Sounding Horn " + n + "times " + str);
    }
}
