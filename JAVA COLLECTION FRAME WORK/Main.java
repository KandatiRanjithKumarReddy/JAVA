
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Collection<>;
        // Iterable<>;
        // Creating ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // add()
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("After add(): " + list);

        // add(index, element)
        list.add(1, 100);

        System.out.println("After add(index, element): " + list);

        // get()
        System.out.println("Element at index 2: " + list.get(2));

        // set()
        list.set(0, 999);

        System.out.println("After set(): " + list);

        // remove(index)
        list.remove(1);

        System.out.println("After remove(index): " + list);

        // remove(object)
        list.remove(Integer.valueOf(30));

        System.out.println("After remove(object): " + list);

        // size()
        System.out.println("Size: " + list.size());

        // contains()
        System.out.println("Contains 20? " + list.contains(20));

        // indexOf()
        System.out.println("Index of 20: " + list.indexOf(20));

        // lastIndexOf()
        list.add(20);

        System.out.println("List: " + list);
        System.out.println("Last index of 20: " + list.lastIndexOf(20));

        // isEmpty()
        System.out.println("Is Empty? " + list.isEmpty());

        // clone()
        ArrayList<Integer> copy = (ArrayList<Integer>) list.clone();

        System.out.println("Cloned List: " + copy);

        // addAll()
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(500);
        list2.add(600);

        list.addAll(list2);

        System.out.println("After addAll(): " + list);

        // removeAll()
        list.removeAll(list2);

        System.out.println("After removeAll(): " + list);

        // retainAll()
        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(20);

        list.retainAll(temp);

        System.out.println("After retainAll(): " + list);

        // clear()
        list.clear();

        System.out.println("After clear(): " + list);

        // add elements again
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);

        System.out.println("New List: " + list);

        // sort()
        Collections.sort(list);

        System.out.println("After sort(): " + list);

        // reverse()
        Collections.reverse(list);

        System.out.println("After reverse(): " + list);

        // equals()
        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(9);
        list3.add(5);
        list3.add(2);
        list3.add(1);

        System.out.println("Equals list3? " + list.equals(list3));

        // toArray()
        Object[] arr = list.toArray();

        System.out.println("Array Elements:");

        for (Object x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();

        // Traversing using for loop
        System.out.println("Using for loop:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Enhanced for loop
        System.out.println("Using enhanced for loop:");

        for (int num : list) {
            System.out.println(num);
        }

        // forEach()
        System.out.println("Using forEach():");

        list.forEach(System.out::println);

        // linked list
        // Creating LinkedList
        // LinkedList<Integer> list = new LinkedList<>();

        // // add()
        // list.add(10);
        // list.add(20);
        // list.add(30);

        // System.out.println("After add(): " + list);

        // // add(index, element)
        // list.add(1, 100);

        // System.out.println("After add(index, element): " + list);

        // // addFirst()
        // list.addFirst(999);

        // System.out.println("After addFirst(): " + list);

        // // addLast()
        // list.addLast(500);

        // System.out.println("After addLast(): " + list);

        // // get()
        // System.out.println("Element at index 2: " + list.get(2));

        // // getFirst()
        // System.out.println("First Element: " + list.getFirst());

        // // getLast()
        // System.out.println("Last Element: " + list.getLast());

        // // set()
        // list.set(0, 111);

        // System.out.println("After set(): " + list);

        // // remove(index)
        // list.remove(1);

        // System.out.println("After remove(index): " + list);

        // // remove(object)
        // list.remove(Integer.valueOf(30));

        // System.out.println("After remove(object): " + list);

        // // removeFirst()
        // list.removeFirst();

        // System.out.println("After removeFirst(): " + list);

        // // removeLast()
        // list.removeLast();

        // System.out.println("After removeLast(): " + list);

        // // size()
        // System.out.println("Size: " + list.size());

        // // contains()
        // System.out.println("Contains 20? " + list.contains(20));

        // // indexOf()
        // System.out.println("Index of 20: " + list.indexOf(20));

        // // lastIndexOf()
        // list.add(20);

        // System.out.println("List: " + list);
        // System.out.println("Last index of 20: " + list.lastIndexOf(20));

        // // isEmpty()
        // System.out.println("Is Empty? " + list.isEmpty());

        // // clone()
        // LinkedList<Integer> copy =
        // (LinkedList<Integer>) list.clone();

        // System.out.println("Cloned List: " + copy);

        // // addAll()
        // LinkedList<Integer> list2 = new LinkedList<>();

        // list2.add(500);
        // list2.add(600);

        // list.addAll(list2);

        // System.out.println("After addAll(): " + list);

        // // removeAll()
        // list.removeAll(list2);

        // System.out.println("After removeAll(): " + list);

        // // retainAll()
        // LinkedList<Integer> temp = new LinkedList<>();

        // temp.add(20);

        // list.retainAll(temp);

        // System.out.println("After retainAll(): " + list);

        // // clear()
        // list.clear();

        // System.out.println("After clear(): " + list);

        // // add elements again
        // list.add(5);
        // list.add(2);
        // list.add(9);
        // list.add(1);

        // System.out.println("New List: " + list);

        // // sort()
        // Collections.sort(list);

        // System.out.println("After sort(): " + list);

        // // reverse()
        // Collections.reverse(list);

        // System.out.println("After reverse(): " + list);

        // // equals()
        // LinkedList<Integer> list3 = new LinkedList<>();

        // list3.add(9);
        // list3.add(5);
        // list3.add(2);
        // list3.add(1);

        // System.out.println("Equals list3? " + list.equals(list3));

        // // toArray()
        // Object[] arr = list.toArray();

        // System.out.println("Array Elements:");

        // for (Object x : arr) {
        // System.out.print(x + " ");
        // }

        // System.out.println();

        // // Traversing using for loop
        // System.out.println("Using for loop:");

        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i));
        // }

        // // Enhanced for loop
        // System.out.println("Using enhanced for loop:");

        // for (int num : list) {
        // System.out.println(num);
        // }

        // // forEach()
        // System.out.println("Using forEach():");

        // list.forEach(System.out::println);

        // // peek()
        // System.out.println("Peek: " + list.peek());

        // // poll()
        // System.out.println("Poll: " + list.poll());

        // System.out.println("After poll(): " + list);

        // // push()
        // list.push(1000);

        // System.out.println("After push(): " + list);

        // // pop()
        // System.out.println("Pop: " + list.pop());

        // System.out.println("After pop(): " + list);
    }
}
