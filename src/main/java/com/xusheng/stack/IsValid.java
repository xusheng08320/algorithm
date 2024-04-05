package com.xusheng.stack;

import java.util.Stack;

public class IsValid {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if ('(' == c) {
                stack.push(')');
                continue;
            } else if ('{' == c) {
                stack.push('}');
                continue;
            } else if ('[' == c){
                stack.push(']');
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            Character pop = stack.pop();
            if (c != pop) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
