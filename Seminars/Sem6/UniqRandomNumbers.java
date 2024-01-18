// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
// цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с
// помощью Set вычислите процент уникальных значений в данном массиве и
// верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве.

import java.util.Random;

public class UniqRandomNumbers {
    public static void main(String[] args) {
        int size = 1000;
        int[] numbers = new int[size];
        fillArrayRandomNums(numbers, 25);
    }

    public static void fillArrayRandomNums(int[] array, int max) {
        Random rnd = new Random();


        for(int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(max);
        }
    }
}
