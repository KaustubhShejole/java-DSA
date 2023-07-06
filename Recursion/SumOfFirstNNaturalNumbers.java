package Recursion;

public class SumOfFirstNNaturalNumbers {

    public static int sum_of_first_n_natural_numbers(int n){
        if(n==1){
            return 1;
        }
        return n+sum_of_first_n_natural_numbers(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sum_of_first_n_natural_numbers(11));
    }
}
