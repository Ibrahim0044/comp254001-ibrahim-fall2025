package ex3;
import java.io.File;
import java.util.Scanner;

public class exercise3 {

    //finds all files in the given path
    public static void find(String path, String filename) {
        File root = new File(path);

        // checks if the path exists
        if (!root.exists()) {
            System.out.println("Path not found: " + path);
            return;
        }

        // if  the name matches, print full path
        if (root.isFile() && root.getName().equals(filename)) {
            System.out.println("Found: " + root.getAbsolutePath());
        }

        // if it's a directory, go through each file/folder inside it
        if (root.isDirectory()) {
            File[] files = root.listFiles();
            if (files != null) {
                for (File f : files) {
                    find(f.getPath(), filename);   // recursive call
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting path: ");
        String path = sc.nextLine();

        System.out.print("Enter file name to search for: ");
        String filename = sc.nextLine();

        System.out.println("\nSearching...\n");
        find(path, filename);

        System.out.println("\nSearch complete.");
        sc.close();
    }
}
