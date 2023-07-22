package ArrayListPackage;

import java.util.ArrayList;

public class PairSum2 {
    public static boolean pair_sum_brute_force(ArrayList<Integer> list, int target)
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

        //breaking point
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i) > list.get(i+1))
            {
                left_pointer = i+1;
                right_pointer = i;
            }
        }
        int status = 1;
        int status2 = 1;
        if(left_pointer < right_pointer)
        {
            status2 = 0;
        }
        while(status == 1)
        {
            if(list.get(left_pointer) + list.get(right_pointer) == target)
                return true;
            if(list.get(left_pointer) + list.get(right_pointer) < target)
            {
                if(left_pointer == list.size()-1)
                {
                    left_pointer = 0;
                    status2 = 0;
                }
                else {
                    left_pointer = left_pointer + 1;
                }
            }
            else
            {
                if(right_pointer == 0)
                {
                    right_pointer = list.size() -1;
                    status2 = 0;
                }
                else {
                    right_pointer = right_pointer -1;
                }
            }
            if(status2 == 0)
            {
                if(left_pointer < right_pointer)
                {
                    status = 1;
                }
                else
                {
                    status = 0;
                }
            }
        }
        return false;
    }
    public static boolean  pair_sum_optimised1(ArrayList<Integer> list,int target)
    {
        //O(n)
        int left_pointer = 0;
        int right_pointer = list.size() -1;

        //breaking point
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i) > list.get(i+1))
            {
                left_pointer = i+1;
                right_pointer = i;
            }
        }

        while(left_pointer != right_pointer)
        {
            //case1
            if(list.get(left_pointer) + list.get(right_pointer) == target)
                return true;
            //case2
            if(list.get(left_pointer) + list.get(right_pointer) < target)
            {
                left_pointer = (left_pointer+1)%(list.size());
            }
            else {
                //case 3
                right_pointer = (right_pointer + list.size() - 1)%(list.size());
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pair_sum_brute_force(list,13));
        System.out.println(pair_sum_optimised(list,13));
        System.out.println(pair_sum_optimised1(list,12));
    }
}
