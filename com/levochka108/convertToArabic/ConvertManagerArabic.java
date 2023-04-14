package com.levochka108.convertToArabic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConvertManagerArabic {

    public static int transformNumber(String romanNum) {
        Map<Character, Integer> romanCharDict = new HashMap<Character, Integer>();
        romanCharDict.put('I', 1);
        romanCharDict.put('V', 5);
        romanCharDict.put('X', 10);
        romanCharDict.put('L', 50);
        romanCharDict.put('C', 100);
        romanCharDict.put('D', 500);
        romanCharDict.put('M', 1000);

        int res = 0;
        for (int i = 0; i < romanNum.length(); i += 1) {
            if (i == 0 || romanCharDict.get(romanNum.charAt(i)) <= romanCharDict.get(romanNum.charAt(i - 1)))
                res += romanCharDict.get(romanNum.charAt(i));
            else
                res += romanCharDict.get(romanNum.charAt(i)) - 2 * romanCharDict.get(romanNum.charAt(i - 1));
        }
        return res;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число римскими цифрами (например, CVIII): ");

        String numberRoman = scanner.next();

        int outputNumber = transformNumber(numberRoman);

        System.out.println("Roman numeral " + numberRoman + " equal to: " + outputNumber);
    }
}

