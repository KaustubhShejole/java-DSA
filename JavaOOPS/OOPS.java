package JavaOOPS;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1

        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());


        BankAccount myAcc = new BankAccount();
        myAcc.username = "KaustubhSHivshankarShejole";
        myAcc.setPassword("qdffffgh");
    }
}

class BankAccount{
    public String username;
    private String password;

    void setPassword(String password){
        this.password = password;
    }
}

/*


Access_Modifier,
 */
class Pen{
    private String color;
    private int tip;


    String getColor() {
        return color;
    }

    void setColor(String newColor){
        color  = newColor;
    }

    int getTip() {
        return tip;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

//class Student{
//    String name;
//    int age;
//    float percentage;
//
//    void calcPercentage(int phy,int chem,int math){
//        percentage = ((phy+chem+math)*100)/3;
//    }
//}