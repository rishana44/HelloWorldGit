package org.example;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввеcти тест");
        String userName = scanner.nextLine();

        System.out.println("Привет, " + userName);

        System.out.println(userName);
        System.out.println("Длина заданной строки: " + userName.length());

        String userName1 = userName + " " + userName;
        System.out.println(userName1);

        String userName3 = userName + " " + 100;
        System.out.println(userName3);

        char ch = userName.charAt(3);
        System.out.println(ch);

        System.out.println(userName.equals(userName1));

        System.out.println(userName.replace('н', 'к'));

        System.out.println(userName1.contains(userName));

        String userName4 = "";
        System.out.println(userName4.isEmpty());

        StringBuffer mutableString = new StringBuffer("Привет! ");
        mutableString.append("Меня зовут ");
        mutableString.append("Ирина! ");
        System.out.println(mutableString);
    }
}

