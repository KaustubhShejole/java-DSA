package two_D_array;
import java.util.*;
public class SearchInSortedMatrix {

    public static void search_in_sorted_matrix(int matrix[][],int key)
    {
        int row_num = matrix.length;
        int col_num = matrix[0].length;

        for(int start_col=0;start_col<col_num;start_col++)
        {
            if (matrix[0][start_col] > key || matrix[row_num-1][col_num-1] < key)
            {
                System.out.println("Key Not Found");
                return;
            }
            if(matrix[row_num-1][start_col] < key)
            {

            }
            else
            {
                int start = 0;
                int end = row_num-1;

                while (start<=end)
                {
                    int mid=(start+end)/2;

                    if(matrix[mid][start_col] == key)
                    {
                        System.out.println("Key found at cell ("+mid+","+start_col+")");
                        return;
                    }
                    else if (matrix[mid][start_col] < key)
                    {
                        start = mid+1;
                    }
                    else
                    {
                        end = mid-1;
                    }
                }
            }
        }
    }
    public static void main(String args[])
    {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        search_in_sorted_matrix(matrix,18);

    }
}
