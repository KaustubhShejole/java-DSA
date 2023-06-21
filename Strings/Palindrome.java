package Strings;

public class Palindrome {

    public static boolean palindrome(String str)
    {
        int length = str.length();
        for(int i=0;i<length/2;i++)
        {
            if(str.charAt(i) != str.charAt(length-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        String str = "noon";
        if(palindrome(str))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }

    }
}
