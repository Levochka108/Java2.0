package PhoneBookJava.sun.lib;

public class TempData {
    /*
     * Конструктор
     */

    public String userName;

    public String userLastName;

    public String number;

    public String workNumber;

    public String addNumber;

    public TempData(String name, String lastName, String phoneNumber, String workPhone, String additionalNumber) {
        userName = name;
        userLastName = lastName;
        number = phoneNumber;
        workNumber = workPhone;
        addNumber = additionalNumber;
    }

    @Override
    public String toString() {
        return "TempData{" +
                "userName='" + userName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", number='" + number + '\'' +
                ", workNumber='" + workNumber + '\'' +
                ", addNumber='" + addNumber + '\'' +
                '}';
    }
}
