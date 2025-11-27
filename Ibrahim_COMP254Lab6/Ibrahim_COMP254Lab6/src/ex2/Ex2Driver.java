package ex2;

import maps.SortedTableMap;

public class Ex2Driver {

    public static void main(String[] args) {

        SortedTableMap<Integer, String> map = new SortedTableMap<>();

        map.put(10, "Ten");
        map.put(20, "Twenty");
        map.put(30, "Thirty");

        System.out.println("Testing containsKey:");
        System.out.println("Key 10? " + map.containKey(10));  // true
        System.out.println("Key 20? " + map.containKey(20));  // true
        System.out.println("Key 99? " + map.containKey(99));  // false

        map.remove(20);

        System.out.println("After removing 20:");
        System.out.println("Key 20? " + map.containKey(20));  // false
    }
}
