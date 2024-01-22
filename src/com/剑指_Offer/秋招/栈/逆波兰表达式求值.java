package com.剑指_Offer.秋招.栈;

import java.util.Deque;
import java.util.LinkedList;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @project Learning
 * @date 2024/1/21 12:11:34
 */
public class 逆波兰表达式求值 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        int n = tokens.length;
        for (int i = 0; i < n; i++) {
            String token = tokens[i];
            if(isNumber(token)) {
                stack.push(Integer.parseInt(token));
            }else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                if (token.equals("+")){
                    stack.push(num1+ num2);
                }else if (token.equals("-")) {
                    stack.push(num1 - num2);
                }else if (token.equals("*")){
                    stack.push(num1 * num2);
                }else {
                    stack.push(num1 / num2);
                }
            }
        }
        return stack.pop();
    }

    private boolean isNumber(String token) {
        return !(token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/"));
    }
}
