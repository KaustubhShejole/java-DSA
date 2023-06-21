package SORTING;


import Array_Basic.ArraysCC;

/*
    Pick an element from an unsorted part and put it at
    the right position at the sorted part
 */
public class InsertionSort {

    public static void insertionSort(int numbers[])
    {
        for(int i=1;i<numbers.length;i++)
        {
            int curr_element = numbers[i];
            int prev = i-1;
            while(prev >=0 && numbers[prev]>curr_element)
            {
                numbers[prev+1] = numbers[prev];
                prev--;
            }
            numbers[prev+1] = curr_element;


        }
    }
    public static void main(String args[])
    {
        int arr[] = {5,4,1,3,2};

        insertionSort(arr);

        ArraysCC arraysCC = new ArraysCC();
        arraysCC.print(arr);



    }
}
