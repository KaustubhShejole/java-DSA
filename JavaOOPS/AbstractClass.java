package JavaOOPS;

public class AbstractClass {

    public static void main(String[] args) {
        Horse h =new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.setColor("dark brown");
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }

}

abstract class Animal1{
    String color;
    Animal1(){
        this.color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }



    abstract void walk();
}

class Horse extends Animal1{
    void setColor(String color) {
        this.color = color;
    }
    void walk(){
        System.out.println("walks in 4 legs");
    }
}

class Chicken extends Animal1{
    void setColor(String color) {
        this.color = color;
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}