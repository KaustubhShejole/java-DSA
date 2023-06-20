import java.util.*;
public class BinarySearch
{
    public static int binary_search(int numbers[],int key)
    {
        int low=0,mid;
        int high= numbers.length-1;

        while(low<=high) //example single element
        {
            mid = (low+high)/2;
            if(numbers[mid] == key)
            {
                return mid;
            }
            else if(key < numbers[mid])
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int numbers[] = {1,2,3,5,9,11,100,1000};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key Value to Search: ");

        int key = sc.nextInt();

        int index = binary_search(numbers,key);

        if(index == -1) {
            System.out.println("The key not found");
        }
        else {
            System.out.println("The key found at index "+index);
        }
    }
}
