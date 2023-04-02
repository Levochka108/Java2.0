package JavaCollections.Task6;
import java.util.List;
import java.util.ArrayList;

/*
* Задача 2 :
* Пусть дан произвольный список целых чисел, удалить из него чётные числа.
* */

public class ListRemove {

        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            for ( int i = 1; i < 50; i++){
                numbers.add(i);
            }

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    numbers.remove(i);
                    i--;
                }
            }
            System.out.println(numbers);
        }
        private List<Integer> addNumToList(){
            List<Integer> numbers = new ArrayList<>();
            for ( int i = 1; i < 50; i++){
                numbers.add(i);
            }
            return numbers;

        }
    }


