package BitManipulation;

public class FastExponentiation {

    public static int fast_exponentiation(int number,int index_of_exponentiation){
        int answer = 1;
        while(index_of_exponentiation > 0){
            if((index_of_exponentiation & 1) ==1)
            {
                answer = answer*number;
            }
            number = number*number;
            index_of_exponentiation = index_of_exponentiation >> 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(fast_exponentiation(2,13));
    }
}
