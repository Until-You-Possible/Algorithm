package com.example.algorithm.demos.Array;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i< s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topElement = stack.pop();
                if (currentChar == ')' && topElement != '(') {
                    return false;
                }
                if (currentChar == ']' && topElement != '[') {
                    return false;
                }
                if (currentChar == '}' && topElement != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
