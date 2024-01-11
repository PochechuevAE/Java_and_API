package Seminars.Sem4;


public class StackArray {
    static int capacity = 0;
    static int top = -1;
    static int[] stackArray;

    public static void main(String[] args) {
        capacity = 10;
        stackArray = new int[capacity];

        System.out.println(size());
        push(78);
        System.out.println(size());
        push(678);
        push(6);
        System.out.println(size());

        System.out.println(pop());

        System.out.println(size());

    }

    public static boolean empty() {
        return top == -1;
    }

    public static int size() {
        return top + 1;
    }

    public static void push(int value) {
        stackArray[++top] = value;
    }

    public static int peek() {
        return stackArray[top];
    }

    public static int pop() {
        return stackArray[top--];
    }

}