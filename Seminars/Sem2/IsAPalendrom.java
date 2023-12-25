// Задание №3
// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

package Seminars.Sem2;

public class IsAPalendrom {
    public static void main(String[] args) {
        String str = "А роза упала на лапу Азора";
        String myStr = str.replaceAll(" ", "");
        System.out.println(isPallendromm(myStr.toLowerCase()));
    }

    public static boolean isPallendromm(String myStr) {
        int leftChar = 0;
        int rightChar = myStr.length() - 1;

        while (leftChar < rightChar){
            if (myStr.charAt(leftChar) != myStr.charAt(rightChar)){
                return false;
                
            }
            leftChar++;
            rightChar--;
        }
        return true;
    }
}
