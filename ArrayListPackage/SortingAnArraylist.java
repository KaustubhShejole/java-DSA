package ArrayListPackage;

import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArraylist {

    /*
    Optimised Method
    Ascending Order

    Collections.sort(list);

    In Arrays
    Arrays.sort(arr);
     */
    /*
    Collections Class
    Collection Interface
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(390);
        list.add(55);
        list.add(101);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        //Descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
