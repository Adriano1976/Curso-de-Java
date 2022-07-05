package application;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a folder path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println();
        System.out.println("FOLDERS LIST:");
        System.out.println();
        assert folders != null;
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println();
        System.out.println("FILES LIST:");
        System.out.println();
        assert files != null;
        for (File file : files) {
            System.out.println(file);
        }

        boolean suceess = new File(strPath + "\\Subdir").mkdir();
        System.out.println();
        System.out.println("Directory created successfully: " + suceess);
        System.out.println();
        System.out.println("getPath: " + path.getPath());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getName: " + path.getName());

        scanner.close();
    }
}
