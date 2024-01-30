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
 * @date 2024/1/22 09:40:18
 */
public class 基本计算器 {
    public int calculate(String s) {
        int result = 0;
        Deque<Integer> stack = new LinkedList<>();
        stack.add(1);
        int sign = 1;
        int n = s.length();
        int i = 0;
        while(i < n){
            if (s.charAt(i) == ' '){
                i++;
            }else if (s.charAt(i) == '+'){
                sign = stack.peek();
                i++;
            } else if (s.charAt(i) == '-') {
                sign = -stack.peek();
                i++;
            } else if (s.charAt(i) == '(') {
                stack.push(sign);
                i++;
            } else if (s.charAt(i) == ')') {
                stack.pop();
                i++;
            }else {
                long num = 0;
                while(i < n && Character.isDigit(s.charAt(i))){
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                result += sign*num;
            }
        }
        return result;
    }
}
