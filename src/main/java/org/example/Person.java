package org.example;
public class Person {
    String name;
    String surname;
    int age;
    String city;

    public Person (String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }
    public void print () {
        System.out.println("Имя: "+name+", Фамилия: "+surname+" Возраст: "+age+" Город: "+city+"");
    }
}
