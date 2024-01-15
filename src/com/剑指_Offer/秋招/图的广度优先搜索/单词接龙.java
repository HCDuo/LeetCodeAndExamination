package com.剑指_Offer.秋招.图的广度优先搜索;

import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @project Learning
 * @date 2024/1/12 14:28:35
 */
public class 单词接龙 {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> visited = new HashSet<>();
        Set<String> cnt = new HashSet<>(wordList);
        int wordListSize = cnt.size();
        if (!cnt.contains(endWord)){
            return 0;
        }
        int step = 2;
        Queue<String> queue = new ArrayDeque<>();
        queue.add(beginWord);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                for (int j = 0 ; j < wordListSize ; j++ ){
                    String mid = wordList.get(j);
                    if (cur != null && !visited.contains(mid) && isOneEditAway(mid, cur)) {
                        visited.add(mid);
                        if (Objects.equals(mid, endWord)){
                            return step;
                        }
                        queue.add(wordList.get(j));
                    }
                }
            }
            step++;
        }
        return 0;
    }
    public static boolean isOneEditAway(String s1, String s2) {
        // 长度差大于1，直接返回false
        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        }
        int differences = 0; // 记录不相同字符的数量
        // 遍历两个字符串，比较对应位置的字符
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) != s2.charAt(j)) {
                differences++;
                if (differences > 1) {
                    return false; // 不相同字符数量超过1，直接返回false
                }
                i++;
                j++;
            } else {
                i++;
                j++;
            }
        }
        return differences == 1;
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        System.out.println(ladderLength(beginWord,endWord,wordList));
    }
}
