package ProgramMain;
import Task1.triangleNumber;
import Task2.factorialNumber;
import Task3.rangeNumber;
import Task4.primitiveCalculate;
public class ProgramMain {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Hello");
        System.out.println(triangleNumber.triangleNum(n)); // triangle равно 28
        System.out.println(factorialNumber.factorial(n));  // factorial n равно 5040
        rangeNumber.main(1);
        System.out.println("\n");
        primitiveCalculate.main(args);
    }
}
