package StackPackage;
import java.util.*;
public class ReverseAStringUsingStack {

    public static String reverse_string_using_stack(String string)
    {
        Stack<Character> s = new Stack();
        for (int i = 0; i < string.length(); i++) {
            s.push(string.charAt (i));
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty())
        {
            result.append(s.peek());
            s.pop();
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "abcde";
        str = reverse_string_using_stack(str);
        System.out.println(str);
    }
}
