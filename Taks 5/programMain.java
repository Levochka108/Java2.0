import com.google.gson.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class ClassMAin {

    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}," +
                "{\"фамилия\":\"Клочков\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Кузнецова\",\"оценка\":\"3\",\"предмет\":\"Математика\"}]";

        int[] numbers = {5, 1, 12, -5, 16, 2, 12, 14};
        parseJson(json);
        bubbleSort(numbers);

    }

    public static void bubbleSort(int[] array) {
        try {
            FileWriter writer = new FileWriter("log.txt");
            writer.write("Original array: ");
            for (int number : numbers) {
                writer.write(number + " ");
            }
            writer.write("\n");

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = 0; j < numbers.length - i - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                        writer.write("After iteration " + (i * (numbers.length - 1) + j + 1) + ": ");
                        for (int number : numbers) {
                            writer.write(number + " ");
                        }
                        writer.write("\n");
                    }
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void parseJson(String jsonString) {

        JsonParser parser = new JsonParser();
        JsonArray array = parser.parse(jsonString).getAsJsonArray();
        AtomicReference<StringBuilder> result = new AtomicReference<>(new StringBuilder());
        for (JsonElement element : array) {
            JsonObject object = element.getAsJsonObject();
            String surname = object.get("фамилия").getAsString();
            String mark = object.get("оценка").getAsString();
            String subject = object.get("предмет").getAsString();
            result.get().append("Студент ")
                    .append(surname)
                    .append(" получил ")
                    .append(mark)
                    .append(" по предмету ")
                    .append(subject)
                    .append(".\n");

        }
        System.out.println(result);
    }
}
