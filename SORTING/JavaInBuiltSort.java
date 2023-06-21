package SORTING;

import Array_Basic.ArraysCC;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class JavaInBuiltSort {

    public static void main(String args[])
    {
        int arr[] = {5,4,1,3,2};


        Arrays.sort(arr,0,2);
        //start index inclusive end index non-inclusive
        ArraysCC arraysCC = new ArraysCC();
        arraysCC.print(arr);

        Arrays.sort(arr);
        arraysCC.print(arr);

        Integer arr1[] = {5,4,1,3,2};
        Arrays.sort(arr1, Collections.reverseOrder());
        for (int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i] + " ");
        }

    }
}
