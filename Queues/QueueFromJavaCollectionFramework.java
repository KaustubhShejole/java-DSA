package Queues;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class QueueFromJavaCollectionFramework {
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>();
        // Queue is an interface two classes implementing Queues
        // 1.Array dequeues 2. Linked List

        Queue<Integer> q = new ArrayDeque<>();
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
