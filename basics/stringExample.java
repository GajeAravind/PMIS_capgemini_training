// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class StringExample {

//    public static void main(String[] var0) {
//       String var1 = new String("Aravind");
//       String var2 = new String("india");
//       System.out.println(var1.toUpperCase());
//       System.out.println(var2.toLowerCase());
//       System.out.println(var1.charAt(0));
//       System.out.println(var1.length());
//       System.out.println(var2.substring(0, 5));
//       System.out.println(var1.concat(var2));
//       System.out.println(var1.equals(var2));
//       System.out.println(var1.equalsIgnoreCase(var2));
//       System.out.println(var1.compareTo(var2));
//    }
public static void main(String[] args) {
     StringBuffer obj = new StringBuffer("Aravind");
     StringBuffer obj1 = new StringBuffer("India");
     System.out.println(obj.append(obj1));
     System.out.println(obj.reverse());
     System.out.println(obj.insert(0, "Hello"));
     System.out.println(obj.delete(0, 5));
     System.out.println(obj.replace(0, 5, "Hello"));
     System.out.println(obj.capacity());
    System.out.println(obj.length());
}

