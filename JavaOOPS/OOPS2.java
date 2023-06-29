package JavaOOPS;

public class OOPS2 {

    public static void main(String[] args) {

        Student s1 = new Student("Kaustubh Shivshankar Shejole");
        System.out.println(s1.name);
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 98;
        Student s2 = new Student(s1);

        for (int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

        s1.marks[1] = 95;

        for (int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student{
    String name;
    int roll;
    int marks[];

    //constructor overloading
    //example of polymorphism (multiple forms)
    Student(){
        marks = new int[3];
        System.out.println("constructor called ...");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
    Student(String name,int roll){
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }

    //shallow copy constructor
//    Student(Student s1){
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.marks = s1.marks;
//    }

    //deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

}