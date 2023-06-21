package two_D_array;

public class SearchInSortedArrayStaircaseSearch {

    public static void search_in_sorted_matrix(int matrix[][],int key)
    {

        //Complexity is O(n+m)
        int row_num = matrix.length;
        int col_num = matrix[0].length;

        int j = col_num-1;
        int i = 0;

        while (i <= row_num-1 && j >= 0)
        {
            if(matrix[i][j] == key)
            {
                System.out.println("Found at cell ("+i+","+j+")");
                return;
            }
            else if(matrix[i][j] < key)
            {
                i++;
            }
            else //matrix[i][j] > key
            {
                j--;
            }

        }
        System.out.println("Not Present");
    }
    public static void main(String args[])
    {
        int matrix[][] = {  {10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};
        search_in_sorted_matrix(matrix,00);

    }
}
