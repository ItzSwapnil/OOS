// Flyable example with a method called 'flyAbstract'

interface Flyable {
    void flyAbstract();
}

class Bird implements Flyable {
    @Override
    public void flyAbstract() {
        System.out.println("Bird is flying.");
    }
}

class Airplane implements Flyable {
    @Override
    public void flyAbstract() {
        System.out.println("Airplane is flying.");
    }
}

public class FlyAbstract {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable airplane = new Airplane();

        bird.flyAbstract();
        airplane.flyAbstract();
    }
}


/*
Output:
Bird is flying.
Airplane is flying.
 */