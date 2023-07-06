package Backtracking;

public class GridWaysMxN {
    static int count = 0;
    public static void number_of_grid_ways(int m,int n,int a,int b,int c,int d) {
        if (a == c && b == d) {
            count++;
            return;
        }
        if (a < m && b < n) {
            //right move
            number_of_grid_ways(m,n, a, b + 1,c,d);
            //left move
            number_of_grid_ways(m,n,a+1,b,c,d);
        }
    }
    public static void main(String args[]){
        number_of_grid_ways(3,3,0,0,2,2);
        System.out.println("Number of Ways = "+count);
    }
}
