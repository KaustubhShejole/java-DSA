import java.util.*;
public class kadanes_max_sub_array_sum {

    public static int kadanes(int numbers[])
    {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        int max = Integer.MIN_VALUE;
        int status = 0;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i] > max)
            {
                max = numbers[i];
            }
            if(numbers[i] > 0)
            {
                status = 1;
            }
        }
        currSum = 0;

        if (status == 0)
        {
            return max;
        }
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i] + currSum < 0)
            {
                currSum = 0;
            }
            else
            {
                currSum += numbers[i];
            }
            if(currSum > maxSum)
            {
                maxSum = currSum;
            }
        }
        return maxSum;
    }
    public static void main(String args[])
    {
        int numbers[] = {-2,-3,-4,-1,-2,-1,-5,-3};
        System.out.println("Maximum SubArraySum is "+kadanes(numbers));
    }
}
