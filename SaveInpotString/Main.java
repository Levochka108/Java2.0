package SaveInpotString;

import java.util.*;

public class Main {
    private static ArrayDeque<String> dataBase = new ArrayDeque<>();
    public static void main(String[] args) {
        do write(); while (true);

    }

    private static void saveToDB(String input){
        dataBase.push(input);
    }

    private static String getUserInput(){
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    private static void write() {
        String userInput = getUserInput();
        if (userInput.equalsIgnoreCase("print")) {
            System.out.println(dataBase);
        } else if (userInput.equalsIgnoreCase("revert")) {
            dataBase.pop();
            System.out.println(dataBase);
        }else saveToDB(userInput);
    }
}
