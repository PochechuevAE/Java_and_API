package Lections.Lection1;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        System.out.println("Starting");
        String s = "qwerty";
        System.out.println(s.charAt(1)); 
        System.out.println(s);
        System.out.println("Целые числа: ");
        short age = 10;
        int salary = 123456;
        System.out.println(age);
        System.out.println(salary);
        System.out.println("Вещественные числа: ");
        float e = 2.7f; // В обязательном порядке в конце ставить "f"
        double pi = 3.1415;
        System.out.println(e);
        System.out.println(pi);
        System.out.println("Тип данных чар");
        char ch = '1';
        System.out.println(Character.isDigit(ch));
        ch = 'a';
        System.out.println(Character.isDigit(ch));
        System.out.println("Тип булиан");
        boolean flag_one = 123 <= 234;
        System.out.println(flag_one);
        boolean flag_two = 123 >=234 || flag_one;
        System.out.println(flag_two);
        boolean flag_thre = flag_one ^ flag_two;
        System.out.println(flag_thre);
        System.out.println("Строки");
        String mag = "Hello world!";
        System.out.println(mag);
        System.out.println("Неявная типизация");
        var i = 123; // Сам выберет подходящий тип
        System.out.println(i);
        System.out.println(getType(i));
        var d = 12.343;
        System.out.println(d);
        System.out.println(getType(d));
        System.out.println("Массивы!");

        int [] arr = new int[10];
        System.out.println(arr.length);
        arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(arr.length);
        System.out.println(arr[2]);
        System.out.println("Многомерные массивы");
        int [] array [] = new int[3][5];
        for (int [] line : array){
            for (int item : line){
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

        int [][] mass = new int[3][5];
        for (int a = 0; a < mass.length; a++){
            for (int j = 0; j < mass[a].length; j++){
                System.out.printf("%d ", mass[a][j]);
            }
            System.out.println();
        }
        
        System.out.println("Чтобы пользователь ввел данные нужго:");
        System.out.println("1. import Scanner");
        System.out.println("2. подключиться к нему 3. запросить"); 

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine(); // nextInt/ nextDouble...
        System.out.printf(" Привет, %s!", name);
        iScanner.close();
                
    



    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}
// Комментарий обычный
/*
 * Комментарий многострочный
 */

