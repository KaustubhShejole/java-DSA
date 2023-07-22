package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueuesinJCF {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank)
        {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        /*
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //by default ascending
        //add() O(logn) remove() O(logn) peek() O(1)

        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.peek()); //O(1)
            priorityQueue.remove();
        }
         */

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        //by default ascending
        //add() O(logn) remove() O(logn) peek() O(1)

        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.peek()); //O(1)
            priorityQueue.remove();
        }
    }
}
