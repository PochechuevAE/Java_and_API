// 📌 Дан массив nums = [3,2,2,3] и число val = 3.
// 📌 Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.

package Seminars.Sem1;

import java.util.Arrays;

public class MoweToEnd {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 2, 2, 3,2,3,3,2,3,3,4,5,6,234,34 };
        int val = 6;
        moweToEnd(arr, val);
        System.out.println(Arrays.toString(arr));
    }

    private static void moweToEnd(int[] arr, int val) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex < rightIndex) {
            while (arr[rightIndex] == val && rightIndex > leftIndex) {
                rightIndex--;
            }
            if (arr[leftIndex] == val) {
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
            }
            leftIndex++;
        }
    }
}
