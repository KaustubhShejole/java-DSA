package Backtracking;

public class N_Queens_Problem {
    /*
    forms: all solutions,possible solutions,count solutions
     */
    static int count = 0;
    public static void printBoard(char board[][]){
        System.out.println("-----------Chess Board-------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][],int row,int column){
        //vertical up
        for (int i = row-1; i >= 0; i--) {
            if(board[i][column] == 'Q'){
                return false;
            }
        }
//        int newColumnValue = column;
//        //diagonally left
//        for (int i = row-1; i >= 0 && column>0; i--,column--) {
//            if(board[i][column-1] == 'Q'){
//                return false;
//            }
//        }
//        //diagonally right
//        for (int i = row-1; i >=0 & column< board.length-1 ; i--,column++) {
//            if(board[i][column+1]=='Q'){
//                return false;
//            }
//        }
        //diagonally left
        for (int i = row-1,j=column-1; i >= 0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diagonally right
        for (int i = row-1,j=column+1; i >=0 && j < board.length ; i--,j++) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void n_queens_problem(char board[][],int row)
    {
        //T(n) = 1QueenPlace*T(n-1) + isSafe()
        //T(n) = n*T(n-1) + T(n)
        //base
        if(row == board.length){
            count = count +1;
            printBoard(board);
            return;
        }
        //column loop
        for(int j=0;j<board.length;j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                n_queens_problem(board, row + 1);
                board[row][j] = '.';
            }
        }
    }
    public static void main(String[] args) {
        int n=5;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                board[i][j] = '.';
            }
        }

        n_queens_problem(board,0);
        System.out.println("Total Number of solutions = "+count);
    }
}
