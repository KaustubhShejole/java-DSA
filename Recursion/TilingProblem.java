package Recursion;

public class TilingProblem {


    public static int filling(int n,int vertical,int horizontal){

        if(n==0)
            return 1;//no way to put a tile
        //choice vertical
        vertical = vertical + filling(n-1,0,0);

        if(n>=2){
            horizontal = horizontal + filling(n-2,0,0);
        }
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        System.out.println(filling(4,0,0));
    }
}
