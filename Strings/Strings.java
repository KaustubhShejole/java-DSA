package Strings;

import java.util.Scanner;

public class Strings {

    public static void printLetters(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static void main(String args[]) {
//        //Declaration Examples
//        char arr[] = {'a', 'b', 'c', 'd'};
//        String str = "abcd";
//        String str2 = new String("xyz");
//
//        //Strings are immutable (Strings do not change , we have to define new String)
//
//        //Taking input as a String
//        Scanner sc = new Scanner(System.in);
//
//        String name;
//        name = sc.next(); //Takes first word only
//        System.out.println(name);
//
//        String line;
//        line = sc.nextLine();//Takes complete line as an input
//        System.out.println(line);
//
//        String fullname = "Kaustubh Shivshankar Shejole";
//        System.out.println(fullname.length());

        //Concatenation

        String firstName = "KAUSTUBH";
        String middleName = "SHIVSHANKAR";
        String lastName = "SHEJOLE";
        String fullName = firstName +" "+ middleName +" "+ lastName;
        System.out.println(fullName);
        System.out.println(fullName.charAt(2));
        printLetters(firstName);
    }
}
