// Normal interface for animal sound
interface Animal {
    void animalSound();
}

// Functional interface for sleeping (only 1 method)
@FunctionalInterface
interface Sleeper {
    void sleep();
}

// Pig class implements Animal
class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: baaa baa");
    }
}

public class InterfaceWithLambda {
    public static void main(String[] args) {
        // Normal class-based object
        Pig myPig = new Pig();
        myPig.animalSound();

        // Lambda-based implementation for sleeping
        Sleeper lamb = () -> System.out.println("Zzzzz");
        lamb.sleep();
    }
}
