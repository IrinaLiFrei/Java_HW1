// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
// могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
// восстановить выражение до верного равенства. Предложить хотя бы
// одно решение или сообщить, что его нет
//2? + ?5 = 62
// 62 - 25 = 37
// 7 -> 27    3 -> 35.

// import java.util.Scanner;
public class RestoreMathExpression {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        String str = "2? + ?5 = 69";
        String[]arr = str.split(" ");
        String[]aStr = arr[0].split("");
        int a = Integer.parseInt(aStr[0]) * 10;
        String[]bStr = arr[2].split("");
        int b = Integer.parseInt(bStr[1]);
        int c = Integer.parseInt(arr[4]);
        // В своем решении от известной суммы (c) вычитаю известные десятки (а) и известные единицы (b).
        // После вычитания недостающие единицы прибавляю к известным десяткам, 
        // а недостающие десятки прибавляю к известным единицам
        if((a + b) <= c){
            int res = c - (a + b);
            a = a + (res%10);
            b = (res/10*10) + b;
            System.out.printf("%d + %d = %d", a, b, c);
        } else{
            System.out.println("No solution");
        }
        
        }
    }
