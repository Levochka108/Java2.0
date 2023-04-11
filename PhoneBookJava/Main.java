package PhoneBookJava;

import PhoneBookJava.sun.lib.*;

import java.util.Scanner;

/*
* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
*/
public abstract class Main {

    public static void main(String[] args) throws Exception {

        System.out.print("Запустить программу? Y/N ");
        Scanner scanner = new Scanner(System.in);
        String flag = scanner.next();
        System.out.println("Производится запись.");

        if (flag.equals("Y")) {
            DataBase phoneDataBase = new DataBase();

            System.out.print("Имя: ");
            String name = scanner.next();

            System.out.print("Фамилия: ");
            String lastName = scanner.next();

            System.out.print("Телефон: ");
            String phoneNumber = scanner.next();

            System.out.print("Рабочий телефон: ");
            String workPhone = scanner.next();


            System.out.print("Есть дополнительный номер? Y/N ");
            flag = scanner.next();
            if (flag.equals("Y")) {
                System.out.print("Дополнительный номер: ");
                String additionalNumber = scanner.next();
                phoneDataBase.recordDataContact(new TempData(name, lastName, phoneNumber, workPhone, additionalNumber));
            }else if (flag.equals("N")) {
                String isEmpty = "Нет данных";
                phoneDataBase.recordDataContact(new TempData(name, lastName, phoneNumber, workPhone,isEmpty));
            }

            System.out.print("Показать запись? Y/N ");
            flag = scanner.next();

            if (flag.equals("Y")){
                System.out.println("Исказть в базе: ");

                System.out.print("Имя: ");
                name = scanner.next();

                System.out.print("Фамилия: ");
                lastName = scanner.next();

                System.out.print("Номер телефона "+name+" "+lastName+": ");
                System.out.println(phoneDataBase.showRecordDataInPhoneBase(name,lastName).number);
                System.out.print("Рабочий телефон: ");
                System.out.print(phoneDataBase.showRecordDataInPhoneBase(name,lastName).workNumber);
                System.out.println();
                System.out.print("Дополнительный телефон: ");
                System.out.print(phoneDataBase.showRecordDataInPhoneBase(name,lastName).addNumber);
            }else {
                System.out.println("See you soon!");
            }


        }

    }
}
