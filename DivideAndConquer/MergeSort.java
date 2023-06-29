package DivideAndConquer;

import Array_Basic.*;



public class MergeSort {


    public static void mergeSort(int arr[],int si,int ei){
        //Time Complexity = O(nlogn)
        //Space = O(n)
        //Depth First
        if(si>=ei){
            return;
        }
        int mid = si +(ei-si)/2;//(si+ei)/2
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        //left(0,3) = 4 right(4,6)=3 -> 6-0+1 = 7
        int temp[] = new int[ei-si+1];
        int i=si;//iterator for left part
        int j = mid+1;//iterator for right part

        int k=0;//iterator for temp arr

        while(i<= mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
//        if(i>mid && j >ei)
//        {
//
//        } else if (i>mid) {
//            while(j<=ei) {
//                temp[k] = arr[j];
//                j++;
//                k++;
//            }
//        }
//        else
//        {
//            while(i<=mid){
//                temp[k++] = arr[i++];
//            }
//        }

        while(j<=ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {

        int arr[] = {6,3,9,2,5,8,-2};
        mergeSort(arr,0,arr.length-1);
        ArraysCC arraysCC = new ArraysCC();
        arraysCC.print(arr);
    }
}
