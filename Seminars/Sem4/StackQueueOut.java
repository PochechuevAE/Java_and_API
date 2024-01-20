package Seminars.Sem4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueOut {
    public static void main(String[] args) {
        int[] array = {34, 65, 23, 3, 98, 2, -5, 878};

        Stack<Integer> stack = new Stack<>();

        for (int elem : array) {
            stack.push(elem);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println();


        Queue<Integer> queue = new LinkedList<>();
        for (int elem : array) {
            queue.add(elem);
        }

        System.out.println(queue);
    }
}