package com.剑指_Offer.秋招.数组字符串;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/10/2 13:58
 */
public class N字形变换 {
    public String convert(String s, int numRows) {
        if (numRows<2) return s;
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        int flag = -1;
        int i = 0;
        for (int j = 0; j < numRows; j++) {
            rows.add(new StringBuilder());
        }
        for (char c: s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows -1) flag = -flag;
            i += flag;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        return String.valueOf(result);
    }
}
