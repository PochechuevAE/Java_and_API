// Задание №1
// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на
// экран.

package Seminars.Sem3;

import java.util.Collections;

import java.util.ArrayList;
import java.util.Random;

public class GenerateArray {
    public static void main(String[] args) {
        int listSize = 10;

        ArrayList<Integer> arrayList = getRndList(listSize);

        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    private static ArrayList<Integer> getRndList(int listSize) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        Random rnd = new Random();

        for (int i = 0; i < listSize; i++){
            arrayList.add(rnd.nextInt(listSize));
        }
        return arrayList;
    }
}
