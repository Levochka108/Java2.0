package IntroJavaLang.Task1.Task4;
import java.util.Scanner;
public class primitiveCalculate {


    public static void main(String[] args) {
        System.out.println("\uD83D\uDCBBWelcome! This is Primitive Calculate\uD83D\uDCBB!");

       int flag = 1;
        while (flag == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;

                default:
                    System.out.printf("Error! Enter correct operator");
                    return;
            }
            System.out.print("\nThe result is given as follows:\n");
            System.out.printf(num1 + " " + operator + " " + num2 + " = " + result);

            System.out.println("\nExit = 0, Next = 1: choice enter >");

            int outProgram = scanner.nextInt();
            if (outProgram == 0){
                System.out.println("\n\uD83D\uDC4BSee you soon!");
                flag = 0;
            }
        }
    }
}