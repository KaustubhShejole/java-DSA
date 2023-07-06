package Recursion;

public class CheckArrayIsSorted {


    public static boolean is_sorted(int[] arr,int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return is_sorted(arr,i+1);

    }
    public static void main(String[] args) {
        System.out.println(is_sorted(new int[]{1,2,3,7,9,16},0));
    }
}
