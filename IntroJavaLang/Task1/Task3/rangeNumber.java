package IntroJavaLang.Task1.Task3;

public class rangeNumber {

        public static void main(int args) {
            for (int i = 2; i <= 1000; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
        private static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }


}

