package Recursion;

public class PrintNumbersInIncreasingOrder {
    public static void print_from_1_to_n(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        print_from_1_to_n(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n=109;
        print_from_1_to_n(n);
    }
}