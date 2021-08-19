package com.codechallenges.datastructure;

import java.util.Map;
import java.util.Stack;

public class MatchingParentheses {

    public static void main(String[] args) {

        String t1 = "<asdfassad>[](asdfsd)";
        String t2 = "<asdfassad>][(asdfsd)";
        String t3 = "";

        System.out.println(matchingParentheses(t1));
        System.out.println(matchingParentheses(t2));
        System.out.println(matchingParentheses(t3));

    }

    private static boolean matchingParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> blockSymbols = Map
                .of(')', '(', ']', '[', '>', '<');

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (blockSymbols.containsValue(current)) {
                stack.push(current);
                continue;
            }

            if (blockSymbols.containsKey(current) &&
                    (stack.isEmpty() ||
                            blockSymbols.get(current) != stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
