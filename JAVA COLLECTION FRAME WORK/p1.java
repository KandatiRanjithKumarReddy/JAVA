
import java.util.*;

public class p1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 30);

        Set<Integer> lhs = new LinkedHashSet<>(list);

        System.out.println(lhs);

    }

}
