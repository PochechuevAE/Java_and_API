// Задание №2.1
// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке.
// Задание №2.2 (если выполнено первое задание)
// Пройти по списку из предыдущего задания и удалить
// повторяющиеся элем

package Seminars.Sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class SolarSystem {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add(0, "Меркурий");
        names.add(1, "Венера");
        names.add(2, "Земля");
        names.add(3, "Марс");
        names.add(4, "Юпитер");
        names.add(5, "Сатурн");
        names.add(6, "Уран");
        names.add(7, "Нептун");
        names.add(8, "Плутон");

        ArrayList<String> list = new ArrayList<String>();
        feelListFromNames(names, list);
        System.out.println("Первичный массив: ");
        System.out.println(list);
        System.out.println();
        countOfNames(names, list);        

    }

    private static void countOfNames(ArrayList<String> names, ArrayList<String> list) {
        int temp = 0;
        for (int i = 0; i < list.size(); i++){
            if (temp < names.size()){
                int count = Collections.frequency(list, names.get(temp));
                System.out.printf("Элемент %s Встречается %d раз(a)", names.get(i), count);
                System.out.println();
                temp++;
            }
            else{
                break;
            }
            
            
        }
    }

    private static void feelListFromNames(ArrayList<String> names, ArrayList<String> list) {
        Random random = new Random();
        int listSize = 20;

        for (int i = 0; i < listSize; i++) {
            int randIndex = random.nextInt(names.size());
            list.add(i, names.get(randIndex));
        }
    }

}
