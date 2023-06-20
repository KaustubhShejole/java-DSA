import java.util.*;
public class ReverseArray {

    public static void reverse_an_array(int numbers[])
    {
        int low=0;
        int high = numbers.length-1;

        while(low < high) // no need of <=
        {
            int temp;
            temp = numbers[low];
            numbers[low] = numbers[high];
            numbers[high] = temp;

            low = low+1;
            high = high-1;
        }
    }
    public static void print(int numbers[]){
        for(int i=0;i<numbers.length;i++) {
            System.out.print(numbers[i]+" ");

        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int numbers[] = {1,3,8,10,30,200};

        reverse_an_array(numbers);

        print(numbers);


    }
}
