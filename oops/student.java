package oops;
//  What is a Class?
// Definition: A class is a blueprint or template used to create objects. It contains variables and methods that define the properties and behavior of objects.
// Example: Student is a class that defines a student's name, age, and details.
// 2. What is an Object?
// Definition: An object is an instance of a class. It has its own values for variables and can access the methods defined in the class.

 class student {
     // Variables
    String name;
    int age;

    // Method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
      public static void main(String[] args) {

        // Creating an object
        student s1 = new student();

        // Assigning values
        s1.name = "Aravind";
        s1.age = 24;

        // Calling the method
        s1.displayDetails();
    }
    
}
// Code	Explanation
// class Student	Creates a class named Student
// String name	Stores the student's name
// int age	Stores the student's age
// displayDetails()	Method that displays student details
// Student s1	Declares an object reference
// new Student()	Creates a new Student object
// s1.name = "Aravind"	Assigns a name to the object
// s1.displayDetails()	Calls the object's method
