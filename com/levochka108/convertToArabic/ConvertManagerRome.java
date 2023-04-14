package com.levochka108.convertToArabic;

import java.util.Scanner;

public class ConvertManagerRome {

    public static String intToRoman(int num) {
        var keys = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        var values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder ret = new StringBuilder();
        int ind = 0;

        while (ind < keys.length) {
            while (num >= values[ind]) {
                var d = num / values[ind];
                num = num % values[ind];
                ret.append(keys[ind].repeat(d));
            }
            ind++;
        }
        return ret.toString();
    }

    public static void runManager(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число арабскими цифрами (например, 108): ");

        int getNumber = scanner.nextInt();

        intToRoman(getNumber);

        System.out.println("Arabic numeral " + getNumber + " equal to: " +  intToRoman(getNumber));
    }
}
