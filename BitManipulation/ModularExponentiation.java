package BitManipulation;

public class ModularExponentiation {
    //a^n % b
    //(ab) mod p = ( (a mod p) (b mod p) ) mod p
    //(a^n) mod b = ((a mod b)^n)mod(b)

    public static int modularExponentiation(int a,int n,int b)
    {
        /*
        Calculates (a^n)%b
         */
        FastExponentiation fe = new FastExponentiation();
        int ans = fe.fast_exponentiation((a%b),n);
        return ans%b;
    }
    public static void main(String[] args) {
        System.out.println(modularExponentiation(2,5,13));
    }
}
