package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    /*
    We are given an infinite supply of denominations
    [1,2,5,10,20,50,100,500,2000].
    Find minimum number of coins or notes to make value V.
     */
    public static int minimum_numbers_of_coins(Integer denominations[], int Value)
    {
        Arrays.sort(denominations);
        int number_of_notes = 0;
        int notes_and_numbers[][] = new int[denominations.length][2];
        for (int i = denominations.length-1; i >= 0; i--) {
            if (Value >= denominations[i])
            {
                notes_and_numbers[i][0] = denominations[i];
                notes_and_numbers[i][1] = Value/denominations[i];
                number_of_notes += Value/denominations[i];
                Value -= (denominations[i])*(Value/denominations[i]);
            }
            if (Value==0)
            {
                break;
            }
        }

        return number_of_notes;
    }
    public static int minimum_numbers_of_coins1(Integer denominations[], int Value)
    {

        Arrays.sort((denominations), Comparator.reverseOrder());
        int number_of_notes = 0;
        int notes_and_numbers[][] = new int[denominations.length][2];
        for (int i = 0;i<denominations.length; i++) {
            if (Value >= denominations[i])
            {
                notes_and_numbers[i][0] = denominations[i];
                notes_and_numbers[i][1] = Value/denominations[i];
                number_of_notes += Value/denominations[i];
                Value -= (denominations[i])*(Value/denominations[i]);
            }
            if (Value==0)
            {
                break;
            }

        }
        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + " "+notes_and_numbers[i][1]);
        }

        return number_of_notes;
    }

    public static void main(String[] args) {
        Integer denominations[] = {1,2,5,10,20,50,100,500,1000,2000};
        System.out.println(minimum_numbers_of_coins1(denominations,1059));
    }
}
