package ex1;

public class DoublyLinkedListDriver {
    public static void main(String[] args) {
        // list L
        DoublyLinkedList<String> list1 = new DoublyLinkedList<>();
        list1.addLast("A");
        list1.addLast("B");
        list1.addLast("C");

        // list M
        DoublyLinkedList<String> list2 = new DoublyLinkedList<>();
        list2.addLast("D");
        list2.addLast("E");
        list2.addLast("F");

        System.out.println("Before concatenation:");
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        // L + M
        list1.concatenate(list2);

        System.out.println("\nAfter concatenation:");
        System.out.println("List1: " + list1);   // A, B, C, D, E, F
        System.out.println("List2: " + list2);   // empty
    }
}
