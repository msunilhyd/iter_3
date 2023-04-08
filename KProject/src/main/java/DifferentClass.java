public class DifferentClass {

    public static void main(String[] args) {

        Fish f1 = new Fish("Black", "Male", false);
        f1.makeSound();
    }
}
class Fish {
    public String color;
    public String gender;
    public boolean isFreshWater;

    public Fish(String color, String gender, boolean isFreshWater) {
        this.color = color;
        this.gender = gender;
        this.isFreshWater = isFreshWater;
        makeSound();
    }

    public void makeSound() {
        System.out.println("Making Hiss Sound");
    }
}