package com.levochka108.newconvertmanagertoroman;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertManagerRome {
    private static final Map<Integer, String> dict = Stream.of(new Object[][]{
            {0,""},
            {1, "I"},
            {2, "II"},
            {3, "III"},
            {4, "IV"},
            {5, "V"},
            {6, "VI"},
            {7, "VII"},
            {8, "VIII"},
            {9, "IX"},
            {10, "X"},
            {20, "XX"},
            {30, "XXX"},
            {40, "XL"},
            {50, "L"},
            {60, "LX"},
            {70, "LXX"},
            {80, "LXXX"},
            {90, "XC"},
            {100, "C"},
            {200, "CC"},
            {300, "CCC"},
            {400, "CD"},
            {500, "D"},
            {600, "DC"},
            {700, "DCC"},
            {800, "DCCC"},
            {900, "CM"},
            {1000, "M"},

    }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (String) data[1]));

    public static void run() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число арабскими цифрами (например, 122): ");
        int numArabic = scan.nextInt();
        StringBuilder numRome = new StringBuilder();
        int pow = 1;

        while (numArabic != 0) {
            numRome.insert(0, dict.get((Integer) numArabic % 10 * pow));
            numArabic /= 10;
            pow *= 10;
        }
        System.out.println(numRome);
    }
}
