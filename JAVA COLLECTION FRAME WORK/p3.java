
import java.util.*;

public class p3 {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 5, 1, 3, 2, 5, 1, 2 };

        Set<Integer> set = new HashSet<>();
        // form iterable
        for (int i : arr) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                System.out.println(i);
                break;
            }
        }

    }
}
