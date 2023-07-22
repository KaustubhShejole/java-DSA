package ArrayListPackage;
import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        //Java Collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //Get Operation
        int element = list.get(0);
        System.out.println(element);

        //Delete
        list.remove(1);
        System.out.println(list);

        //Set Operation
        list.set(1,10);
        System.out.println(list);

        //Contains Element
        System.out.println(list.contains(10));
        System.out.println(list.contains(0));

        list.add(1,20); //O(1)
        System.out.println(list);
        System.out.println(list.size());

        //print the arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}