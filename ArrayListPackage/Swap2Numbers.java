package ArrayListPackage;

import java.util.ArrayList;

public class Swap2Numbers {

    public static void swap(ArrayList<Integer> list,int index1,int index2)
    {
        int temp = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(55);
        list.add(101);

        System.out.println(list);

        swap(list,1,2);
        System.out.println(list);

    }
}
