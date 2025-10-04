package ex1;

public class ExercisesDriver {
    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
            b[i] = n - i;
        }

        System.out.println(Exercises.example1(a));
        System.out.println(Exercises.example2(a));
        System.out.println(Exercises.example3(a));
        System.out.println(Exercises.example4(a));
        System.out.println(Exercises.example5(a, b));
    }
}
