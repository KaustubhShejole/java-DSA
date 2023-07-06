package Backtracking;

public class FindPermutations {

    public static void print_permutations(String str,String ans)
    {
        //Time Complexity : O(n*n!)
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
//            StringBuilder sb = new StringBuilder(str);
//            sb.deleteCharAt(i);
//            print_permutations(sb.toString(),ans+str.charAt(i));

            char curr = str.charAt(i);
            String Newstr = str.substring(0,i)+str.substring(i+1);
            print_permutations(Newstr,ans+curr);

        }
    }
    public static void main(String[] args) {
        String str1 = "abc";
        // abc acb bac bca cab cba
        print_permutations(str1,"");

    }
}
