package JavaOOPS;

public class Polymorphism {

    public static void main(String args[]){

//        Calculator calc = new Calculator();
//        System.out.println(calc.sum(1,2));
//        System.out.println(calc.sum((float) 1,(float) 2.5));
//        System.out.println(calc.sum(1,3,2));

        Deer myDeer = new Deer();
        myDeer.eat();

    }
}

class Calculator{

    //function overloading
    //compile time polymorphism

    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c) {
        return a + b + c;
    }
}


//Method Overriding
//Both parent and child have method with same name and same parameters

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}