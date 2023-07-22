package StackPackage;

import java.util.Stack;

public class DuplicateParentheses {
    public static boolean is_duplicate(String str)
    {
        //O(n)
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' ||
                    str.charAt(i) == 'b' ||
                    str.charAt(i) == 'c' ||
                    str.charAt(i) == 'd' ||
                    str.charAt(i) == '+' ||
                    str.charAt(i) == '(' ||
                    str.charAt(i) == '-' ||
                    str.charAt(i) == '*' ||
                    str.charAt(i) == '/'
            )
            {
                s.push(str.charAt(i));
            }
            else{
                if(s.isEmpty())
                    return true;
                if((str.charAt(i) == ')' &&
                        (s.peek() == 'a'
                                || s.peek() == 'b'
                                || s.peek() == 'c'
                                || s.peek() == 'd'
                                || s.peek() == '+'
                                || s.peek() == '-'
                                || s.peek() == '/'
                                || s.peek() == '*'
                        )
                )) {
                    while ((str.charAt(i) == ')' &&
                            (s.peek() == 'a'
                                    || s.peek() == 'b'
                                    || s.peek() == 'c'
                                    || s.peek() == 'd'
                                    || s.peek() == '+'
                                    || s.peek() == '-'
                                    || s.peek() == '/'
                                    || s.peek() == '*'
                            )
                    )
                    ) {
                        s.pop();
                    }
                }
                else
                        return true;
                if(s.peek() == '(')
                    s.pop();
            }

        }
        if (s.isEmpty())
            return false;
        else
            return true;
    }
    public static boolean is_duplicate_good_looking(String str)
    {
        //O(n)
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if(str.charAt(i) != ')')
            {
                s.push(str.charAt(i));
            }
            else{
                //Valid Parenthesis
//                if(s.isEmpty())
//                    return true;
                while (s.peek() != '(')
                {
                    s.pop();
                    count++;
                }
                if(str.charAt(i) == '(' && count > 1){
                    s.pop();
                }
                else
                    return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        System.out.println(is_duplicate_good_looking(str));
    }
}
