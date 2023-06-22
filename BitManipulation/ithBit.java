package BitManipulation;

public class ithBit {
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        return 1;
    }

    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n,int i){
        //return (~(~n | 1<<i));
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n,int i,int newBit){
//        if(newBit==0){
//            return clearIthBit(n,i);
//        }
//        return setIthBit(n,i);

        n = clearIthBit(n,i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static int clearlastIBits(int n,int i){
        int bitMAsk = (~0)<<i;
        //(~0) = -1 = 11111111(8 bits)
        return n&bitMAsk;
    }
    public static int clear_range_of_bits(int n,int i,int j)
    {
//        int BitMask = ~0;
//        for(int k=j;k>=i;k--)
//        {
//            BitMask = clearIthBit(BitMask,k);
//        }

        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;//2^i-1
        int BitMask = a|b;

        return n & BitMask;


    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10,1));
        System.out.println(setIthBit(10,4));
        System.out.println(clearIthBit(10,1));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(clearlastIBits(14,3));
        System.out.println(clear_range_of_bits(10,2,4));
    }

}
