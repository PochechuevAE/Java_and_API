// Задание №4
// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения

package Seminars.Sem2;

import java.io.FileWriter;
import java.io.IOException;

public class CreataStringAndFile {
    public static void main(String[] args) {
        String str = "TEST";
        String repitWord = CreateString(str, 100);
        System.out.println(repitWord);
        writeToFile(repitWord, "testFile.txt");
    }

    public static String CreateString(String str, int repeat) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 1; i < repeat + 1; i++) {
            newStr.append(i).append(str);
        }
        return newStr.toString();
    }

    public static void writeToFile(String newStr, String fileName) {
        
        try{
            FileWriter fwriter = new FileWriter(fileName);
            fwriter.write(newStr);
            fwriter.close();
        } catch (IOException e){
            System.err.println("Ошибка записи файла");
        }
        
    }
}
