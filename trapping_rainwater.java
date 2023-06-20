import java.util.*;
public class trapping_rainwater {

    public static int trapped_rainwater(int numbers[])
    {
        // O(n) Complexity
        int left_max_boundary[] = new int[numbers.length];
        int right_max_boundary[] = new int[numbers.length];

        int max = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
                if(numbers[i] > max)
                {
                    max = numbers[i];
                }
                left_max_boundary[i] = max;
        }

        max = Integer.MIN_VALUE;
        for(int i=numbers.length-1;i>=0;i--)
        {
            if(numbers[i] > max)
            {
                max = numbers[i];
            }
            right_max_boundary[i] = max;
        }

        int trapped_rainwater = 0;
        for(int i=0;i< numbers.length;i++)
        {
            int waterLevel = Math.min(left_max_boundary[i],right_max_boundary[i]);

            trapped_rainwater = trapped_rainwater + waterLevel - numbers[i];
        }
        return trapped_rainwater;
    }
    public static void main(String args[])
    {
        int numbers[] = {4,2,0,6,3,2,5};

        System.out.println("Trapped Rainwater = "+trapped_rainwater(numbers));
    }
}
