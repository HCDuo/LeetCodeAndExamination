package com.剑指_Offer.春招;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/4/12 19:27
 */
public class 罗马数字转整数 {
    public int romanToInt(String s) {
        int sum = 0;
        int prenum = getvalue(s.charAt(0));
        for (int i = 1; i < s.length();i++){
            int nownum = getvalue(s.charAt(i));
            if (prenum < nownum) {
                sum -= prenum;
            }else {
                sum += prenum;
            }
            prenum = nownum;
        }
        sum += prenum;
        return sum;
    }

    public int getvalue(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
