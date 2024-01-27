package HW.HW7;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ToyLottery {
    private PriorityQueue<Toy> toysQueue;

    public ToyLottery() {
        toysQueue = new PriorityQueue<>(new ToyComparator());
    }

    public void addToy(Toy toy) {
        toysQueue.offer(toy);
    }

    public void generateLottery() {
        for (int i = 0; i < 10; i++) {
            Toy drawnToy = drawToy();
            System.out.println("Draw " + (i + 1) + ": " + (drawnToy != null ? drawnToy : "null"));
        }
    }

    private Toy drawToy() {
        if (toysQueue.isEmpty()) {
            return null;
        }

        int totalFrequency = toysQueue.stream().mapToInt(Toy::getFrequency).sum();
        int randomNumber = (int) (Math.random() * totalFrequency) + 1;

        int currentFrequency = 0;
        for (Toy toy : toysQueue) {
            currentFrequency += toy.getFrequency();
            if (randomNumber <= currentFrequency) {
                System.out.println(randomNumber);
                return toy;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        ToyLottery toyLottery = new ToyLottery();
        toyLottery.acceptToyDataFromUser();
        toyLottery.generateLottery();
    }

    private void acceptToyDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество игрушек в коллекции: ");
        int numberOfToys = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfToys; i++) {
            
            System.out.println("Введите данные для игрушки " + (i + 1)
                    + ", разделяя их запятой, без пробела: ('id','название','частота выпадения'):");
            String[] toyData = scanner.nextLine().split(",");
            Toy toy = new Toy(Integer.parseInt(toyData[0]), toyData[1], Integer.parseInt(toyData[2]));
            addToy(toy);
            System.out.println();
        }

        scanner.close();
    }

    public class ToyComparator implements Comparator<Toy> {
        @Override
        public int compare(Toy toy1, Toy toy2) {
            return Integer.compare(toy2.getFrequency(), toy1.getFrequency());
        }
    }
}
