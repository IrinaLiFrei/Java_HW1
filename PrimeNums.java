// 2. Вывести все простые числа от 1 до 1000
import java.util.Scanner;
public class PrimeNums {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;             
            }
    }
    System.out.println();
}
    public static boolean isPrime(int i) {
        boolean t = false;
        if (i == 2) {
            t = true;
        }
        for (int j = 2; j < i; j++) {
            if (j == (i - 1)) {
                t = true;
            }
            if ((i % j) == 0) {
                break;
            }
        }
        return t;
    }
}
