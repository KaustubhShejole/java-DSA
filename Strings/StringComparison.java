package Strings;

public class StringComparison {
    public static void main(String args[])
    {
        String s1 = "Kaustubh";
        String s2 = "Kaustubh"; //points to s1 also
        String s3 = new String("Kaustubh"); // new memory allocated

        if(s1 == s2) {
            System.out.println("Strings are equal"); //It would be there
        }else {
            System.out.println("Strings are not equal");
        }


        if(s1 == s3) {
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal"); //It would be there
        }

        if(s1.equals(s3)) { //Checks alphabetically
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal"); //It would be there
        }
    }
}
