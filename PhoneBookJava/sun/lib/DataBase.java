package PhoneBookJava.sun.lib;

import java.util.HashMap;
import java.util.Map;

public class DataBase {

    public Map<String,TempData> phoneDataBase = new HashMap<>();

    public void recordDataContact(TempData person) {
        phoneDataBase.putIfAbsent(person.userName.toLowerCase() + person.userLastName.toLowerCase(), person);

    }

    public TempData showRecordDataInPhoneBase(String showName, String showLastName) {
        if (phoneDataBase.containsKey(showName.toLowerCase() + showLastName.toLowerCase()))
            return phoneDataBase.get(showName.toLowerCase() + showLastName.toLowerCase());
        else {
            throw new RuntimeException("Ничего не найдено.");
        }

    }
}