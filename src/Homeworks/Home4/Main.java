package Homeworks.Home4;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
         whileTenCats();
        forTenCats();
        doWhileCat();
        foreachMassive();

    }

    public static void whileTenCats() {

        int a = 1;
        while (a <= 10) {
            System.out.println(new Cat());
            a++;

        }

    }

    public static void forTenCats() {
        Cat cat2 = new Cat();


        for (int i = 1; i <= 10; i++) {

            cat2.setName();
            cat2.setAge();


        }

        System.out.println("Cat name is " + cat2.getName() + " and its age is " + cat2.getAge());

    }

    public static void doWhileCat() {
        int a = 1;

        do {
            Cat cat3 = new Cat("Borya", 22);
            System.out.println(cat3);
            a++;

        } while (a <= 10);
    }

    public static void foreachMassive() {
        Cat[] array = new Cat[5];
        array[0] = new Cat();
        array[1] = new Cat();
        array[2] = new Cat();
        array[3] = new Cat();
        array[4] = new Cat();
        for (Cat indexOfArray : array) {
            System.out.println(indexOfArray);
        }

    }
}
