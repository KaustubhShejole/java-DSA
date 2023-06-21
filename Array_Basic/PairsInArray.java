package Array_Basic;

import java.util.*;
public class PairsInArray {


    public static void generate_possible_pairs(int numbers[])
    {
        int length = numbers.length;
        for(int i=0;i<length;i++)
        {
            int current = numbers[i];
            for(int j=i+1;j<length;j++) {
                System.out.print("(" + current + "," + numbers[j] + ") ,");
            }
            System.out.println();
        }

    }

    public static void main(String args[])
    {
        int numbers[] = {1,3,8,10,30,200};
        int length = numbers.length;
        generate_possible_pairs(numbers);
        System.out.println("Total Pairs = "+((length)*(length+1))/2);
    }
}
