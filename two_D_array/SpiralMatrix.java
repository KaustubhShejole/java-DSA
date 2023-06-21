package two_D_array;
import java.util.*;
public class SpiralMatrix {

    public static void print_spiral(int matrix[][])
    {
        int row_num = matrix.length;
        int col_num = matrix[0].length;

        int end_row = row_num-1;
        int end_col = col_num-1;
        int start_row=0;
        int start_col=0;
        //int i=0;
        for (int i=0;i<row_num*col_num;)
        //while(start_row <= end_row && start_col <= end_col) // for odd n*n <= (middle path lost otherwise) and && for n*m
        {
            //top
            for(int j = start_row;j<=end_col;j++)
            {
                System.out.print(matrix[start_row][j]+" ");
                i++;
            }

            //right
            for(int j = start_row+1;j<=end_row;j++)
            {
                System.out.print(matrix[j][end_col]+ " ");
                i++;
            }

            //bottom
            for(int j = end_col -1 ;j>=start_col;j--) {
                //for n*n n odd or n*m m odd
//                if(start_row==end_row)
//                {
//                    break;
//                }
                System.out.print(matrix[end_row][j] + " ");
                i++;
            }

            //left
            for(int j=end_row-1;j>=start_col+1;j--)
            {
//                if(start_col == end_col)
//                {
//                    break;
//                }
                System.out.print(matrix[j][start_col]+ " ");
                i++;
            }
            start_row++;
            start_col++;
            end_row--;
            end_col--;

        }
    }
    public static void main(String args[])
    {
        int matrix[][] = {{1,2,3,4,17},{5,6,7,8,18},{9,10,11,12,19},{13,14,15,16,20}};
        print_spiral(matrix);
    }
}
