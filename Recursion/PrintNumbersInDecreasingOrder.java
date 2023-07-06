package Recursion;

public class PrintNumbersInDecreasingOrder {

    public static void print_from_n_to_1(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        print_from_n_to_1(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        print_from_n_to_1(n);
    }
}
