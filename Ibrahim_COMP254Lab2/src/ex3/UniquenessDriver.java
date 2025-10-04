package ex3;

public class UniquenessDriver {
    public static void main(String[] args) {
        // arrays for testing
        int[] allUnique = {1, 2, 3, 4, 5};
        int[] hasDuplicate = {1, 2, 3, 2, 5};

        // test unique1
        System.out.println("unique1(allUnique) = " + Uniqueness.unique1(allUnique));
        System.out.println("unique1(hasDuplicate) = " + Uniqueness.unique1(hasDuplicate));

        // test unique2
        System.out.println("unique2(allUnique) = " + Uniqueness.unique2(allUnique));
        System.out.println("unique2(hasDuplicate) = " + Uniqueness.unique2(hasDuplicate));
    }
}
