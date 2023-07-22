package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPairs
{
    /*
    You are given n pairs of numbers. In every pair, the
    first number is always smaller than the second
    number. A pair (c,d) can come after pair (a,b) if
    b < c.
    Find the longest chain which can be formed from
    a given set of pairs.

    pairs = (5,24),(39,60),(5,28),(27,40),(50,90)
    ans = 3
     */
    public static int maximum_pairs_possible(int pairs[][])
    {
        int total_number_of_records = pairs.length;
        int activities[][] = new int[total_number_of_records][3];
        for (int i = 0; i < total_number_of_records; i++) {
            activities[i][0] = i;
            activities[i][1] = pairs[i][0];
            activities[i][2] = pairs[i][1];
        }

        //lambda function -> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));


        ArrayList<Integer> activities_index = new ArrayList<>();
        for (int i = 0; i < total_number_of_records; i++) {
            if (activities_index.isEmpty())
            {
                activities_index.add(activities[i][0]);
            }
            else
            {
                if(activities[i][1] > activities[activities_index.get(activities_index.size()-1)][2])
                {
                    activities_index.add(activities[i][0]);
                }
            }
        }
        System.out.println(activities_index);
        return activities_index.size();
    }

    public static void main(String[] args) {
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        System.out.println(maximum_pairs_possible(pairs));
    }
}
