package com.剑指_Offer.秋招.区间;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @project Learning
 * @date 2024/1/17 10:36:51
 */
public class 插入区间 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (newInterval == null){
            return intervals;
        }
        int left = newInterval[0];
        int right = newInterval[1];
        boolean placed = false;
        List<int[]> ansList = new ArrayList<int[]>();
        for (int[] interval : intervals){
            if (interval[0] > right){
                if (!placed){
                    ansList.add(new int[]{left, right});
                    placed = true;
                }
                ansList.add(interval);
            } else if (interval[1] < left) {
                ansList.add(interval);
            }else {
                left = Math.min(left,interval[0]);
                right = Math.max(right,interval[1]);
            }
        }
        if (!placed){
            ansList.add(new int[]{left,right});
        }
        int[][] ans = new int[ansList.size()][2];
        for (int i = 0; i < ansList.size(); ++i) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }
}
