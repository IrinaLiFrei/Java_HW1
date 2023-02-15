// 3. Реализовать простой калькулятор
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        System.out.printf("%d + %d = %d", a, b, getSum(a, b));
        System.out.printf("\n%d - %d = %d", a, b, getSubtraction(a, b));
        System.out.printf("\n%d * %d = %d", a, b, getProduct(a, b));
        System.out.printf("\n%d : %d = %.2f", a, b, getDivision(a, b));
    }

    public static int getSum(int num1, int num2){
        return num1 + num2;
    }

    public static int getSubtraction(int num1, int num2){
        return num1 - num2;
    }

    public static int getProduct(int num1, int num2){
        return num1 * num2;
    }

    public static double getDivision(int num1, int num2){
        return num1/num2;
    }

}
