package DivideAndConquer;

import Array_Basic.ArraysCC;

public class QuickSort {


    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        if(i<ei){
            //always possible as maximum value of i would be ei-1
            i++;
            int temp = arr[i];
            arr[i]= arr[ei];
            arr[ei] = temp;
        }

        return i;
    }
    public static void quickSort(int arr[],int si,int ei){
        //last element
        if(si>=ei)
            return;
        int pindex = partition(arr,si,ei);
        quickSort(arr,si,pindex-1);//left
        quickSort(arr,pindex,ei);//right
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,5,2,-7};
        quickSort(arr,0, arr.length-1);
        ArraysCC arraysCC = new ArraysCC();
        arraysCC.print(arr);
    }
}
