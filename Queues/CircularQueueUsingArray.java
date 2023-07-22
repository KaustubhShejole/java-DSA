package Queues;

public class CircularQueueUsingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n)
        {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //add
        public static void add(int data){
            if(isFull())
                System.out.println("Queue is full");
            //add 1st element
            if (front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
//            System.out.println("Added "+arr[rear]);
        }

        //remove
        public static int remove()
        {
//            System.out.println("rear ="+rear+"front = "+front);
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];
//            System.out.println("result = "+result);
//            front = (front +1)%size;
//            //last element delete
//            if ((rear+1)%size == front){
////                System.out.println("rear ="+rear+"front = "+front);
//                rear = front = -1;
////                System.out.println("rear ="+rear+"front = "+front);
//            }
            if (front == rear){
                rear = front = -1;
            }else {
                front = (front+1)%size;
            }

//            System.out.println("Removed "+result);
            return result;
        }

        //peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
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
