package Recursion;

public class xPowerN {
    public static int x_power_n(int x,int n){
        //O(n)
        if(n==0)
            return 1;
        return x*x_power_n(x,n-1);
    }
    public static int x_power_n_not_optimized(int x,int n){
        //O(n)
        if(n==0)
            return 1;
        if(n%2==0){
            return x_power_n_not_optimized(x,n/2)*x_power_n_not_optimized(x,n/2);
        }
        return x*x_power_n_not_optimized(x,n-1);
    }
    public static int x_power_n_optimized(int x,int n){
        //O(logn)
        if(n==0)
            return 1;
        if(n%2==0){
            int multiplicant = x_power_n_optimized(x,n/2);
            return multiplicant*multiplicant;
            //return x_power_n_optimized(x_power_n_optimized(x,n/2),2);
        }
        return x*x_power_n_optimized(x,n-1);
    }

    public static void main(String[] args) {
        System.out.println(x_power_n(2,11));
        System.out.println(x_power_n_not_optimized(2,11));
        System.out.println(x_power_n_optimized(2,12));
    }
}
