import java.util.*;

public class ArraysCC {

    public static void update(int marks[],int nonChangable){
        nonChangable = 10;
        for(int i=0;i<marks.length;i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void print(int numbers[]){
        for(int i=0;i<numbers.length;i++) {
            System.out.print(numbers[i]+" ");

        }
        System.out.println();
    }
    public static void main(String args[]) {
        int marks[] = new int[49]; // O stored by default for integer
        //"" in string array
        //'' in character array
        int numbers[] = {1, 2, 3};
        int nonChangable = 5;
        update(numbers,nonChangable);
        print(numbers);
        System.out.println("nonChangable = " + nonChangable);

        System.out.println("length of the marks array = "+marks.length);


//        Scanner sc = new Scanner(System.in);
//        int phy;
//        phy = sc.nextInt();
//
//        marks[0] = phy; //phy
//        marks[1] = sc.nextInt(); //chem
//        marks[2] = sc.nextInt(); //math
//        System.out.println("phy : "+phy);
//        System.out.println("phy : "+marks[0]);
//        System.out.println("chem : "+marks[1]);
//        System.out.println("math : "+marks[2]);
//
//        marks[2] = marks[2]+1;
//
//        System.out.println("math : "+marks[2]);
//
//        int percentage = (marks[0] + marks[1] + marks[2])/3;
//        System.out.println("percentage = "+percentage+"%");



    }
}