package oops;

@FunctionalInterface
interface Greeter {
    void greet(String name);
}

public class lambda {
    public static void main(String[] args) {
        
        // Using Lambda Expression
        Greeter g = (name) -> System.out.println("Hello, " + name);
        
        g.greet("Grok");
    }
}

