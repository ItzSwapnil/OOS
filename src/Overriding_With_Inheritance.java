// Demonstrate method overriding with inheritance

class Animals {

    public String sound() {
        return "Animals make sound";
    }
}

class Dogs extends Animals {
    @Override
    public String sound() {
        return "Bark";
    }
}

class Cats extends Animals {
    @Override
    public String sound() {
        return "Meow";
    }
}

public class Overriding_With_Inheritance {
    public static void main(String[] args) {
        Animals genericAnimals = new Animals();
        Animals dogs = new Dogs();
        Animals cats = new Cats();

        System.out.println("Generic Animals: " + genericAnimals.sound());
        System.out.println("Dogs: " + dogs.sound());
        System.out.println("Cats: " + cats.sound());
    }
}

/*
Output:
Generic Animals: Animals make sound
Dogs: Bark
Cats: Meow
 */