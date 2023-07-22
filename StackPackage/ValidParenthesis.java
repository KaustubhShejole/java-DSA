package StackPackage;

import java.util.Stack;

public class ValidParenthesis {
    /*
    Given a string s containing just the characters '(',')','{','}','[' and ']',
    determine if the input string is valid.
    An input string is valid if:
        1. Open brackets must be closed by the same type of brackets.
        2. Open brackets must be closed in the correct order.
        3. Every close bracket has a corresponding open bracket of the same type.
     */
    public static boolean valid_parentheses(String str)
    {
        //O(n)
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(')
            {
                s.push(str.charAt(i));
            }
            else{
                if(s.isEmpty())
                    return false;
                if( (str.charAt(i) == ']' && s.peek() == '[' )
                        ||  (str.charAt(i) == '}' && s.peek() == '{' )
                        ||(str.charAt(i) == ')' && s.peek() == '(' )
                ){
                    s.pop();
                }else
                    return false;
            }

        }
        if (s.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String str = "{({})[]}";
        System.out.println(valid_parentheses(str));
    }
}