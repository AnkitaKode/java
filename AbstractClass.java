abstract class Animal {

    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzzz");
    }
}

// Subclass
class Cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says:Meow Meow");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.animalSound();
        myCat.sleep();
    }
}
