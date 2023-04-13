package session9;

public class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();

        v1.soundHorn();
        v1.soundHorn(3);
        v1.soundHorn(4, "front");
    }
}
