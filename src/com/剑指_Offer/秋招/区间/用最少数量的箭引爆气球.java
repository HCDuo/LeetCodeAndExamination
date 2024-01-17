package com.剑指_Offer.秋招.区间;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @project Learning
 * @date 2024/1/17 11:17:12
 */
public class 用最少数量的箭引爆气球 {
    public int findMinArrowShots(int[][] points) {
        if (points == null) {
            return 0;
        }
        if (points.length == 1) {
            return 1;
        }
        int count = 0;
        Arrays.sort(points, Comparator.comparingInt(arr -> arr[0]));
//        Arrays.sort(points, new Comparator<int[]>() {
//            public int compare(int[] points1, int[] points2) {
//                return points1[0] - points2[0];
//            }
//        });
//        没处理好边界值[[-2147483646,-2147483645],[2147483646,2147483647]]
//        为什么？
//        这里不能使用lambda表达式进行排序，因为i[1] - j[1]会出现越界问题。
//        比如p1[1]=-10，p2[1]=2147483647，p1[1]-p2[1]就会超过Integer.MIN_VALUE，
//        所以可以用三目的比较替代Arrays.sort(points, (p1, p2) -> p1[1] < p2[1] ? -1 : 1);
//        解决方案：1.使用匿名内部类，重写compare方法 2.将points转为long类型
        List<int[]> list = new ArrayList<>();
        int left = points[0][0];
        int right = points[0][1];
        for (int i = 1; i < points.length; i++) {
           if(right >= points[i][0]) {
               left = points[i][0];
               if (right > points[i][1] ){
                   right = points[i][1];
               }
           } else {
               list.add(new int[]{left, right});
               left = points[i][0];
               right = points[i][1];
           }
        }
        list.add(new int[]{left, right});
        count = list.size();
        return count;
    }

    public static void main(String[] args) {
        用最少数量的箭引爆气球 solution = new 用最少数量的箭引爆气球();
        int[][] points = {
                {-2147483646, -2147483645},
                {2147483646, 2147483647}
        };
        int result = solution.findMinArrowShots(points);
         System.out.println(result); // 输出：2
    }
}
