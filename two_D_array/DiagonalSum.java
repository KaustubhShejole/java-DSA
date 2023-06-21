package two_D_array;
import java.util.*;
public class DiagonalSum {

    public static int diagonal_sum(int matrix[][])
    {
        //O(n)
        int sum=0;
        //Square Matrix
        if(matrix.length == matrix[0].length)
        {
            int num = matrix.length;


            for (int i=0;i<num;i++)
            {
                sum += matrix[i][i] + matrix[i][num-1-i];
            }
            if(num%2 != 0)
            {
                //odd square matrix
                sum -= matrix[num/2][num/2];
            }

//            for (int i=0;i<num;i++)
//            {
//                //primary diagonal
//                sum += matrix[i][i];
//                //secondary diagonal
//                if(i != num-1-i)
//                    sum += matrix[i][num-1-i];
//            }

        }
        else
        {
            System.out.println("Require Square Matrix as an input");
        }
        return sum;
    }

    public static void main(String args[])
    {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonal_sum(matrix));
    }
}
