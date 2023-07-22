package StackPackage;
import java.util.Stack;
public class StackStandardPackage {
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(3);
        s.push(2);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
