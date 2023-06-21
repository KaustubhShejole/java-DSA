package Strings;

public class PrintLargestString {

    public static void main(String args[]){
        //We will use compareTo function
        /*
        str1.compareTo(str2)
        0 : equal;
        < 0 : str1<str2
        >0 : str1>str2
         */

        //O(x*N) x:average number of letters in a string, N is the number of strings

        String fruits[] = {"apple","mango","banana"};
        String largest = fruits[0];
        for(int i =1;i< fruits.length;i++)
        {
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
