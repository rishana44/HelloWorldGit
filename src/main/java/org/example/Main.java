package org.example;
public class Main {
    public static void main(String args[]) {

        Customer irina = new Customer("Irina", "Makarenko", "Golovatskogo str", "6786 7754 4344 3533");

        Employee olga = new Employee("Olga", "Antonenko", "Mazurova 11", 2500);
        irina.display();
        System.out.println("");
        olga.display();
    }
}