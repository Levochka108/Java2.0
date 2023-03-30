import com.google.gson.*;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class ClassMAin {

    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}," +
                "{\"фамилия\":\"Клочков\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Кузнецова\",\"оценка\":\"3\",\"предмет\":\"Математика\"}]";

        int[] x = new int[]{json.length()};
        parseJson(json);
        bubbleSort(x);

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        try {
            FileWriter writer = new FileWriter("log.txt", true);
            writer.write("Original array: ");
            for (int number : arr) {
                writer.write(number + " ");
            }
            writer.write("\n");
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                writer.write(MessageFormat.format("{0} \n", Arrays.toString(arr)));
                writer.write("After iteration " + (i * (arr.length - 1) + i + 1) + ": ");
                for (int number : arr) {
                    writer.write(number + " ");
                }
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