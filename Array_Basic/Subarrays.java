package Array_Basic;

import java.util.*;
public class Subarrays {

    public static void print_subarrays(int numbers[])
    {
        int start = 0;
        int end = numbers.length;

        int length = numbers.length;

        //O(length^3)
        for(int i=0;i<length;i++)
        {
            for(int j=i;j<length;j++)
            {
                for(int k = i;k<=j;k++)
                {
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int numbers[] = {1,5,7,10,98,100};
        print_subarrays(numbers);

        System.out.println("Total SubArrays = "+(numbers.length*(numbers.length+1))/2);

    }
}
