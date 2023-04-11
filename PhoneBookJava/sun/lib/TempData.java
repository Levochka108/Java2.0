package PhoneBookJava.sun.lib;

public class TempData {
    /*
     * Конструктор
     */
    public TempData(String name, String lastName, String phoneNumber, String workPhone, String additionalNumber) {
        userName = name;
        userLastName = lastName;
        number = phoneNumber;
        workNumber = workPhone;
        addNumber = additionalNumber;
    }

    public String userName;

    public String userLastName;

    public String number;

    public String workNumber;

    public String addNumber;

}
