/*
Implement the classes and methods detailed in the diagram (available on HackerRank).

You will be given a partially completed code in the editor where the main method
takes the name of a state (i.e., WestBengal, or AndhraPradesh) and prints the
national flower of that state using the classes and methods written by you.

Note: Do not use access modifiers in your class declarations.
 */

class Flower {
    String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}

class Region {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}
