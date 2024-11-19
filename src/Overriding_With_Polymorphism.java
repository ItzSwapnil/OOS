//Demonstrate method overriding with polymorphism

class Animalz {
    public String sound() {
        return "Some sound";
    }
}

class Dogz extends Animalz {
    @Override
    public String sound() {
        return "Bark";
    }
}

class Catz extends Animalz {
    @Override
    public String sound() {
        return "Meow";
    }
}

public class Overriding_With_Polymorphism {
    public static void main(String[] args) {
        Animalz myAnimalz = new Animalz();
        Animalz myDogz = new Dogz();
        Animalz myCatz = new Catz();

        System.out.println("Animalz sound: " + myAnimalz.sound());
        System.out.println("Dogz sound: " + myDogz.sound());
        System.out.println("Catz sound: " + myCatz.sound());
    }
}

/*
Output:
Animalz sound: Some sound
Dogz sound: Bark
Catz sound: Meow
 */