package BitManipulation;

public class bitManipulation {
    public static void main(String[] args) {
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);//X-OR
        System.out.println(~5);
        //0 0000101 -> 1 1111010
        // 1 1111010 -> 2's complement -> 1 0000110
        System.out.println(5<<2);
        // 000101 -> 010100
        System.out.println(5>>2);
        // 000101 -> 000001

    }
}
