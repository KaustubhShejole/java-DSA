package Array_Basic;

import java.util.*;
public class LargestNumber
{
    public static int getLargest(int numbers[])
    {
        int largest = Integer.MIN_VALUE; //-infinity

        for(int i=0; i< numbers.length;i++)
        {
            if(numbers[i]>largest)
            {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int numbers[])
    {
        int smallest = Integer.MAX_VALUE; //+infinity
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]<smallest)
            {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[])
    {
        // -infinity = Integer.MIN_VALUE
        // +infinity = Integer.MAX_VALUE

        int numbers[] = {7,0,9,2,1,0,10,100};
        System.out.println("Largest Value in numbers: "+getLargest(numbers));
        System.out.println("Smallest Value is: "+getSmallest(numbers));

    }
}
