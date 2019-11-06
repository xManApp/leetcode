package com.example.demo;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author 赵继
 *         2019/11/2.
 */
public class TestStack {

    public static void main(String[] args) {
        System.out.println(isValid("{}"));
    }



    public static boolean isValid(String s) {
        HashMap<Character, Character> mappings;

        mappings = new HashMap<>(3);
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!mappings.containsKey(c)) {
                stack.push(c);
            } else if ((stack.isEmpty()) || (!mappings.get(c).equals(stack.pop())) ) {
                return false;
            }
        }

        return stack.isEmpty();
    }

}
