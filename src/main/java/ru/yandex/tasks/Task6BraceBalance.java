package ru.yandex.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task6BraceBalance {
    public static boolean checkBalance(String sequence) {
        /*
         * sequence - последовательность скобок []{}() длины до 10^5
         * Выход: true/false, является ли строка ПСП
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        if(sequence.length() % 2 != 0){
            return false;
        }
        Map<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put(')', '(');
        bracketPairs.put('}', '{');
        bracketPairs.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char c : sequence.toCharArray()){
            if(bracketPairs.containsValue(c)){
                stack.push(c);
            } else if (bracketPairs.containsKey(c)){
                if(stack.isEmpty() || stack.pop() != bracketPairs.get(c)){
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void selfCheck() {
        String test1 = "[({})]{[]}";
        String test2 = "{({})}{";

        assert checkBalance(test1);
        assert !checkBalance(test2);
    }
}
