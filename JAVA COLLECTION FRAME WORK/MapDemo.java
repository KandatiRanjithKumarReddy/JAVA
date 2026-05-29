import java.util.*;

public class MapDemo {
        public static void main(String[] args) {

                // System.out.println("----- HashMap -----");

                // HashMap<Integer, String> hashMap = new HashMap<>();

                // // put()
                // hashMap.put(101, "Rajat");
                // hashMap.put(102, "rahul");
                // hashMap.put(103, "rajesh");
                // hashMap.put(104, "Ranjith");
                // // // get()
                // // System.out.println("Get 102: " + hashMap.get(102));

                // // entrySet()
                // for (Map.Entry<Integer, String> i : hashMap.entrySet()) {
                // int key = i.getKey();
                // String value = i.getValue();
                // System.out.println(key + " : " + value);

                // }

                // // containsKey()
                // System.out.println("Contains Key 101: "
                // + hashMap.containsKey(101));

                // // containsValue()
                // System.out.println("Contains Value Sam: "
                // + hashMap.containsValue("Sam"));

                // // size()
                // System.out.println("Size: " + hashMap.size());

                // // remove()
                // hashMap.remove(103);

                // // keySet()
                // System.out.println("Keys: " + hashMap.keySet());

                // // values()
                // System.out.println("Values: " + hashMap.values());

                // ===========================
                // 2. LINKEDHASHMAP-maintains order
                // ===========================
                // System.out.println("\n----- LinkedHashMap -----");

                // LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();

                // linkedMap.put(3, "C");
                // linkedMap.put(1, "A");
                // linkedMap.put(2, "B");

                // // Maintains insertion order
                // System.out.println(linkedMap);

                // // replace()
                // linkedMap.replace(2, "BB");
                // System.out.println(linkedMap);

                // // ===========================
                // // 3. TREEMAP
                // // ===========================
                // System.out.println("\n----- TreeMap -----");

                // TreeMap<Integer, String> treeMap = new TreeMap<>();

                // treeMap.put(30, "Thirty");
                // treeMap.put(10, "Ten");
                // treeMap.put(20, "Twenty");
                // treeMap.put(40, "Forty");

                // // Sorted by keys
                // System.out.println(treeMap);

                // // firstKey()
                // System.out.println("First Key: "
                // + treeMap.firstKey());

                // // lastKey()
                // System.out.println("Last Key: "
                // + treeMap.lastKey());

                // // higherKey()
                // System.out.println("Higher than 20: "
                // + treeMap.higherKey(20));

                // // lowerKey()
                // System.out.println("Lower than 20: "
                // + treeMap.lowerKey(20));

                // // ceilingKey()
                // System.out.println("Ceiling of 25: "
                // + treeMap.ceilingKey(25));

                // // floorKey()
                // System.out.println("Floor of 25: "
                // + treeMap.floorKey(25));

                // // ===========================
                // // 4. NAVIGABLE MAP METHODS
                // // ===========================
                // System.out.println("\n----- NavigableMap Methods -----");

                // System.out.println("Descending Map: "
                // + treeMap.descendingMap());

                // System.out.println("Poll First Entry: "
                // + treeMap.pollFirstEntry());

                // System.out.println("Poll Last Entry: "
                // + treeMap.pollLastEntry());

                // System.out.println("After Polling: "
                // + treeMap);

                // // ===========================
                // // 5. EXTRA MAP METHODS
                // ===========================
                System.out.println("\n----- Extra Map Methods -----");

                HashMap<Integer, String> map = new HashMap<>();

                map.put(1, "Java");
                map.put(2, "Python");

                // putIfAbsent()
                map.putIfAbsent(3, "C++");

                // getOrDefault()
                System.out.println(map.getOrDefault(5, "Not Found"));

                // replace()
                map.replace(1, "Java SE");

                // remove(key,value)
                map.remove(2, "Python");

                // forEach()
                map.forEach((k, v) -> System.out.println(k + " -> " + v));

                // clear()
                map.clear();

                System.out.println("Is Empty: "
                                + map.isEmpty());
        }
}