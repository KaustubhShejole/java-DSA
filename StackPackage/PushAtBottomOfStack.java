package StackPackage;
import java.util.Stack;
public class PushAtBottomOfStack
{
    public static void push_at_bottom(Stack<Integer> s,int item)
    {
        if(s.isEmpty())
        {
            s.push(item);
            return;
        }
        int val = s.pop();
        push_at_bottom(s,item);
        s.push(val);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(3);
        s.push(2);
        push_at_bottom(s,4);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}