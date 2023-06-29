package DivideAndConquer;

public class SearchInRotatedSortedArray {


    public static int search_in_rotated_array(int arr[],int target,int si,int ei)
    {
        if(si > ei){
            return -1;
        }
        int mid = si +(ei-si)/2;
        int ans = mid;
        //case FOUND
        if(arr[mid]==target)
            return mid;

        //mid on Line1
        if(arr[si]<= arr[mid]){


            if(arr[si] <= target && target < arr[mid])
            {
                // case a: left
                return search_in_rotated_array(arr,target,si,mid-1);
            }
            else {
                // case b: right
                return search_in_rotated_array(arr,target,mid+1,ei);
            }
        } else{
            // case c: right
            if(arr[mid] < target && target <= arr[ei]){
                return search_in_rotated_array(arr,target,mid+1,ei);
            }
            else {
                // case d: left
                return search_in_rotated_array(arr,target,si,mid-1);
            }

        }
    }

    public static int search_in_a_rotated_sorted_Array_iterative_way(int arr[],int target,int si,int ei){

        while(si<=ei)
        {
            int mid=si +(ei-si)/2;
            if(arr[mid] == target)
                return mid;

            if(arr[si] <= arr[mid])
            {
                if(arr[si]<= target && target < arr[mid]){
                    ei = mid-1;
                }
                else {
                    si = mid+1;
                }
            }
            else
            {
                if(arr[mid] < target && target <= arr[ei])
                {
                    si = mid+1;
                }
                else{
                    ei = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 2;
        System.out.println(search_in_rotated_array(arr,target,0,arr.length-1));
        System.out.println(search_in_a_rotated_sorted_Array_iterative_way(arr,target,0,arr.length-1));
    }
}
