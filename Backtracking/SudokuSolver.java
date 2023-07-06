package Backtracking;

public class SudokuSolver {

    public static boolean isSafe(int sudoku_board[][],int row,int column,int digit){
        //row
        for (int i = 0; i < 9; i++) {
            if (sudoku_board[row][i] == digit){
                return false;
            }
        }
        //column
        for (int i = 0; i < 9; i++) {
            if (sudoku_board[i][column] == digit){
                return false;
            }

        }
        //grid
        int startingrow = 3*(row/3); // row - row%3
        int startingcolumn = 3*(column/3); // col - col%3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudoku_board[startingrow+i][startingcolumn+j] == digit){
                    return false;
                }
            }

        }
        return true;
    }

    public static boolean sudoku_solver(int sudoku_board[][],int row,int col){
        //base case
        if(row == 9)
        {
            return true;
        }

        //recursion
        int nextRow = row;
        int nextCol = col+1;
        if(col + 1 == 9){
            nextRow = nextRow +1;
            nextCol = 0;
        }
        if (sudoku_board[row][col] != 0){
            return sudoku_solver(sudoku_board,nextRow,nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku_board,row,col,digit)){
                sudoku_board[row][col] = digit;
                if(sudoku_solver(sudoku_board,nextRow,nextCol)){
                    //solution exists
                    return true;
                }
                sudoku_board[row][col] = 0;
            }
        }
        return false;
    }
    public static void printSudoku(int sudoku_board[][]){

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku_board[i][j]+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int sudoku_board[][] ={{0,0,8,0,0,0,0,0,0},
                {4,9,0,1,5,7,0,0,2},
                {0,0,3,0,0,4,1,9,0},
                {1,8,5,0,6,0,0,2,0},
                {0,0,0,0,2,0,0,6,0},
                {9,6,0,4,0,5,3,0,0},
                {0,3,0,0,7,2,0,0,4},
                {0,4,9,0,3,0,0,5,7},
                {8,2,7,0,0,9,0,1,3}
        };

        if (sudoku_solver(sudoku_board,0,0)){
            System.out.println("True and solution exists");
            printSudoku(sudoku_board);
        }
        else {
            System.out.println("Solution does not exist");
        }
    }
}
