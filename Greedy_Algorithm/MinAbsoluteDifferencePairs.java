package Greedy_Algorithm;

import java.util.Arrays;

public class MinAbsoluteDifferencePairs {
    /*
    Given two arrays A and B of equal length n. Pair each element
    of array A to an element in array B, such that sum S of
    absolute differences of all the pairs is minimum.
     */

    public static int minimum_absolute_difference_pairs(int A[],int B[])
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int ans[][] = new int[A.length][2];
        int difference = 0;
        for (int i = 0; i < B.length; i++) {
            ans[i][0] = A[i];
            ans[i][1] = B[i];
            difference = difference + Math.abs(ans[i][0] - ans[i][1]);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + " "+ ans[i][1]);
        }
        return difference;
    }

    public static void main(String[] args) {
        int A[] = {1,2,3};
        int B[] = {2,1,3};
        System.out.println(minimum_absolute_difference_pairs(A,B));
    }
}
