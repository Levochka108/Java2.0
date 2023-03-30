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
        int n = array.length;
        try {
            FileWriter writer = new FileWriter("log.txt", true);
            writer.write("Original array: ");
            writer.write("\n");
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (arr[j] > array[j+1]) {
                        int temp = arr[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                        writer.write(number + " ");
                    }
                }
                writer.write(MessageFormat.format("{0} \n", Arrays.toString(array)));
                writer.write("After iteration " + (i * (array.length - 1) + i + 1) + ": ");
                writer.write("\n");
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