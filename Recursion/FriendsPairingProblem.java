package Recursion;

public class FriendsPairingProblem {

    public static int friends_pairing_problem(int n){
        if (n==1 || n==2){
            return n;
        }
        int single = friends_pairing_problem(n-1);
        int pair1 = (n-1)*friends_pairing_problem(n-2);
        return single+pair1;
    }

    public static void main(String[] args) {
        System.out.println(friends_pairing_problem(3));
    }
}
