package Queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackAndQueueUsingDeque {
    static class Stack{
        static Deque<Integer> d = new LinkedList<>();
        public static boolean isEmpty(){
            return d.isEmpty();
        }
        public static void push(int data)
        {
            d.addLast(data);
        }
        public static int pop()
        {
            int top = d.getLast();
            d.removeLast();
            return top;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("stack is empty");
                return Integer.MIN_VALUE;
            }
            return d.getLast();
        }
    }

    static class Queue{
        Deque<Integer> d = new LinkedList<>();
        public boolean isEmpty(){
            return d.isEmpty();
        }
        public void add(int data)
        {
            d.addLast(data);
        }
        public int remove()
        {
            int top = d.getFirst();
            d.removeFirst();
            return top;
        }
        public int peek()
        {
            if (isEmpty()){
                System.out.println("queue is empty");
                return Integer.MIN_VALUE;
            }
            return d.getFirst();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(4);
        s.push(3);
        s.push(2);
        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek = "+s.peek());
        while (!q.isEmpty()){
            System.out.println("peek = "+ q.peek());
            q.remove();
        }
    }
}
