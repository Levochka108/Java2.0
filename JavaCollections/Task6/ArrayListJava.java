package JavaCollections.Task6;
/*
* Задача:
* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
*
* */

import java.util.ArrayList;

public class ArrayListJava {

    public static void main(String[] args) {
        System.out.println("The Random generator, happy to see you!");
        runRandomArray(108 + 1);
    }

    public static void runRandomArray(Integer number) {
        ArrayList<Integer> myArray = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            double j = Math.random() * 100;
            myArray.add((int) j);
        }

        double min = myArray.get(0);
        double max = myArray.get(0);

        for (int current : myArray) {
            if (current < min) min = current;
            if (current > max) max = current;

        }

        double summa = myArray.stream().mapToDouble(integer -> integer).sum();
        double average = summa / myArray.size();

        System.out.println(myArray);
        System.out.println("Минимальное значение в списке: " + (int) min);
        System.out.println("Максимальное значение в списке: " + (int) max);
        System.out.println("Максимальное значение в списке: " + (int) average);
        System.out.println("This program is DONE!");
        System.out.println("See you soon and take care!");
    }
}

