package ex3;

public class CircularlyLinkedListDriver {
    public static void main(String[] args) {
        // list A B C
        CircularlyLinkedList<String> a = new CircularlyLinkedList<>();
        a.addLast("A");
        a.addLast("B");
        a.addLast("C");

        System.out.println("Original " + a);

        // clone
        CircularlyLinkedList<String> b = a.clone();

        System.out.println("Cloned   " + b);

        // change original
        a.addLast("D");
        System.out.println("After add on original " + a);
        System.out.println("Clone stays           " + b);
    }
}
