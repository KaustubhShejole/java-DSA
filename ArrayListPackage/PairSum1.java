package ArrayListPackage;

import java.util.ArrayList;

public class PairSum1 {

    public static boolean pair_sum_brute_force(ArrayList<Integer> list,int target)
    {
        //O(n^2)
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == target)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean  pair_sum_optimised(ArrayList<Integer> list,int target)
    {
        //O(n)
        int left_pointer = 0;
        int right_pointer = list.size() -1;
        while(left_pointer < right_pointer)
        {
            if(list.get(left_pointer) + list.get(right_pointer) == target)
                return true;
            if(list.get(left_pointer) + list.get(right_pointer) < target)
                left_pointer = left_pointer + 1;
            else
                right_pointer = right_pointer -1;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(pair_sum_brute_force(list,4));
        System.out.println(pair_sum_optimised(list,4));
    }
}
