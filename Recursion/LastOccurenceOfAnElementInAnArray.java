package Recursion;

public class LastOccurenceOfAnElementInAnArray {
    public static int last_occurence(int arr[],int key,int i){
        if(i == -1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return last_occurence(arr,key,i-1);

    }
    public static int last_occurence1(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = last_occurence1(arr,key,i+1);
        if(isFound == -1 && arr[i] == key)
            return i;
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,3,4,8,2,8};
        System.out.println(last_occurence(arr,8,arr.length-1));
        System.out.println(last_occurence1(arr,8,0));
    }
}
