package inheritance;
class animal {
    void eat() {
        System.out.println(" Animal eating");
    }

}
class dog extends animal {
    void bark() {
        System.out.println(" dog barking");
    }
}

public class singleinheritance {
    public static void main(String args[]) {
        dog d = new dog();
        d.bark();
        d.eat();
    }
    
}
