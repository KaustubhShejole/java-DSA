package SORTING;

import Array_Basic.ArraysCC;

public class BubbleSort1 {

    public static void bubble_sort(int numbers[])
    {

        int n = numbers.length;
        for(int turn=0;turn<n-1;turn++)
        {
            int swap = 0;
            for(int j=0;j<=n-2-turn;j++)
            {
                if(numbers[j] > numbers[j+1])
                {
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                    swap=1;
                }
            }
            if(swap == 0)
            {
                break;
            }
        }
    }
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int numbers[] = {9,8,7,6,5,4,3,2,1};

        bubble_sort(numbers);
        printArr(numbers);
    }
}

/*
n-1 turns


0th Turn:
A: 5,4,1,3,2
4,5,1,3,2
4,1,5,3,2
4,1,3,5,2
4,1,3,2,5
(0 to n-2)
compare A[n-2] with A[n-1]

A: 4,1,3,2,5
1,4,3,2,5
1,3,4,2,5
1,3,2,4,5
(0 to n-3)


A: 1,3,2,4,5
1,3,2,4,5
1,2,3,4,5
(0 to n-4)

A: 1,2,3,4,5
1,2,3,4,5
(0 to n-5)

for(int turn=0;turn<n-1;turn++)
{
    for(int j=0;j<n-2-turn;j++)
    {

    }
}

 */