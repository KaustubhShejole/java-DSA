package ArrayListPackage;

import java.util.ArrayList;

public class Multi_dimensional_ArrayList
{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        mainList.add(list);

        ArrayList<Integer> list_2 = new ArrayList<>();
        list_2.add(3);
        list_2.add(4);
        mainList.add(list_2);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println(mainList);


        ArrayList<ArrayList<Integer>> mainList2 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList2.add(list1);
        mainList2.add(list2);
        mainList2.add(list3);
        System.out.println(mainList2);

        for (int i = 0; i < mainList2.size(); i++) {
            ArrayList<Integer> currList = mainList2.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
