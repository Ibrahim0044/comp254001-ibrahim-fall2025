package ex2;

public class SinglyLinkedListDriver {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.addLast("E");

        System.out.println("Before " + list);

        //swap index 1 and 3  (B and D)
        list.swapByIndex(1, 3);

        System.out.println("After  " + list); // A, D, C, B, E
    }
}
