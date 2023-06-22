package BitManipulation;

public class CountSetBitsInANumber {

    public static int count_set_bits_in_a_number(int n){
        int bitMask = 1;
        int count = 0;
        //O(logn+1)=O(logn)
        while(n!=0){
            if((n & bitMask) == 1)
            {
                count = count +1;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count_set_bits_in_a_number(11));
    }
}
