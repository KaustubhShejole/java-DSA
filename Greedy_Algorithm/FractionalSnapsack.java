package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalSnapsack {
    /*
    Given the weights and values of n items, put these items in a snapsack of
    capacity W to get the maximum total value in the snapsack.

    value = [60,100,120]
    weight = [10,20,30]  ans = 240
    W = 50
     */
    public static double fractional_knapsack(int value[],int weight[],int capacity_of_the_knapsack)
    {
        double profit = 0;
        int total_number_of_items = value.length;;
        double items[][] = new double[value.length][4];

        for (int i = 0; i < total_number_of_items; i++) {
            items[i][0] = i;
            items[i][1] = value[i];
            items[i][2] = weight[i];
            items[i][3] = (items[i][1]/items[i][2]);
        }

        Arrays.sort(items, Comparator.comparingDouble(o -> o[3]));

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = total_number_of_items -1; i >= 0; i--) {
            if (capacity_of_the_knapsack == 0){
                break;
            }
            else if(items[i][2] <= capacity_of_the_knapsack) {
                ans.add(i);
                profit += items[i][1];
                capacity_of_the_knapsack -= items[i][2];
            }
            else if(items[i][2] > capacity_of_the_knapsack)
            {
                ans.add(i);
                profit += items[i][3]*capacity_of_the_knapsack;
                break;
            }
        }
        System.out.println(ans);
        return profit;
    }

    public static void main(String[] args) {
        int value[] = {60,100,120};
        int weights[] = {10,20,30};
        int W = 50;
        System.out.println(fractional_knapsack(value,weights,W));
    }
}
