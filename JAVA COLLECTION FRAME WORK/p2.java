import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();
        ts.add("ranjith");
        ts.add("rajesh");
        ts.add("rahul");
        ts.add("RCB");

        SortedSet<String> st = new TreeSet<>(ts);
        System.out.println(st);

    }

}
