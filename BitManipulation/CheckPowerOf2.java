package BitManipulation;

public class CheckPowerOf2 {
    public static void Check_power_of_2(int n){
        if((n & (n-1)) == 0){
            System.out.println("Power of 2");
        }else {
            System.out.println("Not  power of 2");
        }
    }

    public static void main(String[] args) {
        Check_power_of_2(8);
    }
}
