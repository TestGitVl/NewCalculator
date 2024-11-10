package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Калькулятор запущен\n");

        int x = in.nextInt();
        int y = in.nextInt();
        String operation = in.next();

        switch (operation){

            case "+":
                System.out.println("Результат: " + (x + y));
                break;

            case "-":
                System.out.println("Результат: " + (x - y));
                break;

            case "*":
                System.out.println("Результат: " + (x * y));
                break;

            case "/":
                System.out.println("Результат: " + (x / y));
                break;

            default:
                System.out.println("Ошибка операции");
        }
    }
}
