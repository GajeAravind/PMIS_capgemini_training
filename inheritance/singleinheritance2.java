package inheritance;

class Animal {
    String name;

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
public class singleinheritance2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        System.out.println("Dog's name: " + dog.name);
        dog.eat();
        dog.bark();
    }
    
}
