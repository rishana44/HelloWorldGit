package org.example;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tv = {"ONT", "BT", "NTV", "A-One", "Muz-TV"};
        int num;

        do {
            System.out.print("Enter TV channel: ");
            num = scanner.nextInt();

            if (num >= 1 & num <= 5) {
                System.out.println(tv[num - 1]);

            } else if (num == 0) {
                System.out.println("Exit");

            } else {
                System.out.println("Not found");
            }
        } while (num != 0);
    }
}