import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание 1: Целые числа");
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Сложение:    a + b = " + (a + b));
        System.out.println("Вычитание:   a - b = " + (a - b));
        System.out.println("Умножение:   a * b = " + (a * b));
        if (b != 0) {
            System.out.println("Деление:     a / b = " + (double) a / b);
        } else {
            System.out.println("Деление:     деление на ноль невозможно");
        }

        System.out.println();
        System.out.println("Задание 2: Сравнение строк");
        scanner.nextLine();
        System.out.print("Введите строку a: ");
        String strA = scanner.nextLine();
        System.out.print("Введите строку b: ");
        String strB = scanner.nextLine();

        if (strA.equals(strB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        System.out.println();
        System.out.println("Задание 3: Четные числа из массива");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Чётные числа: ");
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}