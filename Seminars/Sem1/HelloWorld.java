// 📌 Настроить проект, вывести в консоль “Hello world!”.
// 📌 Вывести в консоль системные дату и время.

package Seminars.Sem1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(LocalDateTime.now());

        Scanner scanner = new Scanner(System.in, "ibm866"); // Кодировка для ввода русского
        String text = scanner.nextLine();
        System.out.println(text);
        scanner.close();

System.out.println();
    }
}
