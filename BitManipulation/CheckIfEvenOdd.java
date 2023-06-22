package BitManipulation;

public class CheckIfEvenOdd {


    public static void check_odd_or_even(int number)
    {
        int bitMask = 1;
        if((number & bitMask) == 1)
        {
            System.out.println("Odd number");
        }
        else
        {
            System.out.println("Even Number");
        }
    }
    public static void main(String[] args) {
        //Odd number lsb is 1
        //Even number lsb is 0

        check_odd_or_even(1);
    }
}
