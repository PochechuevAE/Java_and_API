// Задание №2
// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.
// результат: a4b3c1d2
package Seminars.Sem2;

public class ZipString {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.printf("Дана строка: %s\n", str);
        System.out.printf("Сжатая строка: %s", countChars(str));
    }

    public static String countChars(String str) {
        StringBuilder result = new StringBuilder();
        int countChars = 0;
        char sim = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == sim) {
                countChars++;
            } else {
                result.append(sim).append(countChars);
                countChars = 1;
                sim = str.charAt(i);
            }
            
            
        }
        result.append(sim).append(countChars);
        return result.toString();
    }
}
