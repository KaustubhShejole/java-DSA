package StackPackage;

import java.util.Stack;

public class MaxAreaInHistogram {
    public static void next_smaller_element_from_left(int arr[],int nextSmallerFromLeft[])
    {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        nextSmallerFromLeft[0] = -1;
        for (int i = 1; i < arr.length ; i++) {
            while(!s.isEmpty() && arr[i] <= arr[s.peek()])
            {
                s.pop();
            }
            if (s.isEmpty())
            {
                nextSmallerFromLeft[i] = -1;
            }
            else
            {
                nextSmallerFromLeft[i] = s.peek();
            }
            s.push(i);
        }
    }
    public static void next_smaller_element_from_right(int arr[],int nextSmallerfromright[])
    {
        Stack<Integer> s = new Stack<>();
        s.push(arr.length - 1);
        nextSmallerfromright[nextSmallerfromright.length - 1] = arr.length;
        for (int i = arr.length -2; i >= 0 ; i--) {

            while(!s.isEmpty() && arr[i] <= arr[s.peek()])
            {
                s.pop();
            }
            if (s.isEmpty())
            {
                nextSmallerfromright[i] = arr.length;
            }
            else
            {
                nextSmallerfromright[i] = s.peek();
            }
            s.push(i);
        }
    }
    public static int max_area_in_histogram(int arr[])
    {
        int nextSmallerFromRight[] = new int[arr.length];
        int nextSmallerFromLeft[] = new int[arr.length];

        next_smaller_element_from_left(arr,nextSmallerFromLeft);
        next_smaller_element_from_right(arr,nextSmallerFromRight);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(nextSmallerFromLeft[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(nextSmallerFromRight[i] + " ");
        }
        System.out.println();

        int max_area = 0;
        for (int i = 0; i < arr.length; i++) {
            int width;
//            if(nextSmallerFromLeft[i] >=0 && nextSmallerFromRight[i] >= 0)
//            {
//                width = nextSmallerFromRight[i] - nextSmallerFromLeft[i] -1;
//            } else if (nextSmallerFromLeft[i] == -1 && nextSmallerFromRight[i] >= 0) {
//                width = 1;
//            }else {
//                width = 1 ;
//            }
            width = nextSmallerFromRight[i] - nextSmallerFromLeft[i] - 1;
            int height = arr[i];
            int area = height * width;
            max_area = Math.max(max_area,area);
        }
        return max_area;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        System.out.println("Maximum Area in a histogram is " +max_area_in_histogram(arr));
    }
}
