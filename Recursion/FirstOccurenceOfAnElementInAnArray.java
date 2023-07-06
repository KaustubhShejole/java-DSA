package Recursion;

public class FirstOccurenceOfAnElementInAnArray {

    public static int first_occurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return first_occurence(arr,key,i+1);
    }

    public static void main(String[] args) {
        System.out.println(first_occurence(new int[]{1,3,4,8,2,8},8,0));
    }
}
