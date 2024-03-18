package org.example;
import java.util.Scanner;
      public class Task4 {
        public static void main(String[] args) {
            System.out.print("Enter TV channel: ");
            String str = new String();
            Scanner scanner = new Scanner(System.in);
            for (String[] channels = {"ONT", "BT", "NTV", "TNT", "Euro-news", "A-One", "Europa Plus", "TV 1000"};; ) {
                str = scanner.nextLine();
                if (str.equals("0")) {
                    break;
                }
                System.out.println(channels[Integer.parseInt(str)-1]);
            }
        }
    }


