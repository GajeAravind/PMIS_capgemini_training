package oops;

// @FunctionalInterface
// interface Greeter {
//     void greet(String name);
// }

// public class lambda {
//     public static void main(String[] args) {
        
//         // Using Lambda Expression
//         Greeter g = (name) -> System.out.println("Hello, " + name);
        
//         g.greet("Grok");
//     }
// }

// import java.util.function.Predicate;

// public class lambda {
//     public static void main(String[] args) {

//         // Built-in Functional Interface: Predicate
//         // Predicate<T> → takes one input and returns boolean (true/false)

//         Predicate<Integer> isAdult = age -> age >= 18;

//         System.out.println(isAdult.test(20));  // true
//         System.out.println(isAdult.test(15));  // false
//     }
// }
// In Java, Function<T, R> is a built-in functional interface located in the java.util.function package. It represents a functional operation that takes one argument of type T and returns a result of type R

// import java.util.function.Function;

// public class lambda {
//     public static void main(String[] args) {

//         // Function<T, R> → takes input of type T and returns result of type R
//         // Method: apply()

//         Function<String, Integer> getLength = name -> name.length();

//         System.out.println(getLength.apply("Java"));  // 4
//         System.out.println(getLength.apply("John"));  // 4
//     }
// }
// import java.util.function.BiFunction;

// public class lambda {
//     public static void main(String[] args) {

//         // BiFunction takes 2 inputs and returns 1 output
//         // Here: length and breadth → returns Area
//         BiFunction<Integer, Integer, Integer> area = (length, breadth) -> length * breadth;

//         System.out.println("Area = " + area.apply(10, 5));   // 50
//         System.out.println("Area = " + area.apply(7, 3));    // 21
//     }
// }

// Consumer
// import java.util.function.Consumer;

// class lambda {
//     public static void main(String[] args) {

//         Consumer<String> smsNotifier = mobNo -> {
//             System.out.println("Sending the OTP to the phone number: " + mobNo);
//         };

//         smsNotifier.accept("+919346852688");
//     }
// }
// import java.util.Random;
// import java.util.function.Supplier;

// class Lambda {
//     public static void main(String[] args) {
//         Supplier<String> otpGen = () -> {
//             Random random = new Random();
//             int number = 100000 + random.nextInt(900000);  // generates 6-digit OTP (100000–999999)
//             return String.valueOf(number);
//         };

//         String userOtp = otpGen.get();
//         System.out.println("The OTP is: " + userOtp);
//     }
// }
// import java.util.*;
// import java.util.stream.Collectors;

// class Lambda {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 5);

//         List<Integer> result = nums.stream()
//                                    .filter(n -> n % 2 == 0)   // keep even numbers
//                                    .map(n -> n * n)           // square them
//                                    .collect(Collectors.toList());

//         System.out.println(result);   // Output: [4, 16]
//     }
// }
// import java.util.*;
// import java.util.stream.Collectors;

// class Lambda {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 5);

//         List<Integer> res = nums.stream()
//                 .filter(n -> n % 2 == 0)   // keep even numbers
//                 .map(n -> n * n)           // square them
//                 .collect(Collectors.toList());

//         System.out.println("OG List: " + nums);
//         System.out.println("Result: " + res);
//     }
// }
// import java.util.List;
// import java.util.stream.Collectors;

// class lambda {
//     public static void main(String[] args) {
//         List<Integer> nums = List.of(5, 12, 8, 3, 20, 7);

//         List<Integer> result = nums.stream()
//             .filter(n -> n >= 7)
//             .collect(Collectors.toList());
            
//         System.out.println(result);
//     }
// }

import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {

        // List of numbers
        List<Integer> nums = List.of(5, 12, 8, 3, 4, 5);

        // Map: Transform each item
        List<Integer> res = nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        // Print the result
        System.out.println(res);
    }
}
