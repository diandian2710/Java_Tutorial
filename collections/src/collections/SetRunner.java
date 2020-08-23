package collections;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'Z', 'C', 'F', 'B', 'C');
        //unique - Set
        //Tree
        //Hash
        //LinkedHash
        System.out.println(characters); //list allow duplicated value
        // set only allow unique value
        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println(treeSet); // sorted order
        Set<Character> linkHashSet = new LinkedHashSet<>(characters);
        System.out.println(linkHashSet); // insertion order
        Set<Character> hashSet = new HashSet<>(characters);
        System.out.println(hashSet); // neither sorted nor inserted order
    }
}
