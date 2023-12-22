// 📌 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

package Seminars.Sem1;

public class MassOne {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 ,1 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }

        }
    System.out.printf("Кол-во подряд идущих единиц в массиве равно: %d", count);
    }
}
