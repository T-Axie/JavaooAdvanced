import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TableauListDict {
    public static void main(String[] args) {
        int[] myList = new int[5];
        myList[0] = 5;
        int[] mylist2 = myList.clone();
        // Whitout clone, when i modify mylist2, that will be modify mylist also.

        System.out.println(myList[0]);
        System.out.println(mylist2[2]);

        for (int element : myList) {
            System.out.println(element);
        }
        // list
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(5);
        list1.add(18);
        System.out.println(list1);
        for (int elem : list1) {
            System.out.println(elem);
        }
        // map - Dictionary in python
        Map<String, Integer> mydict = new HashMap<>();
        mydict.put("Stock", 3);
        mydict.put("ID MKM", 2356);
        System.out.println(mydict.values()); // take the value
        System.out.println(mydict);
        for (Map.Entry<String, Integer> entry : mydict.entrySet()) {
            System.out.println(entry);
        }
        // Queue - Less utilities

        // Stack - Less utilities

        // arrayDeque - Less utilities

    }
}
