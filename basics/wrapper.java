// What is a Wrapper Class in Java?
// A Wrapper Class in Java is a class that converts a primitive data type into an object.

// In simple words, wrapper classes allow us to use primitive data types as objects.
// 1. Eight Wrapper Classes
// Primitive Data Type	Wrapper Class
//Primitive	Wrapper	Autoboxing	Unboxing
// byte	Byte	byte → Byte	Byte → byte
// short	Short	short → Short	Short → short
// int	Integer	int → Integer	Integer → int
// long	Long	long → Long	Long → long
// float	Float	float → Float	Float → float
// double	Double	double → Double	Double → double
// char	Character	char → Character	Character → char
// boolean	Boolean	boolean → Boolean	Boolean → boolean
// public class Main {
//     public static void main(String[] args) {

//         // Primitive data type
//         int a = 100;

//         // Wrapper class object
//         Integer obj = Integer.valueOf(a);

//         System.out.println("Primitive value: " + a);
//         System.out.println("Wrapper value: " + obj);
//     }
// }
// Autoboxing and Unboxing
// Autoboxing: Converting a primitive data type (int) into a wrapper class object (Integer).

// Unboxing: Converting a wrapper class object (Integer) into a primitive data type (int).

// public class Main {
//     public static void main(String[] args) {

//         int a = 50;

//         // Autoboxing (int to Integer)
//         Integer obj = a;

//         System.out.println("Autoboxing: " + obj);

//         // Unboxing (Integer to int)
//         int b = obj;

//         System.out.println("Unboxing: " + b);
//     }
// }

public class wrapper {

    public static void main(String[] args) {

        // Primitive data types
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 400L;
        float e = 50.5f;
        double f = 60.5;
        char g = 'A';
        boolean h = true;

        // Autoboxing: Primitive to Wrapper Class
        Byte obj1 = a;
        Short obj2 = b;
        Integer obj3 = c;
        Long obj4 = d;
        Float obj5 = e;
        Double obj6 = f;
        Character obj7 = g;
        Boolean obj8 = h;

        System.out.println("----- Autoboxing -----");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj6);
        System.out.println(obj7);
        System.out.println(obj8);

        // Unboxing: Wrapper Class to Primitive
        byte x1 = obj1;
        short x2 = obj2;
        int x3 = obj3;
        long x4 = obj4;
        float x5 = obj5;
        double x6 = obj6;
        char x7 = obj7;
        boolean x8 = obj8;

        System.out.println("----- Unboxing -----");
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
        System.out.println(x6);
        System.out.println(x7);
        System.out.println(x8);
    }
}
