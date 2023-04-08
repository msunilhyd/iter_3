package session2;

public class Vehicle {

    public String vehicleName;
    public int noOfTyres;

    public void soundHorn() {
        System.out.println("Sounding Horn Pom");
    }

    public Vehicle(String vehicleName, int noOfTyres) {
        this.vehicleName = vehicleName;
        this.noOfTyres = noOfTyres;
    }
}
