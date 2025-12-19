package iterator.failfast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FailFastArrayList implements Serializable {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
        iterateWithIterator(list1);
        System.out.println(list1);
    }

    private static void iterateWithIterator(List<Integer> list) {
        ListIterator<Integer> itr = list.listIterator();


        try {
            while (itr.hasNext()) {
                Integer num = itr.next();
                System.out.println("number: " + num);
                if (num==1) {
                    itr.add(6); //6 is added after the itr.previous (1) amd itr.next (2). So adds 6 after 1 and moves the cursor after 6 [1 6 ^ 2 3 4 5]
                    itr.previous(); //[1 ^ 6 2 3 4 5]
                }

                if (num==5) {
                    list.add(7); //fail fast -> The list modifies its internal structure and increments modCount.
                                 // The loop tries to get the next item. The Iterator checks: if (expectedModCount != list.modCount).
                                 // They don't match! ConcurrentModificationException is thrown.
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
