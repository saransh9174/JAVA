class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void makeSound() { // Method overriding
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes sound

        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks

        Animal animalDog = new Dog(); // Polymorphic reference
        animalDog.makeSound(); // Output: Dog barks
    }
}
