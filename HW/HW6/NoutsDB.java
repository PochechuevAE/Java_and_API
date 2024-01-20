package HW.HW6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class NoutsDB {
    public static void main(String[] args) {
        Nouts noutOne = new Nouts("ASUS TUF Gaming F15 FX506HC-HN006", 85_000, "ASUS", "Windows 10", 16, 512, "Silver");
        Nouts noutTwo = new Nouts("ASUS Vivobook 15 M1502IA-BQ097", 62_800, "ASUS", "Windows 11", 8, 256, "White");
        Nouts noutThree = new Nouts("MSI GF63-225XRU", 79_900, "MSI", "Windows 10", 16, 512, "Gray");
        Nouts noutFour = new Nouts("HP Victus 16-d000053ur", 95_700, "HP", "Linux", 16, 512, "Black");
        Nouts noutFive = new Nouts("Lenovo IdeaPad Gaming 3 15ACH6", 80_800, "Lenovo", "No", 16, 512,
                "White");

        Set<Nouts> noutsDB = new HashSet<Nouts>(Arrays.asList(noutOne, noutTwo, noutThree, noutFour, noutFive));

        for (Nouts nout : noutsDB) {
            System.out.println(nout);
        }

        filterLaptops(noutsDB);

    }

    public static void filterLaptops(Set<Nouts> laptops) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> criteriaMap = new HashMap<>();
        criteriaMap.put("1", "ram");
        criteriaMap.put("2", "hardDiskSpace");
        criteriaMap.put("3", "operatingSystem");
        criteriaMap.put("4", "color");
        criteriaMap.put("5", "price");
        criteriaMap.put("6", "producer");

        Map<String, Object> filters = new HashMap<>();

        System.out.println();
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                "1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Операционная система\n" +
                "4 - Цвет\n" +
                "5 - Цена\n" +
                "6 - Производитель");

        String userInput = scanner.nextLine();
        if (criteriaMap.containsKey(userInput)) {
            String criterion = criteriaMap.get(userInput);

            System.out.println();
            System.out.println("Введите минимальное значение для критерия " + criterion + ":");
            String minInput = scanner.nextLine();

            // Добавляем критерий и минимальное значение в фильтры
            filters.put(criterion, minInput);

            // Фильтруем и сразу добавляем в TreeSet, который автоматически отсортирует элементы
            TreeSet<Nouts> filteredLaptops = laptops.stream()
                    .filter(nout -> {
                        switch (criterion) {
                            case "ram":
                                return nout.getRam() >= Integer.parseInt(minInput);
                            case "hardDiskSpace":
                                return nout.getHardDiskSpace() >= Integer.parseInt(minInput);
                            case "operatingSystem":
                                return nout.getOperatingSystem().equalsIgnoreCase(minInput);
                            case "color":
                                return nout.getColor().equalsIgnoreCase(minInput);
                            case "price":
                                return nout.getPrice() >= Integer.parseInt(minInput);
                            case "producer":
                                return nout.getProducer().equalsIgnoreCase(minInput);
                            default:
                                return false;
                        }
                    })
                    .collect(Collectors.toCollection(TreeSet::new));

            // Выводим результаты фильтрации
            System.out.println("Результаты фильтрации (по цене по возрастанию):");
            for (Nouts laptop : filteredLaptops) {
                System.out.println(laptop);
            }
        } else {
            System.out.println("Некорректный выбор критерия.");
        }
        scanner.close();
    }

}
