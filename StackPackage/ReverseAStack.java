package StackPackage;

import java.util.Stack;

public class ReverseAStack {

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
    public void reverse_a_stack(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top = s.peek();
        s.pop();
        reverse_a_stack(s);
        push_at_bottom(s,top);
    }
    public static void printStack(Stack<Integer> s)
    {
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(5);
        s.push(9);
        ReverseAStack ras = new ReverseAStack();
        ras.reverse_a_stack(s);
        printStack(s);
    }
}
