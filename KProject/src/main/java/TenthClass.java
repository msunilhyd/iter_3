public class TenthClass {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        vehicle1.vehicleName = "Tesla";
        vehicle1.vehicleType = "Car";
        vehicle1.noOfWheels = 4;
        vehicle1.isElectric = true;
        System.out.println(vehicle1);
    }
}

class Vehicle {
    public String vehicleName;
    public String vehicleType;
    public int noOfWheels;
    public boolean isElectric;

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", noOfWheels=" + noOfWheels +
                ", isElectric=" + isElectric +
                '}';
    }
}
