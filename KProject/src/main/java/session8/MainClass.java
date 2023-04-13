package session8;

// Runtime Polymorphism
public class MainClass {
    public static void main(String[] args) {
        Animal anim1 = new Animal();
        anim1.makeSound();

        Animal horse = new Horse();
        horse.makeSound();

        Animal dog = new Dog();
        dog.makeSound();
    }
}
