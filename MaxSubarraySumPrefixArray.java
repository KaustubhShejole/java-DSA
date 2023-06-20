import java.util.*;
public class MaxSubarraySumPrefixArray {
    //optimized O(n^2)
    public static int max_sub_array_prefix_sum(int numbers[])
    {
        int length = numbers.length;
        int prefix_array[] = new int[numbers.length];

        prefix_array[0] = numbers[0];

        for(int i=1;i<prefix_array.length;i++)
        {
            prefix_array[i] = numbers[i] + prefix_array[i-1];
        }
        int maxSum = Integer.MIN_VALUE;
        for(int start=0;start < length;start++)
        {
            for(int end=start;end<length;end++)
            {
                int currSum=0;
                //ternary operator
                currSum = start==0 ? prefix_array[end] : prefix_array[end] -prefix_array[start-1];

                if(currSum > maxSum)
                {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;



    }
    public static void main(String args[])
    {
        int numbers[] = {1,-2,6,-1,3};
        System.out.println("MaxSubArraySum = "+max_sub_array_prefix_sum(numbers));
    }
}
