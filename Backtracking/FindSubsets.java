package Backtracking;

public class FindSubsets {

    public static void printSubsets(String str,int length,String to_print){
        //base case
        if(length == str.length()+1)
        {
            System.out.println(to_print);
            return;
        }
        //charAt(length-1) included
        //System.out.println(to_print);
        printSubsets(str,length+1,to_print+str.charAt(length-1));
        //System.out.println();
        //charAt(length-1) not included
        printSubsets(str,length+1,to_print);
    }

    public static void findSubsets(String str,int i,String ans){
        //Time Complexity = O(n*(2^n))
        //Space complexity = O(n)
        //base case
        if(i == str.length())
        {
            if(ans.length() == 0)
            {
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //Yes Choice
        findSubsets(str,i+1,ans+str.charAt(i));
        //No Choice
        findSubsets(str,i+1,ans);
    }
    public static void main(String[] args) {
        String str1 = "abc";
        //Subsets a b c ab bc ac abc ' '
        findSubsets(str1,0,"");
    }
}
