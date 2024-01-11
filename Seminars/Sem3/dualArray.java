// Задание №4
// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.
package Seminars.Sem3;

import java.util.ArrayList;
import java.util.List;

public class dualArray {

    public static void main(String[] args) {
        List<ArrayList<String>> catolog = new ArrayList<>();

        ArrayList<String> genre1 = new ArrayList<>();
        genre1.add("Жанр1");
        genre1.add("Книга1");
        genre1.add("Книга2");
        genre1.add("Книга3");

        ArrayList<String> genre2 = new ArrayList<>();
        genre2.add("Жанр2");
        genre2.add("Книга1");
        genre2.add("Книга2");
        genre2.add("Книга3");

        ArrayList<String> genre3 = new ArrayList<>();
        genre3.add("Жанр3");
        genre3.add("Книга1");
        genre3.add("Книга2");
        genre3.add("Книга3");

        catolog.add(genre1);
        catolog.add(genre2);
        catolog.add(genre3);

        System.out.println(catolog);

    }
}