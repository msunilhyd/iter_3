package session8;

public class Animal {
    public void makeSound() {
        System.out.println("Animal is making sound");
    }
}

class Horse extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Horse is making sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}
