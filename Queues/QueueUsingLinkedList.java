package Queues;

public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;


        Node(int data)
        {
            this.data = data;
        }

    }
    static class Queue{
        public static Node head = null;
        public static Node tail = null;

        public static boolean isEmpty(){
            return head== null && tail==null;
        }
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            //single element
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }
        public static int peek()
        {
            if (isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
