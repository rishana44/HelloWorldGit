package org.example;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "Exit";
        String str;

        do {
            System.out.print("Please enter something ");
            str = scanner.nextLine();
        } while (!str1.equalsIgnoreCase(str));
    }
}
