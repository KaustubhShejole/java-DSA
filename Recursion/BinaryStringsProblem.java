package Recursion;

public class BinaryStringsProblem {
    public static void print_all_binary_strings_without_consecutive_ones_of_size_n(int n)
    {
        print_binary_strings_without_consecutive_ones_of_size_n(n,0,0,(""));
    }
    public static void print_binary_strings_without_consecutive_ones_of_size_n(int n,int i,int previous,String str)
    {
        if (i == n)
        {
            System.out.println(str);
        return;
        }
        if (previous==0) {
            print_binary_strings_without_consecutive_ones_of_size_n(n, i + 1, 0, str+'0');

            print_binary_strings_without_consecutive_ones_of_size_n(n,i+1,1,str+'1');
        }
        else {
            print_binary_strings_without_consecutive_ones_of_size_n(n,i+1,0,str+'0');

        }
    }

    public static void main(String[] args) {
        print_all_binary_strings_without_consecutive_ones_of_size_n(3);
    }
}
