package SORTING;

import Array_Basic.ArraysCC;

//import ArrayCC from
public class BubbleSort {

    public static void bubblesort(int[] numbers)
    {
        int length = numbers.length;

        for(int i=0;i<=length-2;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(numbers[i] > numbers[j])
                {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            ArraysCC arraysCC = new ArraysCC();
            arraysCC.print(numbers);
        }
    }
    public static void main(String args[])
    {
        int numbers[] = {8,4,9,10,1};
        bubblesort(numbers);
        ArraysCC arraysCC = new ArraysCC();
        arraysCC.print(numbers);
    }
}
