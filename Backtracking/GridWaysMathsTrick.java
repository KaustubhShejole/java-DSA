package Backtracking;

public class GridWaysMathsTrick {
    static int factorial(int n){
        int factorial_answer = 1;
        for (int i = 2; i <= n; i++) {
            factorial_answer*=i;
        }
        return factorial_answer;
    }
    public static int grid_ways_from_0_0_to_m_n(int m,int n){
        return (factorial(n+m-2)/(factorial(n-1)*factorial(m-1)));
    }
    public static void main(String[] args) {

        System.out.println(grid_ways_from_0_0_to_m_n(3,3));
    }
}
