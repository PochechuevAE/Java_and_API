// Задание №0
// Создать структуру для хранения Номеров паспортов и Фамилий
// сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

package Seminars.Sem5;

import java.util.TreeMap;

public class PasportName {
    public static void main(String[] args) {
       
        String targetName = "Иванов";

        TreeMap<Integer, String> hashMap = new TreeMap<Integer, String>();
        hashMap.put(123456, "Иванов");
        hashMap.put(321456, "Васильев");
        hashMap.put(234561, "Петрова");
        hashMap.put(234432, "Иванов");
        hashMap.put(654321, "Петрова");
        hashMap.put(345678, "Иванов");

        for (Integer paspoNumber : hashMap.keySet()) {
            String name = hashMap.get(paspoNumber);
            if (name.equals(targetName)) {
                System.out.println("Номер паспорта: " + paspoNumber + ", Фамилия: " + name);
            }
        }

    }
}
