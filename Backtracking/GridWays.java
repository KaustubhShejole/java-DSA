package Backtracking;

public class GridWays {
    /*
    Find the number of ways to reach from (0,0) to
    (N-1,M-1) in a N*M Grid.
    Allowed Moves: Right or Down
     */

    static int count = 0;
    public static void number_of_grid_ways(int n,int a,int b,int c,int d) {
        if (a == c && b == d) {
            count++;
            return;
        }
        if (a < n && b < n) {
            //right move
            number_of_grid_ways(n, a, b + 1,c,d);
            //left move
            number_of_grid_ways(n,a+1,b,c,d);
        }
    }
    public static void main(String args[]){
        number_of_grid_ways(5,3,2,4,4);
        System.out.println("Number of Ways = "+count);
    }

}
