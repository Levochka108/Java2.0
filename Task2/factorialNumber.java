package Task2;

public class factorialNumber {
    public static int factorial(int n) {
        int result;
        result = 1;
        if (n < 0) { // проверка на отрицательное число
            throw new IllegalArgumentException("n должно быть >= 0");
        }
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
