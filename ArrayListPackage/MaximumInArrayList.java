package ArrayListPackage;

import java.util.ArrayList;

public class MaximumInArrayList
{
    public static int find_maximum(ArrayList<Integer> list)
    {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){
//            if(max < list.get(i))
//            {
//                max = list.get(i);
//            }
            max = Math.max(max,list.get(i));
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(55);
        list.add(101);

        System.out.println(find_maximum(list));
    }
}
