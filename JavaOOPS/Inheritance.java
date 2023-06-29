package JavaOOPS;

public class Inheritance {

    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();

        Tuna t =new Tuna();


        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        dobby.breed = "German Shephard";
        System.out.println( dobby.breed +" "+"has "+dobby.legs);
    }
}

//Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }

    Animal(){
        System.out.println("Animal");
    }
}

//Derived Class /derived class or subclass
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }

    Fish(){
        System.out.println("Fish");
    }
}

class Mammals extends Animal{

    void walk(){
        System.out.println("walks");
    }
    int legs;

    Mammals(){
        System.out.println("Mammals");
    }
}

class Dog extends Mammals{
    String breed;
    Dog(){
        System.out.println("Dog");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }

    Bird(){
        System.out.println("Bird");
    }
}

class Tuna extends Fish{
    Tuna(){
        System.out.println("Tuna");
    }
}