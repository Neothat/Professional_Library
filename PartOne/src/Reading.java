import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Date;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        System.out.println(inputTest());

        // Console для ввода паролей
        // Получаем консоль
        Console console = System.console();
        if (console != null) {
            // считываем данные с консоли
            String login = console.readLine("Введите логин:");
            char[] password = console.readPassword("Введите пароль:");

            console.printf("Введенный логин: %s \n", login);
            console.printf("Введенный пароль: %s \n", new String(password));
        }

        double x = 10000.0 / 3.0;
        System.out.print(x); // 3333.3333333333335
        System.out.printf("%8.2f ", x); // 3333.33
        System.out.printf("%,.2f", 10000.0 / 3.0); // 3,333.33 не работает
        // "%, (. 2f" Тоже самое + отрицательные числа будут в скобках

        System.out.println();
        System.out.printf("%tc", new Date()); // Mon Feb 09 18:05:19 PST 2015
        System.out.println();
        System.out.printf("%1$s %2$tB %2$te, %2$tY",
                "Due date:", new Date()); // Due date: February 9, 2015

        try {
            Scanner in = new Scanner(Path.of("myfile.txt"), StandardCharsets.UTF_8); // Чтение из файла
            PrintWriter out = new PrintWriter("с:\\mydirectory\\myfile.txt", StandardCharsets.UTF_8); // Запись в файл
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String inputTest() {
        Scanner scanner = new Scanner(System.in);

        // Получить первую вводимую строку
        System.out.println("What is your name? ");
        String name = scanner.nextLine(); // Вводимая строка может содержать пробелы
        String firstName = scanner.next(); // Одно слово, отделенное пробелом

        // Получить вторую вводимую строку
        System.out.println("How old are you? ");
        int age = scanner.nextInt(); // Чтение целочислительного значения

        // Вернуть результат
        System.out.printf("Hello, %s. Next year, you'll Ье %d", name, age);
        return new String("Hello, " + name + ". Next year, you'll Bе " + (age + 1));
    }
}
