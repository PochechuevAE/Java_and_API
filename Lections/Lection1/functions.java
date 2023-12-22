package Lections.Lection1;

public class functions {
   
    static public void sayHi(){
            System.out.println("hi");
        }
    
    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(double n) {
        if(n==1)return 1;
        return n * factor(n-1);
    }

}
