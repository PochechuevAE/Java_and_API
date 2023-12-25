// Задание №1
// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.

package Seminars.Sem2;

public class AltimatingChars {
    public static void main(String[] args) {
        int n = 500000;
        char cOne = 'x', cTwo = 'y';

        long start = System.currentTimeMillis();

        altimatingCharsString(n, cOne, cTwo);
        System.out.print("Время работы метода String: ");
        System.out.print(System.currentTimeMillis() - start);
        
        System.out.println();

        start = System.currentTimeMillis();
        altimatingCharsStringBuilder(n, cOne, cTwo);
        System.out.print("Время работы метода StringBuilder: ");
        System.out.print(System.currentTimeMillis() - start);



    }

    public static String altimatingCharsString(int n, char cOne, char cTwo) {
        String str = "";

        for (int i = 0; i < n / 2; i++){
            str += Character.toString(cOne) + Character.toString(cTwo);
        }
        return str;
    }

    public static String altimatingCharsStringBuilder(int n, char cOne, char cTwo) {
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n / 2; i++){
            sb.append(cOne).append(cTwo);
        }
        return sb.toString();
    }
}
