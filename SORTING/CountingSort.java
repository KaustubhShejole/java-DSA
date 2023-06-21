package SORTING;

public class CountingSort {

    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i] > 0)
            {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }
    public static void main(String args[])
    {
        int numbers[] = {1,4,1,3,2,4,3,7};
        countingSort(numbers);

        printArr(numbers);
    }
}

//if negative numbers present sort them in descending order by taking their positive
//then firstly copy them and after that copy opositive numbers.