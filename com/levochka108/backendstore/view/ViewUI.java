package com.levochka108.backendstore.view;

import com.levochka108.backendstore.model.BuildLaptop;
import com.levochka108.backendstore.model.support.*;
import com.levochka108.backendstore.repository.LaptopRepo;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static com.levochka108.backendstore.repository.LaptopRepo.connect;

public class ViewUI {
    private static final Map<Integer, BuildLaptop> DataBase = connect();
    private static final Scanner scanner = new Scanner(System.in);
    private static final LaptopRepo repository = new LaptopRepo();


    public static void runProgram() {
        while (true) {
            String choice = choiceMenu();
            String filter;
            switch (choice) {
                case "0":
                    System.exit(0);
                    break;
                case "repeat":
                    break;
                case "1":
                    System.out.println(DataBase.values());
                    break;
                case "2":
                    filter = filterChoice();
                    returnFilteredLaptops(filter);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }

    private static String choiceMenu() {
        System.out.println("Enter command: ");
        System.out.println("1 -> Show all laptops;");
        System.out.println("2 -> Filter laptops;");
        System.out.println("0 -> quit");
        System.out.print("Choice: ");
        String choice = scanner.next();
        if (userChoiceIsIncorrect(choice)) {
            return "Please, repeat command main Menu.";
        }
        return choice;
    }

    private static boolean userChoiceIsIncorrect(String choice) {
        choice = choice.trim();
        if (choice.equals("0")){
        System.out.println("See you soon!");
            return false;
        }
        if (choice.equals("1")) return false;
        if (choice.equals("3")) return false;
        if (choice.equals("4")) return false;
        if (choice.equals("5")) return false;
        return !choice.equals("2");
    }

    private static String filterChoice() {
        System.out.println("Enter filter: ");
        System.out.println("1 -> Filter laptops by brand, we have APPLE, ASUS, LENOVO and MSI;");
        System.out.println("2 -> Filter laptops by Os System, we have MacOs, FreeDos, Windows and Linux;");
        System.out.println("3 -> Filter laptops by CPU APPLE, AMD and INTEL");
        System.out.println("4 -> Filter laptops by Ram, we have SMALL and MIDDLE;");
        System.out.println("5 -> Filter laptops by Color, we have  BLACK, SILVER, GOLDEN and GREY;");
        System.out.println("0 -> quit");
        System.out.print("Choice: ");
        String choice = scanner.next();
        if (userChoiceIsIncorrect(choice)) {
            return "Please, repeat command.";
        }
        return choice;
    }

    private static void returnFilteredLaptops(String filter) {
        switch (filter) {
            case "0" -> {
                // опасна ли рекурсия в таком случаи?
                System.out.println("back to main Menu");
                //System.exit(0);
                runProgram();
            }
            case "1" -> {
                System.out.print("Enter brand: ");
                Brand brand = Brand.valueOf(scanner.next().toUpperCase());

                List<BuildLaptop> laptops = repository.getByBrand(brand);
                System.out.println(laptops);
            }
            case "2" -> {
                System.out.print("Enter OS: ");
                OperatingSystem operatingSystem = OperatingSystem.valueOf(scanner.next().toUpperCase());
                List<BuildLaptop> laptops = repository.getByOs(operatingSystem);
                System.out.println(laptops);
            }
            case "3" -> {
                System.out.print("Enter Cpu: ");
                CpuManufacturer cpuManufacturer = CpuManufacturer.valueOf(scanner.next().toUpperCase());
                List<BuildLaptop> laptops = repository.getByCpu(cpuManufacturer);
                System.out.println(laptops);
            }
            case "4" -> {
                System.out.print("Enter Ram: ");
                Ram ram = Ram.valueOf(scanner.next().toUpperCase());
                List<BuildLaptop> laptops = repository.getByRAm(ram);
                System.out.println(laptops);
            }
            case "5" -> {
                System.out.print("Enter color: ");
                Color color = Color.valueOf(scanner.next().toUpperCase());
                List<BuildLaptop> laptops = repository.getByColor(color);
                System.out.println(laptops);
            }
            default -> System.out.println("Invalid filter parameters entered.");
        }
    }
}
