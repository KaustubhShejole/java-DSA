package JavaOOPS;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse1 horse1 = new Horse1();
        System.out.println(horse1.color);
    }
}

class Animal2{
    String color;
    Animal2(){
        System.out.println("animal2 constructor called");
    }
}
class Horse1 extends Animal2{
    Horse1(){
        super();//By default
        super.color = "Green";
        System.out.println("Horse1 constructor called");
    }
}