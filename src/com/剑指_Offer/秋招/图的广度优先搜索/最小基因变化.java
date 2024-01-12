package com.剑指_Offer.秋招.图的广度优先搜索;

import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @project Learning
 * @date 2024/1/11 23:39:39
 */
public class 最小基因变化 {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> visited = new HashSet<>();
        Set<String> cnt = new HashSet<>(Arrays.asList(bank));
        int step = 1;
        char[] chars = {'A','C','G','T'};
        if (startGene.equals(endGene)){
            return 0;
        }
        if (!cnt.contains(endGene)){
            return -1;
        }
        Queue<String> queue= new ArrayDeque<>();
        queue.add(startGene);
        visited.add(startGene);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                for (int j = 0; j < 8; j++) {
                    for (int k = 0; k < 4; k++) {
                        if (cur != null && chars[k] != cur.charAt(j)) {
                            StringBuilder sb = new StringBuilder(cur);
                            sb.setCharAt(j,chars[k]);
                            String curr = sb.toString();
                            if (cnt.contains(curr)&&!visited.contains(curr)) {
                                if (curr.equals(endGene)){
                                    return step;
                                }
                                queue.add(curr);
                                visited.add(curr);
                            }

                        }
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
