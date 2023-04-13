package listofemployees.com.levochka108;

import java.util.*;

public abstract class Program {
    public static void run(String[] names) {
        Map<String, Integer> topName = new HashMap<>();
        for (String getName : names) {
            String countName = getName.split(" ")[0].toLowerCase();
            topName.put(countName, topName.get(countName) == null ? 1 : topName.get(countName) + 1);
        }

        List<Integer> ratingOfNames = new ArrayList<>(topName.values());
        ratingOfNames.removeIf(x -> x <= 1);
        ratingOfNames.sort(Collections.reverseOrder());

        for (int rating : ratingOfNames) {
            for (var name : topName.entrySet()) {
                if (name.getValue() == rating)
                    System.out.println(name.getKey().substring(0, 1).toUpperCase() + name.getKey().substring(1) + " встречается " + name.getValue() + " раз(а).");
            }
        }
    }
}





