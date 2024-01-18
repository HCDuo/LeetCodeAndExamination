package com.剑指_Offer.秋招.栈;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @project Learning
 * @date 2024/1/18 14:17:31
 */
public class 简化路径 {
    public String simplifyPath(String path) {
        String[] names = path.split("/");
        Deque<String> stacks = new ArrayDeque<>();
        for(String name : names) {
            if (name.equals("..")) {
                if (!stacks.isEmpty()) {
                    stacks.pollLast();
                }
            } else if (name.length() > 0 && !name.equals(".")) {
                stacks.offerLast(name);
            }
        }
        StringBuilder str = new StringBuilder();
        if (stacks.isEmpty()) {
            str.append("/");
        }else{
            while(!stacks.isEmpty()){
                str.append("/");
                str.append(stacks.pollFirst());
            }
        }
        return str.toString();
    }
}
