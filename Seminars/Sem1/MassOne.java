// 📌 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

package Seminars.Sem1;

public class MassOne {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 };
        int countMax = getCountMax(arr);

        System.out.printf("Максимальное кол-во подряд идущих единиц в массиве равно: %d", countMax);
    }

    private static int getCountMax(int[] arr) {
        int count = 0;
        int countMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                countMax = countMax > count ? countMax : count;
            } else {
                count = 0;

            }

        }
        return countMax;
    }
}
