package Ex1;

import java.util.Scanner;

public class Ex1Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchTree tree = new SearchTree();

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        System.out.println("Enter numbers:");
        while (n-- > 0)
            tree.insert(sc.nextInt());

        System.out.print("Tree: ");
        tree.print();

        System.out.print("Search number: ");
        int k = sc.nextInt();

        System.out.println(tree.treeSearch(k) ? "Found." : "Not found.");
    }
}
