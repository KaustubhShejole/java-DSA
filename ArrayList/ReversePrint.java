package ArrayList;

import java.util.ArrayList;

public class ReversePrint {
    public static void reverse_print(ArrayList<Integer> list){
        for(int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        reverse_print(list);
    }
}