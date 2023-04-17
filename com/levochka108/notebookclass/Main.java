package com.levochka108.notebookclass;

import com.levochka108.notebookclass.db.DataBase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataBase dataBase = new DataBase();
        System.out.println("""
                Введите цифру, соответствующую необходимому критерию поиска
                1 - Разрешение дисплея
                2 - Модель ЦПУ
                3 - Тип операционной системы
                4 - Цена
                5 - Объем ОЗУ""");
        System.out.println("Выберети опцию: ");

        int run = scanner.nextInt();

        switch (run) {
            case 1 -> {
                System.out.print("Введите требуемое разрешение или формат (например, \"Full HD\"): ");
                var resolution = scanner.nextLine();
                dataBase.searchByResolution(resolution);
            }
            case 2 -> {
                System.out.print("Введите модель ЦПУ (например, \"Celeron\"): ");
                var cpu = scanner.nextLine();
                dataBase.searchByCPU(cpu);
            }
            case 3 -> {
                System.out.print("Введите марку операционной системы (например, \"Windows 10\"): ");
                var os = scanner.nextLine();
                dataBase.searchByOS(os);
            }
            case 4 -> {
                System.out.print("Введите нижнюю границу цены: ");
                double minPrice = scanner.nextDouble();
                double maxPrice;
                do {
                    System.out.print("Введите верхнюю границу цены: ");
                    maxPrice = scanner.nextDouble();
                } while (maxPrice <= minPrice);
                dataBase.searchByPrice(minPrice, maxPrice);
            }
            case 5 -> {
                System.out.print("Введите нижнюю границу объема ОЗУ: ");
                int minRAM = scanner.nextInt();
                int maxRAM;
                do {
                    System.out.print("Введите верхнюю границу объема ОЗУ: ");
                    maxRAM = scanner.nextInt();
                } while (maxRAM <= minRAM);
                dataBase.searchByRAM(minRAM, maxRAM);
            }
            default -> throw new IllegalStateException("Таких значений нет " + run);
        }
    }
}
