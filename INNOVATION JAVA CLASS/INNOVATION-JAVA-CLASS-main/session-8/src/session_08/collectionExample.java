package session_08;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;

public class collectionExample {
    public static void main(String[] args) {
        // Using the List interface with an ArrayList implementation for flexibility
        List<String> list = new ArrayList<>();
        // Direct ArrayList reference (tied to ArrayList functionality)
        ArrayList<String> arrList = new ArrayList<>();
        // LinkedList uses a doubly linked list under the hood, good for frequent insertions/removals
        LinkedList<Integer> linkList = new LinkedList<>();

        // Add elements to the list (allows duplicates and preserves insertion order)
        list.add("Java");
        list.add("Python");
        list.add("Java");  // duplicate is allowed
        list.add("Nextjs");
        System.out.println("List contents: " + list);

        // HashSet: stores unique elements, no guaranteed ordering
        Set<String> set = new HashSet<>();
        set.add("TVS");
        set.add("Yamaha");
        set.add("Honda");
        set.add("Yamaha"); // duplicate will not be added
        System.out.println("HashSet contents: " + set);

        // TreeSet: stores unique elements in sorted order
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("TVS");
        treeSet.add("Yamaha");
        treeSet.add("Honda");
        treeSet.add("Yamaha"); // duplicate will not be added
        System.out.println("TreeSet (sorted) contents: " + treeSet);

        // HashMap: key-value pairs, keys unique, values can be duplicated
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Html5");
        map.put(2, "CSS");
        map.put(3, "Bootstrap");
        System.out.println("Map contents before update: " + map);

        // Updating an existing key replaces its value
        map.put(1, "Reactjs");
        System.out.println("Map contents after update: " + map);
    }
}
