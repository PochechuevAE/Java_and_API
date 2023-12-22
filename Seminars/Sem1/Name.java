// 📌 Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// 📌 Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

package Seminars.Sem1;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "ibm866");
        System.out.println("Введите своё имя: ");
        String name = scanner.nextLine();
        System.out.printf("Привет, %s", name);
        scanner.close();
    }
}
