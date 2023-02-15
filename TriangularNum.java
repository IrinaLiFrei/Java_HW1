// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)
import java.util.Scanner;

public class TriangularNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println(getNum(num));
    }
    
    public static int getNum(int num) {
        return (num * (num + 1)) / 2;
    }
}   