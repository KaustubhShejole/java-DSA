package Backtracking;

public class GridWaysModified {
    static int count = 0;
    public static int number_of_grid_ways(int m,int n,int a,int b,int c,int d) {
        if (a == c && b == d) {

            return 1;
        }
        else if (a ==m ||  b ==  n) {
            return  0;
        }
            //right move
            int ans1 = number_of_grid_ways(m,n, a, b + 1,c,d);
            //left move
            int ans2 = number_of_grid_ways(m,n,a+1,b,c,d);
            return ans1+ans2;
    }
    public static void main(String args[]){
        System.out.println(number_of_grid_ways(3,3,0,0,2,2));
    }
}
