package SORTING;

/*
    Idea: pick the smallest ( from unsorted ), put it
    at the beginning
 */
public class SelectionSort {

    public static void selection_sort(int numbers[])
    {
        int length_of_array = numbers.length;
        for(int i=0;i<length_of_array-1;i++)
        {
            int smallest = numbers[i];
            int minPos = i;
            for(int j=i+1;j<length_of_array;j++)
            {
                if(numbers[j] < smallest)
                {
                    minPos = j;
                    smallest = numbers[j];
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minPos];
            numbers[minPos] = temp;


        }
    }

    public static void main(String args[])
    {
        int numbers[] = {5,7,3,4,0,1,78};

        selection_sort(numbers);
        BubbleSort1 bubbleSort1 = new BubbleSort1();
        bubbleSort1.printArr(numbers);
    }
}
