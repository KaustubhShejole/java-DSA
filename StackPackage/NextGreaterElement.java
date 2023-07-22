package StackPackage;
import java.util.Stack;
public class NextGreaterElement
{
    public static void next_greater_element(int arr[],int nextGreater[])
    {
        Stack<Integer> s = new Stack<>();
        s.push(arr[arr.length - 1]);
        nextGreater[nextGreater.length - 1] = -1;
        for (int i = arr.length -2; i >= 0 ; i--) {
            if(arr[i] <= s.peek())
            {
                nextGreater[i] = s.peek();
                s.push(arr[i]);
            }
            else {
                while(!s.isEmpty() && arr[i] >= s.peek())
                {
                    s.pop();
                }
                if (s.isEmpty())
                {
                    s.push(arr[i]);
                    nextGreater[i] = -1;
                }
                else
                {
                    nextGreater[i] = s.peek();
                    s.push(arr[i]);
                }
            }
        }
    }

    public static void next_greater_element1(int arr[],int nextGreater[])
    {
        Stack<Integer> s = new Stack<>();
        s.push(arr[arr.length - 1]);
        nextGreater[nextGreater.length - 1] = -1;
        for (int i = arr.length -2; i >= 0 ; i--) {

                while(!s.isEmpty() && arr[i] >= s.peek())
                {
                    s.pop();
                }
                if (s.isEmpty())
                {
                    s.push(arr[i]);
                    nextGreater[i] = -1;
                }
                else
                {
                    nextGreater[i] = s.peek();
                    s.push(arr[i]);
                }
        }
    }
    public static void next_greater_element_using_index(int arr[],int nextGreater[])
    {
        Stack<Integer> s = new Stack<>();
        s.push(arr.length - 1);
        nextGreater[nextGreater.length - 1] = -1;
        for (int i = arr.length -2; i >= 0 ; i--) {

                while(!s.isEmpty() && arr[i] >= arr[s.peek()])
                {
                    s.pop();
                }
                if (s.isEmpty())
                {
                    nextGreater[i] = -1;
                }
                else
                {
                    nextGreater[i] = arr[s.peek()];
                }
                s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];
        next_greater_element_using_index(arr,nextGreater);
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}
//next Greater Right
//next Greater Left
//next smaller Right
//next smaller Left