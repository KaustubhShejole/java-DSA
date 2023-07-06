package Recursion;

public class FibonacciSeries {

    //0 1 1 2 3 5 8
    //Assuming 0 as 0th Fibonacci Number

    //Time Complexity 2^n
    //Space Complexity : Code Execution Space O(n)

    public static int nth_fibonacci_number(int n){
        if(n==0){
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return nth_fibonacci_number(n-1)+nth_fibonacci_number(n-2);
    }

    public static void main(String[] args) {
        System.out.println(nth_fibonacci_number(5));
    }
}
