import java.util.*;
public class MaxSubArraySum {

    //brute force

    public static int max_subarray_sum(int numbers[])
    {
        int start = 0;
        int end = numbers.length;

        int length = numbers.length;
        int maxSum = Integer.MIN_VALUE;
        //O(length^3)
        for(int i=0;i<length;i++)
        {
            for(int j=i;j<length;j++)
            {
                int currSum = 0;
                for(int k = i;k<=j;k++)
                {
                    currSum = currSum + numbers[k];
                }
                if(currSum>maxSum)
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
        System.out.println("Maximum SubArray Sum is "+max_subarray_sum(numbers));

        System.out.println("Total SubArrays = "+(numbers.length*(numbers.length+1))/2);

    }
}
