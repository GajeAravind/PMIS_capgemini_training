package inheritance;

class shape{
    String color = "red";
}
class circle extends shape{
    void drawcircle(){
        System.out.println("Drawing Circle");
    }
}
class square extends shape{
    void drawsquare(){
        System.out.println("Drawing  a " + color + " Square");
    }
}


public class HierarchicalInheritance {
    public static void main(String args[]){
        circle c = new circle();
        c.drawcircle();
        System.out.println(c.color);
        square s = new square();
        s.drawsquare();
    }
    
}
