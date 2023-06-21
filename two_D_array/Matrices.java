package two_D_array;
import java.util.*;
public class Matrices {


    public static boolean search(int matrix[][],int key)
    {
        int num_row = matrix.length, num_col = matrix[0].length;

        for(int i =0 ; i < num_row;i++)
        {
            for(int j =0;j< num_col;j++)
            {
                if(matrix[i][j] == key)
                {
                    System.out.println("Found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static int max_element_in_matrix(int matrix[][])
    {
        int num_row = matrix.length, num_col = matrix[0].length;
        int maximum_value = Integer.MIN_VALUE;
        for(int i =0 ; i < num_row;i++)
        {
            for(int j =0;j< num_col;j++)
            {
                if(matrix[i][j] > maximum_value)
                {
                    maximum_value = matrix[i][j];
                }
            }
        }
        return maximum_value;
    }
    public static int min_element_in_matrix(int matrix[][])
    {
        int num_row = matrix.length, num_col = matrix[0].length;
        int minimum_value = Integer.MAX_VALUE;
        for(int i =0 ; i < num_row;i++)
        {
            for(int j =0;j< num_col;j++)
            {
                if(matrix[i][j] < minimum_value)
                {
                    minimum_value = matrix[i][j];
                }
            }
        }
        return minimum_value;
    }
    public static void main(String args[])
    {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        int num_row = matrix.length, num_col = matrix[0].length;

        for(int i =0 ; i < num_row;i++)
        {
            for(int j =0;j< num_col;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i =0 ; i < num_row;i++)
        {
            for(int j =0;j< num_col;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        search(matrix,9);
        System.out.println("Maximum Element in A matrix is "+max_element_in_matrix(matrix));
        System.out.println("Minimum Element in A matrix is "+min_element_in_matrix(matrix));

    }
}
