import java.util.*;

public class set {
    public static void main(String[] args) {
        // LinkedHashSet - maintains Insertion Order due Internally it uses
        // DoublyLinkedList-allows only 1 null value
        // Set<Integer> unq = new LinkedHashSet<>();
        // unq.add(8);
        // unq.add(1);
        // unq.add(2);
        // unq.add(3);
        // unq.add(4);
        // unq.add(5);
        // unq.add(6);
        // System.out.println(unq.contains(57));

        // System.out.println(unq);

        // SortedSet<Integer> ts = new TreeSet<>();
        // // it will sort the Entire Elements
        // ts.add(10);
        // ts.add(20);
        // ts.add(60);
        // ts.add(30);
        // ts.add(40);
        // ts.add(50);
        // // ts.add(null);//treeSet dont allow null vallues

        // System.out.println(ts.first());
        // System.out.println(ts.last());
        // System.out.println(ts.tailSet(30));
        // System.out.println(ts.subSet(20, 45));

        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(7);
        ns.add(5);
        ns.add(6);
        ns.add(9);
        ns.add(3);
        ns.add(2);

        System.out.println(ns);
        System.out.println(ns.descendingSet());

        // System.out.println(ns.lower(3));
        // System.out.println(ns.higher(3));
        // System.out.println(ns.floor(4));
        // System.out.println(ns.ceiling(8));

    }

}
