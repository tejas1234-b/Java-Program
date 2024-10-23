
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}


class Mammal extends Animal {
    int age;

    Mammal(String name, int age) {
        super(name); 
        this.age = age;
    }

    void walk() {
        System.out.println(name + " is walking.");
    }
}


class Dog extends Mammal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " the " + breed + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Max", 3, "Golden Retriever");
        myDog.eat();   
        myDog.walk();  
        myDog.bark(); 
        System.out.println("Name: " + myDog.name);
        System.out.println("Age: " + myDog.age);
        System.out.println("Breed: " + myDog.breed);
    }
}
