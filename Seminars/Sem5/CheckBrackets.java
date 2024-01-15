// Задание №2
// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

package Seminars.Sem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        String[] tokens = {"a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}"};
        for (String string : tokens) {
            boolean result = checkBrackets(string);
            System.out.println(string + " => " + result);
        }
        
    }

    public static Map<Character, Character> getBracketsMap() {
        Map<Character, Character> bracketsMap = new HashMap<Character, Character>();
        bracketsMap.put(')', '(');
        bracketsMap.put('}', '{');
        bracketsMap.put(']', '[');
        bracketsMap.put('>', '<');
        return bracketsMap;
    }

    public static boolean checkBrackets(String testString) {
        Map<Character, Character> bracketsMap = getBracketsMap();
        Stack<Character> stack = new Stack<Character>();

        for (Character bracket : testString.toCharArray()) {
            if (bracketsMap.containsValue(bracket)) {
                stack.push(bracket);
            } else if (bracketsMap.containsKey(bracket)) {
                if ((stack.isEmpty()) || (stack.pop() == bracketsMap.get(bracket))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
