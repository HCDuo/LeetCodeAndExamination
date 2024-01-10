package 笔试;

import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/11/16 9:21
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 读取输入字符串
        String str = scanner.next();
        int len = str.length();
        int count = 0;
        int left_g;
        int right_r;
        // 统计字符串中 'G' 的个数
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'G') {
                count++;
            }
        }
        for (int i = 0; i < len; i++) {
            left_g = 0;
            right_r = 0;
            // 统计左侧 'G' 的个数
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == 'G') {
                    left_g++;
                }
            }
            // 统计右侧 'R' 的个数
            for (int j = i; j < len; j++) {
                if (str.charAt(j) == 'R') {
                    right_r++;
                }
            }
            // 更新 count
            if ((left_g + right_r) < count) {
                count = left_g + right_r;
            }
        }
        System.out.println(count);
    }
}
