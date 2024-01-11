/*
 * Задание №0
Даны следующие строки, cравнить их с помощью == и
метода equals() класса Object
String s1 = "hello";
String s2 = "hello";
String s3 = s1;
String s4 = "h" + "e" + "l" + "l" + "o";
String s5 = new String("hello");
String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
 */


package Seminars.Sem3;

public class CompareStrings {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println("S1 & S2");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("S1 & S3");
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println("S1 & S4");
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
        System.out.println("S1 & S5");
        System.out.println(s1 == s5);
        System.out.println(s1.equals(s5));
        System.out.println("S1 & S6");
        System.out.println(s1 == s6);
        System.out.println(s1.equals(s6));
        System.out.println("S5 & S6");
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
    }
}
