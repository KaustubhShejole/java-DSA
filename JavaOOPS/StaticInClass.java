package JavaOOPS;

public class StaticInClass {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.schoolName = "VNIT";

        Student1 student11 = new Student1();
        System.out.println(student11.schoolName);
        System.out.println(student11.returnPercentage(100,97,89));
    }
}

class Student1{

    static int returnPercentage(int math,int phy,int chem){
        return (math+phy+chem)/3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}