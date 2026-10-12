package oops;
// Polymorphism in Java — Definition
// Polymorphism is an OOP concept in which one method or object can take many forms and perform different behaviors depending on the situation.
// There are two types of polymorphism in Java:
// 1. Compile-Time Polymorphism: It is achieved through method overloading, where multiple methods have the same name but different parameter lists.
// Example: add(int a, int b) and add(int a, int b, int c).
// 2. Runtime Polymorphism: It is achieved through method overriding, where a child class provides its own implementation of a method inherited from the parent class.
// Example: Dog and Cat override the makeSound() method of Animal.



// Compile-time Polymorphism (Method Overloading)
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    // Same method name with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Same method name with different parameter types
    double add(double a, double b) {
        return a + b;
    }
}

// Runtime Polymorphism (Method Overriding)
// class Animal {

//     void makeSound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {

//     @Override
//     void makeSound() {
//         System.out.println("Dog barks: Woof woof!");
//     }
// }

// class Cat extends Animal {

//     @Override
//     void makeSound() {
//         System.out.println("Cat meows: Meow meow!");
//     }
// }

public class Polymorphism {

    public static void main(String[] args) {

        // Compile-time polymorphism
        Calculator calc = new Calculator();

        System.out.println("Compile-time Polymorphism:");
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
        System.out.println(calc.add(10.5, 20.5));

        // Runtime polymorphism
        // System.out.println("\nRuntime Polymorphism:");

        // Animal pet1 = new Dog();
        // Animal pet2 = new Cat();
        // Animal pet3 = new Animal();

        // pet1.makeSound();
        // pet2.makeSound();
        // pet3.makeSound();
    }
}

